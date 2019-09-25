package ir.amirduzandeh.barmanews.datamodel;

import android.support.annotation.DrawableRes;

/**
 * Created by Dozandeee on 28/03/17.
 */

public class NewsAgency {

    public static final int ID_Recode_Agency_Adtivity = 0;
    public static final int ID_ABC_AU_Agency_Adtivity = 1;
    public static final int ID_Espn_Agency_Adtivity = 2;
    public static final int ID_T3n_Agency_Adtivity = 3;
    public static final int ID_Polygon_Agency_Adtivity = 4;
    public static final int ID_Tech_Radar_Agency_Adtivity = 5;
    public static final int ID_MTV_Agency_Adtivity = 6;
    public static final int ID_CNN_Agency_Adtivity = 7;
    public static final int ID_FFT_Agency_Adtivity = 8;
    public static final int ID_CNBN_Agency_Adtivity = 9;
    public static final int ID_The_Verge_Agency_Adtivity = 10;
    public static final int ID_Bloomberg_Agency_Adtivity = 11;
    public static final int ID_Wired_Agency_Adtivity = 12;
    public static final int ID_Business_Insider_Agency_Adtivity = 13;
    public static final int ID_Associated_Press_Agency_Adtivity = 14;
    public static final int ID_Guardian_Agency_Adtivity = 15;
    public static final int ID_Hiffington_Agency_Adtivity = 16;
    public static final int ID_National_Geographic_Agency_Adtivity = 17;
    public static final int ID_Reuters_Agency_Adtivity = 18;
    public static final int ID_The_Hindu_Agency_Adtivity = 19;
    public static final int ID_The_LAD_Bible_Agency_Adtivity = 20;
    public static final int ID_The_Telegraph_Agency_Adtivity = 21;

    private int Agency_Id;
    private String Agency_Title;
    private String Agency_Source;
    @DrawableRes
    private int Agency_Logo;
    private Class Destiniation_Activity;

    public int getAgency_Id() {
        return Agency_Id;
    }

    public void setAgency_Id(int agency_Id) {
        Agency_Id = agency_Id;
    }

    public String getAgency_Title() {
        return Agency_Title;
    }

    public void setAgency_Title(String agency_Title) {
        Agency_Title = agency_Title;
    }

    public int getAgency_Logo() {
        return Agency_Logo;
    }

    public void setAgency_Logo(int agency_Logo) {
        Agency_Logo = agency_Logo;
    }

    public Class getDestiniation_Activity() {
        return Destiniation_Activity;
    }

    public void setDestiniation_Activity(Class destiniation_Activity) {
        Destiniation_Activity = destiniation_Activity;
    }

    public String getAgency_Source() {
        return Agency_Source;
    }

    public void setAgency_Source(String agency_Source) {
        Agency_Source = agency_Source;
    }
}
