package com.example.myapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.HotelData;
import com.example.myapplication.R;
import com.example.myapplication.model.Country;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.HotelViewHolder>{

    private List<Country> countryList;

    public Context context;

    public class HotelViewHolder extends RecyclerView.ViewHolder {

        public TextView name, city, desc;
        public ImageView productImage;
        public HotelViewHolder(View view) {
            super(view);
            productImage = view.findViewById(R.id.product_image);
            name = view.findViewById(R.id.txtHotelName);
            city = view.findViewById(R.id.txtCity);
            desc = view.findViewById(R.id.txtDesc);

        }
    }

    public CountryAdapter(List<Country> productList, Context context) {
        this.context = context;
        this.countryList = productList;
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

        Country country = countryList.get(position);
        holder.productImage.setImageResource(HotelData.getImageID(country.getImageName()));
        holder.name.setText(country.getHotelName());
        holder.city.setText(country.getCity());
        holder.desc.setText(country.getDescription());

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

}
