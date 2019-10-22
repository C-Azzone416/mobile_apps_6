package edu.ualr.recyclerviewassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.LinkedList;
import java.util.List;

import edu.ualr.recyclerviewassignment.adapter.RecyclerViewAdapter;
import edu.ualr.recyclerviewassignment.data.DataGenerator;
import edu.ualr.recyclerviewassignment.model.Device;
import edu.ualr.recyclerviewassignment.model.Item;
import edu.ualr.recyclerviewassignment.model.SectionHeader;


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
        int size = 10;
        List<Item> items = new LinkedList<>();
        items.addAll(DataGenerator.getDevicesDataset(size));

       /* SectionHeader connectedSection = new SectionHeader(getString(R.string.connected));
        SectionHeader readySection = new SectionHeader(getString(R.string.paired));
        SectionHeader linkedSection = new SectionHeader(getString(R.string.linked));

        items.add(connectedSection);
        items.add(readySection);
        items.add(linkedSection);*/

        recyclerView = findViewById(R.id.recyclerView);
        mAdapter = new RecyclerViewAdapter(this, items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
    }



}
