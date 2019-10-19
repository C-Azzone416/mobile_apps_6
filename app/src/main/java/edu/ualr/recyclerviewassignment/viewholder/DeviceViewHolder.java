package edu.ualr.recyclerviewassignment.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import edu.ualr.recyclerviewassignment.R;

public class DeviceViewHolder extends RecyclerView.ViewHolder {
    public ImageView deviceImage;
    public TextView deviceName;
    public View lyt_parent;

    public DeviceViewHolder(@NonNull View v) {
        super(v);
        deviceImage = v.findViewById(R.id.icon);
        deviceName = v.findViewById(R.id.device_name);
        lyt_parent = v.findViewById(R.id.lyt_parent);

    }
}
