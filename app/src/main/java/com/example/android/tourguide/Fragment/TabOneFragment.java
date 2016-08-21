package com.example.android.tourguide.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguide.Adapter.ItemAdapter;
import com.example.android.tourguide.Classes.TourItem;
import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * A {@link Fragment} that shows information on Tab One.
 */
public class TabOneFragment extends Fragment {

    /**
     * @param inflater           is the layout inflater
     * @param container          is the ViewGroup
     * @param savedInstanceState is the Bundle for re-creating the fragment
     * @return rootView as the View
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<TourItem> tourItems = new ArrayList<>();

        //Tour item information to be displayed on Tab One
        tourItems.add(new TourItem(getString(R.string.historic_Site_one),
                getString(R.string.historic_site_address_one),
                R.drawable.fdr3));
        tourItems.add(new TourItem(getString(R.string.historic_Site_two),
                getString(R.string.historic_site_address_two),
                R.drawable.vanderbilt));
        tourItems.add(new TourItem(getString(R.string.historic_Site_three),
                getString(R.string.historic_site_address_three),
                R.drawable.staatsburgh));
        tourItems.add(new TourItem(getString(R.string.historic_Site_four),
                getString(R.string.historic_site_address_four),
                R.drawable.bannermans_castle_pollepel_island));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), tourItems, R.color.historic_sites_primary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }
}
