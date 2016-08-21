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
 * A {@link Fragment} that shows information on Tab One.
 */
public class TabOneFragment extends Fragment {

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

        //Tour item information to be displayed on Tab One
        tourItems.add(new TourItem("Home of Franklin D. Roosevelt National Historic Site",
                "Address: 4097 Albany Post Rd, Hyde Park, NY 12538"));
        tourItems.add(new TourItem("Vanderbilt Mansion National Historic Site",
                "Address: 119 Vanderbilt Park Rd, Hyde Park, NY 12538"));
        tourItems.add(new TourItem("Staatsburgh State Historic Site",
                "Address: 75 Mills Mansion 6 Road, Staatsburg, NY 12580"));
        tourItems.add(new TourItem("Pollepel Island / Bannermans' Castle",
                "Location: Pollepel Island, Newburgh, New York"));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), tourItems, R.color.HistoricSitesPrimary);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }
}
