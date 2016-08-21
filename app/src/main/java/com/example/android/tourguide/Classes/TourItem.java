package com.example.android.tourguide.Classes;

/**
 * TourItem is a Class used to hold the data for a specific site of interest that is displaed in
 * on a fragment via the ItemAdapter Class.
 */
public class TourItem {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mTitle;
    private String mAddress;
    private int mImageResource = NO_IMAGE_PROVIDED;

    public TourItem(String title, String address) {
        mTitle = title;
        mAddress = address;
    }

    public TourItem(String title, String address, int image) {
        mTitle = title;
        mAddress = address;
        mImageResource = image;
    }

    public String getTourTitle() {
        return mTitle;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public boolean hasImage() {
        return mImageResource != NO_IMAGE_PROVIDED;
    }
}
