package ir.amirduzandeh.barmanews.datamodel;

/**
 * Created by Dozandeee on 27/03/17.
 */

public class LatestNews {
    private String Source;
    private String Author;
    private String NewsTitle;
    private String Description;
    private String NewsURL;
    private String NewsImageURL;
    private String PublishDate;

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getNewsTitle() {
        return NewsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        NewsTitle = newsTitle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getNewsURL() {
        return NewsURL;
    }

    public void setNewsURL(String newsURL) {
        NewsURL = newsURL;
    }

    public String getNewsImageURL() {
        return NewsImageURL;
    }

    public void setNewsImageURL(String newsImageURL) {
        NewsImageURL = newsImageURL;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }
}
