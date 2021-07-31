package com.example.recyclerview_0731;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recyclerview_base extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_base);

        recyclerView = findViewById(R.id.recyclerviewbase);

        list.clear();
        list.add("1 - 첫번쨰");
        list.add("2 - 두번쨰");
        list.add("3 - 세번쨰");

        recyclerView.setAdapter(new RecyclerViewAdapter(list));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}