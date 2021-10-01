package com.example.restaurantapp.adapter;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.activties.MainActivity;
import com.example.restaurantapp.activties.OrderConfirmation;

import com.example.restaurantapp.dataclass.SegmentOne;
import com.example.restaurantapp.dataclass.Segments;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SegmentOneAdpter extends RecyclerView.Adapter<SegmentOneAdpter.ViewHolderSegmentOne> {
Context context;
    ArrayList<SegmentOne> item;

    public SegmentOneAdpter(ArrayList<SegmentOne> item,Context context) {
        this.context=context;
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
        SegmentOne data= item.get(position);
        holder.tvSegmentOne.setText(data.getName());

        holder.ivSegmentOne.setImageResource(data.getImage());
        holder.llSegmentOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                 Intent intent=new Intent(context,OrderConfirmation.class);
                intent.putExtra("data",data.getItem());

                 context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    static class ViewHolderSegmentOne extends RecyclerView.ViewHolder{
       TextView tvSegmentOne;
       CardView llSegmentOne;
       ImageView ivSegmentOne;
        public ViewHolderSegmentOne(@NonNull View itemView) {
            super(itemView);
            this.ivSegmentOne=itemView.findViewById(R.id.ivSegmentOne);
            this.tvSegmentOne=itemView.findViewById(R.id.tvSegmentOne);
            this.llSegmentOne=itemView.findViewById(R.id.llSegmentOne);


        }
    }
}
