package com.example.recyclerview_0731;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button List;
    Button RecyclerViewBase;
    Button RecyclerViewList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List = findViewById(R.id.list);
        RecyclerViewBase = findViewById(R.id.recyclerview_base);
        RecyclerViewList = findViewById(R.id.recyclerview_list);

        List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent1);
            }
        });
        RecyclerViewBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,Recyclerview_base.class);
                startActivity(intent2);
            }
        });
        RecyclerViewList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this,Recyclerview_list.class);
                startActivity(intent3);
            }
        });
    }
}