package edu.ualr.recyclerviewassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import java.util.List;

import edu.ualr.recyclerviewassignment.adapter.RecyclerViewAdapter;
import edu.ualr.recyclerviewassignment.data.DataGenerator;
import edu.ualr.recyclerviewassignment.model.Device;



public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView(){
        int size = 7;
        List<Device> items = DataGenerator.getDevicesDataset(size);
        items.addAll(DataGenerator.getDevicesDataset(size));
        items.addAll(DataGenerator.getDevicesDataset(size));

    }

}
