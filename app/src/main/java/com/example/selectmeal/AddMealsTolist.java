package com.example.selectmeal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AddMealsTolist extends AppCompatActivity {
EditText inp;
Button addbtn;
ArrayList<String> pakwans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meals_tolist);
        inp=findViewById(R.id.pakwan);
        addbtn=findViewById(R.id.addbtn);
        pakwans=new ArrayList<String>();
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(String.valueOf(inp.getText()).isEmpty())
                {
                    //do nothing or display msg to enter pakwan
                }
                else{
                    pakwans.add(String.valueOf(inp.getText()));
                }
            }
        });
    }
}