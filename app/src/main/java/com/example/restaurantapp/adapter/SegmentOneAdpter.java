package com.example.restaurantapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.databinding.ItemSegmentOneBinding;
import com.example.restaurantapp.dataclass.Segments;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SegmentOneAdpter extends RecyclerView.Adapter<SegmentOneAdpter.ViewHolder> {
    Context context;
    ArrayList<Segments> item;

    public SegmentOneAdpter(Context context, ArrayList<Segments> item) {
        this.context = context;
        this.item = item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_segment_one, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Segments data= item.get(position);
        holder.tvSegmentOne.setText(data.getName());
        holder.tvSegmentOne.setBackgroundResource(data.getImage());

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
       TextView tvSegmentOne;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvSegmentOne=itemView.findViewById(R.id.tvSegmentOne);


        }
    }
}
