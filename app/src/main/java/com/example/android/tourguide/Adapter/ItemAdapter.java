package com.example.android.tourguide.Adapter;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.Classes.TourItem;
import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * Created by samue_000 on 8/16/2016.
 */
public class ItemAdapter extends ArrayAdapter<TourItem> {
    private int mBackgroundColor;

    public ItemAdapter(Activity context, ArrayList<TourItem> items, int colorResource) {
        super(context, 0, items);
        mBackgroundColor = colorResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TourItem currentItem = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentItem.getTourTitle());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentItem.getAddress());

        ImageView icon = (ImageView) listItemView.findViewById(R.id.icon_image_view);

        if (currentItem.hasImage()) {
            icon.setImageResource(currentItem.getImageResource());
            icon.setVisibility(View.VISIBLE);
        } else {
            icon.setVisibility(View.GONE);
        }

        View listContainer = listItemView.findViewById(R.id.list_container);
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        listContainer.setBackgroundColor(color);

        return listItemView;
    }
}
