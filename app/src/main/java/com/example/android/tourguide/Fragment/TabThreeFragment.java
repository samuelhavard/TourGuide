package com.example.android.tourguide.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<TourItem> tourItems = new ArrayList<>();

        //Tour item information to be displayed on Tab Three
        tourItems.add(new TourItem(getString(R.string.entertainment_one),
                getString(R.string.entertainment_address_one)));
        tourItems.add(new TourItem(getString(R.string.entertainment_two),
                getString(R.string.entertainment_address_two)));
        tourItems.add(new TourItem(getString(R.string.entertainment_three),
                getString(R.string.entertainment_address_three)));
        tourItems.add(new TourItem(getString(R.string.entertainment_four),
                getString(R.string.entertainment_address_four)));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), tourItems, R.color.EntertainmentPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }
}
