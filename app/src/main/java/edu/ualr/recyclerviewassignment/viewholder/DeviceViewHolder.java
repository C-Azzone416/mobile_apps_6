package edu.ualr.recyclerviewassignment.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Date;

import edu.ualr.recyclerviewassignment.R;
import edu.ualr.recyclerviewassignment.model.Device;

public class DeviceViewHolder extends RecyclerView.ViewHolder {
    public ImageView deviceImage;
    public TextView deviceName;
    public View lyt_parent;
    public ImageView connection_button;
    public Date timeStamp;
    public TextView status_text;

    public DeviceViewHolder(@NonNull View v) {
        super(v);
        deviceImage = v.findViewById(R.id.icon);
        deviceName = v.findViewById(R.id.device_name);
        lyt_parent = v.findViewById(R.id.lyt_parent);
        connection_button = v.findViewById(R.id.connection_button);
        status_text = v.findViewById(R.id.status_text);

    }


    public void setDeviceAttributes(Device device){

        deviceName.setText(device.getName());

        switch(device.getDeviceType()) {
            case Laptop:
                deviceImage.setImageResource(R.drawable.ic_laptop);
                break;
            case Desktop:
                deviceImage.setImageResource(R.drawable.ic_pc);
                break;
            case SmartTV:
                deviceImage.setImageResource(R.drawable.ic_tv);
                break;
            case Tablet:
                deviceImage.setImageResource(R.drawable.ic_tablet_android);
                break;
            case Smartphone:
                deviceImage.setImageResource(R.drawable.ic_phone_android);
                break;
            case GameConsole:
                deviceImage.setImageResource(R.drawable.ic_gameconsole);
                break;
            case Unknown:
                deviceImage.setImageResource(R.drawable.ic_unknown_device);
                break;
        }


        switch(device.getDeviceStatus()) {
            case Connected:
                connection_button.setImageResource(R.drawable.ic_btn_disconnect);
                break;
            case Ready:
                connection_button.setImageResource(R.drawable.ic_btn_connect);
                break;
            case Linked:
                connection_button.setImageResource(R.drawable.ic_connection_btn);
                break;
        }

        timeStamp = device.getLastConnection();

        if(device.getDeviceStatus() == Device.DeviceStatus.Connected){
            status_text.setText(R.string.currently_connected);
        }
        else if(timeStamp != null){
            status_text.setText(R.string.recently);
        }
        else{
            status_text.setText(R.string.never_connected);
        }
    }

}
