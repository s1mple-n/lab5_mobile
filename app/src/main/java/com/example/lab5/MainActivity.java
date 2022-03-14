package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
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

        list.add(new Food(R.mipmap.donut_yellow,"Tasty Donut","Spicy tasty donut family",10.00));
        list.add(new Food(R.mipmap.tasty_donut,"Pink Donut","Spicy tasty donut family",20.00));
        list.add(new Food(R.mipmap.green_donut,"Floating Donut","Spicy tasty donut family",30.00));
        list.add(new Food(R.mipmap.donut_red,"Tasty Donut","Spicy tasty donut family",40.00));

        FoodAdapter adapter = new FoodAdapter(this,R.layout.custom_listview,list);
        lv.setAdapter(adapter);

        EditText edt = findViewById(R.id.edt);
        List<Food> list1 = new ArrayList<>();

        edt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String name = edt.getText().toString();
                list1.clear();
                for (int j = 0; j < list.size(); j++) {
                    if(list.get(j).getName().equalsIgnoreCase(name))
                        list1.add(list.get(j));

                }
                if(!list1.isEmpty())
                    adapter.setListfood(list1);
                else adapter.setListfood(list);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }
}