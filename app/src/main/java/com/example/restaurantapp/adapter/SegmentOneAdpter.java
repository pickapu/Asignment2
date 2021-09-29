package com.example.restaurantapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.databinding.ItemSegmentOneBinding;
import com.example.restaurantapp.dataclass.Segments;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SegmentOneAdpter extends RecyclerView.Adapter<SegmentOneAdpter.ViewHolderSegmentOne> {
    Context context;
    ArrayList<Segments> item;

    public SegmentOneAdpter(Context context, ArrayList<Segments> item) {
        this.context = context;
        this.item = item;
    }

    @NonNull
    @Override
    public ViewHolderSegmentOne onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_segment_one, parent, false);

        ViewHolderSegmentOne viewHolder = new ViewHolderSegmentOne(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderSegmentOne holder, int position) {
        Segments data= item.get(position);
        holder.tvSegmentOne.setText(data.getName());
        holder.tvSegmentOne.setBackgroundResource(data.getImage());
        holder.llSegmentOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    static class ViewHolderSegmentOne extends RecyclerView.ViewHolder{
       TextView tvSegmentOne;
       LinearLayout llSegmentOne;
        public ViewHolderSegmentOne(@NonNull View itemView) {
            super(itemView);
            this.tvSegmentOne=itemView.findViewById(R.id.tvSegmentOne);
            this.llSegmentOne=itemView.findViewById(R.id.llSegmentOne);


        }
    }
}
