package com.example.recyclerview_0731;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    List<String> list = new ArrayList<>();
    ListView listView;
    Button addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listview);
        addButton = findViewById(R.id.buttonadd);

        list.clear();
        list.add("1 - 첫번쨰");
        list.add("2 - 두번쨰");
        list.add("3 - 세번쨰");

        ListViewAdapter adapter = new ListViewAdapter(list);
        listView.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add("추가된 아이템");
                adapter.notifyDataSetChanged();
            }
        });

    }
}