package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Food food = (Food) getIntent().getSerializableExtra("food");

        ImageView imv = findViewById(R.id.imvfood2);
        TextView tvname = findViewById(R.id.tvname1);
        TextView tvde = findViewById(R.id.tvde);
        TextView tvpri = findViewById(R.id.tvpri);

        imv.setImageResource(food.getId());
        tvname.setText(food.getName());
        tvde.setText(food.getDecription());
        tvpri.setText("$"+food.getPrice());



    }
}