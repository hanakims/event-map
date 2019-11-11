package com.example.eventfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

public class EventList extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private String[] eventNames;
    RecyclerView.LayoutManager layoutManager;

    public EventList()
    {
        eventNames = new String[]{"Taco Tuesday", "Wacky Wednesday", "Funky Friday"};
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the view to the list of events
        setContentView(R.layout.event_display);
        //Creating a recycler view
        recyclerView = (RecyclerView) findViewById(R.id.event_list);

        //Using linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Specifies adapter
        mAdapter = new MyAdapter(eventNames);
        recyclerView.setAdapter(mAdapter);
    }
}
