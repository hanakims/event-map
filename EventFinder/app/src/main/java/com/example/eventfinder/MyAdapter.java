package com.example.eventfinder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String[] myEventNames;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public MyViewHolder(TextView v) {
            super(v);

            textView = v.findViewById(R.id.recycler_row);
        }
    }

    //Provide a constructor (change for event data)
    public MyAdapter(String[] eventNames) {
        myEventNames = eventNames;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Create new view (invoked by layout manager)

        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    //Replace contents of view (invoked by layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get event at this position
        // - replace contents of view with that event
        holder.textView.setText(myEventNames[position]);
    }


    //Return number of events
    @Override
    public int getItemCount() {
        return myEventNames.length;
    }
}
