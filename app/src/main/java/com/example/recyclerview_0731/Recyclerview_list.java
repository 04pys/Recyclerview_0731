package com.example.recyclerview_0731;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Recyclerview_list extends AppCompatActivity {

    List<String> list = new ArrayList<>();
    RecyclerView recyclerView;
    private RecyclerViewListAdapter recyclerViewListAdapter;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_list);

        recyclerView = findViewById(R.id.recyclerviewlist);
        add = findViewById(R.id.buttonadd);

        recyclerViewListAdapter = new RecyclerViewListAdapter(new MyDiffUtil());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewListAdapter);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add("추가된 아이템");
            }
        });

    }
}