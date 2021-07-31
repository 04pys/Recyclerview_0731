package com.example.recyclerview_0731;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    List<String> list;
    public ListViewAdapter(List<String> list) {
        super();

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_text,viewGroup,false);

        TextView itemText = itemView.findViewById(R.id.item_text);

        String data = list.get(i);
        itemText.setText(data);


        return itemView;
    }
}
