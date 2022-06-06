package com.example.recycleviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String [] arr= {"item1","item2","item3","item4","item5","item6","item7","item8","item9","item11","item12","item13",
            "item14","item15","item16","item17","item18","item19","item20"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c= new CustomAdapter(arr);
        recyclerView.setAdapter(c);
    }
}