package com.example.recyclerview_0731;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Recyclerview_base extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String> list = new ArrayList<>();
    Button addbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_base);

        recyclerView = findViewById(R.id.recyclerviewbase);
        addbutton = findViewById(R.id.buttonadd);
        list.clear();
        list.add("1 - 첫번쨰");
        list.add("2 - 두번쨰");
        list.add("3 - 세번쨰");

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add("추가된 아이템");
                adapter.notifyItemInserted(list.size() - 1);
            }
        });

    }
}