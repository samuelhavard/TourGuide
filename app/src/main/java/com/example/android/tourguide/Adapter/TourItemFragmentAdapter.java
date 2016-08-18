package com.example.android.tourguide.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguide.Fragment.TabFourFragment;
import com.example.android.tourguide.Fragment.TabOneFragment;
import com.example.android.tourguide.Fragment.TabThreeFragment;
import com.example.android.tourguide.Fragment.TabTwoFragment;

/**
 * Created by samue_000 on 8/16/2016.
 */
public class TourItemFragmentAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[]{
            "Historic Sites",
            "Restaurants",
            "Entertainment",
            "Parks"
    };

    public TourItemFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TabOneFragment();
            case 1:
                return new TabTwoFragment();
            case 2:
                return new TabThreeFragment();
            case 3:
                return new TabFourFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
