package edu.ualr.recyclerviewassignment.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import edu.ualr.recyclerviewassignment.R;
import edu.ualr.recyclerviewassignment.viewholder.DeviceViewHolder;
import edu.ualr.recyclerviewassignment.model.Device;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter{

    private List<Device> mDevice;
    private Context mContext;


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder vh = null;
        View deviceView = null;
        deviceView = LayoutInflater.from(parent.getContext()).inflate(R.layout.device_layout, parent, false);
        vh = new DeviceViewHolder(deviceView);

      return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

/*
public class SectionHeaderViewHolder extends RecyclerView.ViewHolder {

    public TextView label;

    public SectionHeaderViewHolder(@NonNull View itemView) {
        super(itemView);
        this.label = itemView.findViewById(R.id.title_section);
    }
}*/
