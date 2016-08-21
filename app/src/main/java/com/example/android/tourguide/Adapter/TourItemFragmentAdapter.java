package com.example.android.tourguide.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.tourguide.Fragment.TabFourFragment;
import com.example.android.tourguide.Fragment.TabOneFragment;
import com.example.android.tourguide.Fragment.TabThreeFragment;
import com.example.android.tourguide.Fragment.TabTwoFragment;
import com.example.android.tourguide.R;

/**
 * Created by samue_000 on 8/16/2016.
 */
public class TourItemFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[]{
            "Historic Sites",
            "Restaurants",
            "Entertainment",
            "Parks"
    };

    public TourItemFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
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
