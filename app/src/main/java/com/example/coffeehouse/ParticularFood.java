package com.example.coffeehouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ParticularFood extends AppCompatActivity {

    public static final String EXTRA_FOODID = "foodId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.particular_food);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int foodId = (Integer)getIntent().getExtras().get(EXTRA_FOODID);
        Food food = Food.dessert[foodId];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(food.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(food.getDescription());


        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());

    }
}
