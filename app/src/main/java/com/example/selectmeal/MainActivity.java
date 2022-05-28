package com.example.selectmeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button addMeals;
    Button GetList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addMeals=findViewById(R.id.addMeals);
        GetList=findViewById(R.id.MealsList);
        addMeals.setOnClickListener(this);
        GetList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.addMeals:
                Intent intent= new Intent(MainActivity.this,AddMealsTolist.class);
                startActivity(intent);
                break;
            case R.id.MealsList:
                Intent intent2= new Intent(MainActivity.this,Mealslist.class);
                startActivity(intent2);
                break;

        }
    }
}