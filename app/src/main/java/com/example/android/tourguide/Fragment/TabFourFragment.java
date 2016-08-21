package com.example.android.tourguide.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.tourguide.Adapter.ItemAdapter;
import com.example.android.tourguide.Classes.TourItem;
import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * A {@link Fragment} that shows information on Tab Four.
 */
public class TabFourFragment extends Fragment {


    public TabFourFragment() {
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

        //Tour item information to be displayed on Tab Four
        tourItems.add(new TourItem("Clarence Fahnestock State Park",
                "Address: 1498 Route 301 Carmel, New York"));
        tourItems.add(new TourItem("Breakneck Ridge",
                "Location: Philipstown / Fishkill, New York, U.S."));
        tourItems.add(new TourItem("Sylvan Lake",
                "Location: Sylvan Lake, New York, United States"));
        tourItems.add(new TourItem("Esopus Meadows Light",
                "Location: West side of Hudson River, Esopus, New York"));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), tourItems, R.color.ParksPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }
}
