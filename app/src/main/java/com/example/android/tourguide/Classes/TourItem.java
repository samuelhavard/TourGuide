package com.example.android.tourguide.Classes;

/**
 * Created by samue_000 on 8/16/2016.
 */
public class TourItem {

    private String mTitle;
    private String mAddress;

    public TourItem(String title , String address) {
        mTitle = title;
        mAddress = address;
    }

    public String getTourTitle() {
        return mTitle;
    }

    public String getAddress() {
        return mAddress;
    }
}
