package com.example.restaurantapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.R;

public class SegmentTwoAdapter extends RecyclerView.Adapter<SegmentTwoAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_segment_two, parent, false);

        SegmentOneAdpter.ViewHolder viewHolder2 = new SegmentOneAdpter.ViewHolder(listItem);
        return viewHolder2;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
