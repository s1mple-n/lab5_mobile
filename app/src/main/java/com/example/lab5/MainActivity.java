package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private List<Food> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listview);
        list=new ArrayList<>();

        list.add(new Food(1,"Tasty Donut","Spicy tasty donut family",10.00));
        list.add(new Food(2,"Pink Donut","Spicy tasty donut family",20.00));
        list.add(new Food(3,"Floating Donut","Spicy tasty donut family",30.00));
        list.add(new Food(4,"Tasty Donut","Spicy tasty donut family",40.00));

        FoodAdapter adapter = new FoodAdapter(this,R.layout.custom_listview,list);
        lv.setAdapter(adapter);
    }
}