package com.example.recyclerviewexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//layput manager urus di sini
    ArrayList<Food> foodArrayList;
    RecyclerView fooddRv;
    FoodAdapter foodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Food foodYomi1 = new Food("Yomi sama", R.drawable.vesperbell_yomi);
        Food foodKasuka2 = new Food("Kasuka chaann", R.drawable.vesperbell_kasuka);
        Food foodYomi3 = new Food("Yomi sama", R.drawable.vesperbell_yomi);
        Food foodKasuka4 = new Food("Kasuka chaann", R.drawable.vesperbell_kasuka);

        fooddRv = findViewById(R.id.foods_rv);
        foodArrayList = new ArrayList<>();

        foodArrayList.add(foodKasuka2);
        foodArrayList.add(foodYomi1);
        foodArrayList.add(foodKasuka4);
        foodArrayList.add(foodYomi3);

        //linear layout manager
        //grid layout manager
        //staggered grid layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);

        foodAdapter = new FoodAdapter(this, foodArrayList);
        fooddRv.setLayoutManager(linearLayoutManager);
        fooddRv.setAdapter(foodAdapter);
    }
}