package com.example.restaurantapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.dataclass.OrderDetails;
import com.example.restaurantapp.dataclass.PreviousOrder;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PreviousOrderAdapter extends RecyclerView.Adapter<PreviousOrderAdapter.ViewHolderPreviousOrder> {
    Context context;
ArrayList<PreviousOrder> item;



    @NonNull
    @Override
    public ViewHolderPreviousOrder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_previous_order, parent, false);
        PreviousOrderAdapter.ViewHolderPreviousOrder viewHolder = new PreviousOrderAdapter.ViewHolderPreviousOrder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPreviousOrder holder, int position) {
        PreviousOrder data=item.get(position);
        holder.tvDate.setText(data.getDate());
        holder.tvOrderId.setText(data.getOrderId());
        holder.tvPrice.setText(data.getTotalPrice()+"");
        holder.tvViewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

}

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ViewHolderPreviousOrder extends RecyclerView.ViewHolder {
          TextView tvDate;
          TextView tvOrderId;
          TextView tvPrice;
          TextView tvViewOrder;
        public ViewHolderPreviousOrder(@NonNull View itemView) {
            super(itemView);
            this.tvDate=itemView.findViewById(R.id.tvDateTime);
            this.tvOrderId=itemView.findViewById(R.id.tvOrderId);
            this.tvPrice=itemView.findViewById(R.id.tvPrice);
            this.tvViewOrder=itemView.findViewById(R.id.tvViewOrder);

        }
    }
}