package ir.amirduzandeh.barmanews;

import android.content.Context;
import android.util.Log;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import ir.amirduzandeh.barmanews.datamodel.LatestNews;

/**
 * Created by Dozandeee on 27/03/17.
 */

public class ApiService {

    private static final String TAG = "ApiService";
    private Context context;

    public ApiService(Context context){
        this.context = context;
    }

    public void getLatestNews(final OnLatestNewsRecived onLatestNewsRecived, String NewsCo){
        String SortBy = "top";
        String APIKey = "69ce9f53bfc64a3b97d4ffba0ecd2545";
        String URL_Requests = "https://newsapi.org/v1/articles?source="+NewsCo+"&sortBy="+SortBy+"&apiKey="+APIKey ;
        JsonObjectRequest request = new JsonObjectRequest(JsonObjectRequest.Method.GET, URL_Requests, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                List<LatestNews> LatestNEWS = new ArrayList<>();
                Log.i(TAG, "onResponse: "+response.toString());
                try {
                    for(int i = 0 ; i < response.getJSONArray("articles").length() ; i++){
                        LatestNews latestNews = new LatestNews();
                        JSONArray NewsJsonArray = response.getJSONArray("articles");
                        try {
                            JSONObject SingleNews = NewsJsonArray.getJSONObject(i);
                            latestNews.setAuthor( SingleNews.getString("author") );
                            latestNews.setNewsTitle( SingleNews.getString("title") );
                            latestNews.setDescription( SingleNews.getString("description") );
                            latestNews.setNewsURL( SingleNews.getString("url") );
                            latestNews.setNewsImageURL( SingleNews.getString("urlToImage") );
                            latestNews.setPublishDate( SingleNews.getString("publishedAt") );
                            latestNews.setNewsURL(SingleNews.getString("url"));
                            LatestNEWS.add(latestNews);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                onLatestNewsRecived.onRecived(LatestNEWS);
            }
        }, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "onErrorResponse: "+error.toString());
            }
        });

        request.setRetryPolicy(new DefaultRetryPolicy(8000,DefaultRetryPolicy.DEFAULT_MAX_RETRIES,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        RequestQueue Requests_Queue = Volley.newRequestQueue(context);
        Requests_Queue.add(request);
    }

    public interface OnLatestNewsRecived{
        void onRecived(List<LatestNews> LatestNEWS);
    }
}
