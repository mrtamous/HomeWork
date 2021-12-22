package com.example.homework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework.Adapter_Old_Status;
import com.example.homework.Old_Statues;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity {
    RecyclerView list;
    Adapter_Old_Status adapter;
    Button btn_add_record,btn_add_food;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        list = findViewById(R.id.list);
        btn_add_record = findViewById(R.id.btn_add_record);
        btn_add_food = findViewById(R.id.btn_add_food);

        ArrayList<Old_Statues> models = new ArrayList<>();
        models.add(new Old_Statues("20/1/2020","60 Kg","170 Cm"));
        models.add(new Old_Statues("20/1/2020","60 Kg","170 Cm"));
        models.add(new Old_Statues("20/1/2020","60 Kg","170 Cm"));
        list.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter_Old_Status(models, this);
        list.setAdapter(adapter);

        btn_add_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Activity.this, Add_Record_activity.class);
                startActivity(intent);
            }
        });



        btn_add_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Activity.this, Add_Food_DetailsActivity.class);
                startActivity(intent);
            }
        });


    }
}