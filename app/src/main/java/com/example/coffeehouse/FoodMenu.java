package com.example.coffeehouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Food.dessert);


        ListView listFood = (ListView)findViewById(R.id.listFood);
        listFood.setAdapter (listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listFood, View itemView, int position, long id) {
                Intent intent = new Intent(FoodMenu.this, ParticularFood.class);
                intent.putExtra(ParticularFood.EXTRA_FOODID, (int) id);
                startActivity(intent);
            }
        };

        listFood.setOnItemClickListener(itemClickListener);


    }
}
