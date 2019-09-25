package ir.amirduzandeh.barmanews;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import ir.amirduzandeh.barmanews.datamodel.NewsAgency;
import ir.amirduzandeh.barmanews.view.activity.NewsActivity;

/**
 * Created by Dozandeee on 28/03/17.
 */

public class DataGenerator {
    public static List<NewsAgency> getNewsAgency(Context context){
        List<NewsAgency> NEWS_Agencies = new ArrayList<>();

        NewsAgency NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Recode_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.Recode_Agency));
        NEWS_Agency.setAgency_Logo(R.drawable.recode_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("recode");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_ABC_AU_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.ABC_Au_Agency));
        NEWS_Agency.setAgency_Logo(R.drawable.abc_au_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("abc-news-au");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Espn_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.Espn_Agency));
        NEWS_Agency.setAgency_Logo(R.drawable.espn_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("espn");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_T3n_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.T3n_Agency));
        NEWS_Agency.setAgency_Logo(R.drawable.t3n_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("t3n");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Polygon_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.Polygon_Agency));
        NEWS_Agency.setAgency_Logo(R.drawable.polygon_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("polygon");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Tech_Radar_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.TechRadar_Agency));
        NEWS_Agency.setAgency_Logo(R.drawable.tech_radar_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("techradar");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_MTV_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.MTV_Agency));
        NEWS_Agency.setAgency_Logo(R.drawable.mtv_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("mtv-news");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_CNN_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.CNN));
        NEWS_Agency.setAgency_Logo(R.drawable.cnn_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("cnn");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_FFT_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.FFT));
        NEWS_Agency.setAgency_Logo(R.drawable.fft_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("four-four-two");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_CNBN_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.CNBN));
        NEWS_Agency.setAgency_Logo(R.drawable.cnbn_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("cnbn");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_The_Verge_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.The_Verge));
        NEWS_Agency.setAgency_Logo(R.drawable.the_verge_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("the-verge");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Bloomberg_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.Bloomberg));
        NEWS_Agency.setAgency_Logo(R.drawable.bloomberg_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("bloomberg");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Wired_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.Wired));
        NEWS_Agency.setAgency_Logo(R.drawable.wired_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("wired-de");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Business_Insider_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.Business_Insider));
        NEWS_Agency.setAgency_Logo(R.drawable.business_insider_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("business-insider");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Associated_Press_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.Associated_Press));
        NEWS_Agency.setAgency_Logo(R.drawable.associated_press_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("associated-press");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Guardian_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.Guardian));
        NEWS_Agency.setAgency_Logo(R.drawable.guardian_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("the-guardian-uk");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Hiffington_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.Hiffington));
        NEWS_Agency.setAgency_Logo(R.drawable.hiffington_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("the-huffington-post");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_National_Geographic_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.National_Geographic));
        NEWS_Agency.setAgency_Logo(R.drawable.national_geographic_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("national-geographic");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_Reuters_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.Reuters));
        NEWS_Agency.setAgency_Logo(R.drawable.reuters_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("reuters");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_The_Hindu_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.The_Hindu));
        NEWS_Agency.setAgency_Logo(R.drawable.the_hindu_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("the-hindu");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_The_LAD_Bible_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.The_LAD_Bible));
        NEWS_Agency.setAgency_Logo(R.drawable.the_ladbible_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("the-lad-bible");
        NEWS_Agencies.add(NEWS_Agency);

        NEWS_Agency = new NewsAgency();
        NEWS_Agency.setAgency_Id(NewsAgency.ID_The_Telegraph_Agency_Adtivity);
        NEWS_Agency.setAgency_Title(context.getString(R.string.The_Telegraph));
        NEWS_Agency.setAgency_Logo(R.drawable.the_telegraph_logo);
        NEWS_Agency.setDestiniation_Activity(NewsActivity.class);
        NEWS_Agency.setAgency_Source("the-telegraph");
        NEWS_Agencies.add(NEWS_Agency);

        return NEWS_Agencies;
    }
}
