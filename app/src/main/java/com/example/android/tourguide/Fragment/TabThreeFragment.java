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
 * A {@link Fragment} that shows information on Tab Three.
 */
public class TabThreeFragment extends Fragment {


    public TabThreeFragment() {
        // Required empty public constructor
    }

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

        //Tour item information to be displayed on Tab Three
        tourItems.add(new TourItem(getString(R.string.entertainment_one),
                getString(R.string.entertainment_address_one),
                R.drawable.clove_creek));
        tourItems.add(new TourItem(getString(R.string.entertainment_two),
                getString(R.string.entertainment_address_two),
                R.drawable.beacon_theater));
        tourItems.add(new TourItem(getString(R.string.entertainment_three),
                getString(R.string.entertainment_address_three),
                R.drawable.bardavon));
        tourItems.add(new TourItem(getString(R.string.entertainment_four),
                getString(R.string.entertainment_address_four),
                R.drawable.the_chance_interior));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), tourItems, R.color.entertainment_primary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }
}
