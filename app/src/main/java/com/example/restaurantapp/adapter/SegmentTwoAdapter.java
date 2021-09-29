package com.example.restaurantapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.dataclass.Segments;

import java.util.ArrayList;

public class SegmentTwoAdapter extends RecyclerView.Adapter<SegmentTwoAdapter.ViewHolder> {
    ArrayList<Segments> item;

    public SegmentTwoAdapter(ArrayList<Segments> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_segment_two, parent, false);
        SegmentTwoAdapter.ViewHolder viewHolder=new SegmentTwoAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Segments data= item.get(position);
        holder.tvSegmentTwo.setText(data.getName());
        holder.tvSegmentTwo.setBackgroundResource(data.getImage());
        holder.llSegmentTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public ArrayList<Segments> getItem() {
        return item;
    }

    public void setItem(ArrayList<Segments> item) {
        this.item = item;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvSegmentTwo;
        LinearLayout llSegmentTwo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvSegmentTwo=itemView.findViewById(R.id.tvSegmentTwo);
            this.llSegmentTwo=itemView.findViewById(R.id.llSegmentTwo);
        }
    }
}
