package com.example.recyclerviewexercise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//bikin viewholder dl baru adapter
public class FoodAdapter extends RecyclerView.Adapter<Viewholder>{

    ArrayList<Food> foodArrayList;
    Context context;

    //food adapter mesti tau conteksny mau d tampilin d mana
    public FoodAdapter(Context context, ArrayList<Food> foodArrayList) {
        this.foodArrayList = foodArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_foods, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Food food = foodArrayList.get(position);
        holder.foodname_tv.setText(food.getFoodName());
        holder.thumbnail_IV.setImageResource(food.getThubmnail());
    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }



}

//viewholder bisa d bikin di file kelas java terpisah, tapi buat yg  d ajarin sendo lb bgs gini
class Viewholder extends RecyclerView.ViewHolder {
    //viewholder buat ambil preference object
    ImageView thumbnail_IV;
    TextView foodname_tv;


    public Viewholder(@NonNull View itemView) {
        super(itemView);
        thumbnail_IV = itemView.findViewById(R.id.thumbnail_iv);
        foodname_tv = itemView.findViewById(R.id.foodname_tv);
    }
}
