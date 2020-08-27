package com.example.myapplication.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import com.example.myapplication.model.Hotel;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder>{

    private List<Hotel> hotelList;

    public Context context;

    public class HotelViewHolder extends RecyclerView.ViewHolder {

        public TextView name, city, desc;

        public HotelViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.txtHotelName);
            city = view.findViewById(R.id.txtCity);
            desc = view.findViewById(R.id.txtDesc);

        }
    }

    public HotelAdapter(List<Hotel> productList, Context context) {
        this.context = context;
        this.hotelList = productList;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hotel_content, parent, false);

        return new HotelViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {

        Hotel hotel = hotelList.get(position);
        holder.name.setText(hotel.getHotelName());
        holder.city.setText(hotel.getCity());
        holder.desc.setText(hotel.getDescription());

    }

    @Override
    public int getItemCount() {
        return hotelList.size();
    }

}
