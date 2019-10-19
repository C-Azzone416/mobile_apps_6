package edu.ualr.recyclerviewassignment.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import edu.ualr.recyclerviewassignment.R;
import edu.ualr.recyclerviewassignment.model.Item;
import edu.ualr.recyclerviewassignment.model.SectionHeader;
import edu.ualr.recyclerviewassignment.viewholder.DeviceViewHolder;
import edu.ualr.recyclerviewassignment.model.Device;
import edu.ualr.recyclerviewassignment.viewholder.SectionHeaderViewHolder;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter{
    private static final int DEVICE_VIEW = 0;
    private static final int SECTION_VIEW = 1;

    private List<Item> mItems;
    private Context mContext;

    private AdapterView.OnItemClickListener mOnItemClickListener;


    public interface OnItemClickListener {
        void onItemClick(View view, Device obj, int position);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mOnItemClickListener = (AdapterView.OnItemClickListener) mItemClickListener;
    }

    public RecyclerViewAdapter(Context context, List<Item> items) {
        this.mItems = items;
        this.mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder vh = null;
        View itemView = null;
        switch (viewType) {
            case (DEVICE_VIEW):
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.device_layout, parent, false);
                vh = new DeviceViewHolder(itemView);
                break;
            case (SECTION_VIEW):
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.device_section, parent, false);
                vh = new SectionHeaderViewHolder(itemView);
                break;
        }

      return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Item item = mItems.get(position);

        if (holder instanceof DeviceViewHolder) {
           DeviceViewHolder viewHolder = (DeviceViewHolder) holder;
            Device device = (Device) item;
            viewHolder.deviceName.setText(device.getName());

        } else {
            // Instance of SectionHeaderViewHolder
            SectionHeaderViewHolder viewHolder = (SectionHeaderViewHolder) holder;
            SectionHeader section = (SectionHeader) item;
            viewHolder.label.setText(section.getLabel());
        }

    }

    @Override
    public int getItemCount() {
        return this.mItems.size();
    }
}



