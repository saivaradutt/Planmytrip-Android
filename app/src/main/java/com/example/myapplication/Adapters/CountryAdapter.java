package com.example.myapplication.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.HotelData;
import com.example.myapplication.HotelMainActivity;
import com.example.myapplication.R;
import com.example.myapplication.mainscreen;
import com.example.myapplication.model.Country;

import java.util.List;

import static androidx.core.content.ContextCompat.startActivity;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.HotelViewHolder>{

    private List<Country> countryList;

    private Context context;

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
    public void onBindViewHolder(@NonNull final HotelViewHolder holder, int position) {

        Country country = countryList.get(position);
        holder.productImage.setImageResource(country.getImageName());
        //holder.productImage.setImageResource(HotelData.getImageID(country.getImageName()));
        holder.name.setText(country.getCountryName());
        //holder.city.setText(country.getCity());
        holder.desc.setText(country.getCountryDescription());

        holder.productImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, HotelMainActivity.class);
                intent.putExtra("countryName", holder.name.getText().toString());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }


}
