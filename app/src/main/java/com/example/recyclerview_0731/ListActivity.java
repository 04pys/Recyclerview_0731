package com.example.recyclerview_0731;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    List<String> list = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listview);

        list.clear();
        list.add("1 - 첫번쨰");
        list.add("2 - 두번쨰");
        list.add("3 - 세번쨰");

        ListViewAdapter adapter = new ListViewAdapter(list);
        listView.setAdapter(adapter);


    }
}