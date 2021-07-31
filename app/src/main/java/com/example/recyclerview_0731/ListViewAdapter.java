package com.example.recyclerview_0731;

import android.util.Log;
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
        this.list = list;
    }

    @Override
    public int getCount() {
        Log.d("Tag","getcount가 호출됨");
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

        //xml 인플레이트 하는과정
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_text,viewGroup,false);

        //findviewbyid 과정
        TextView itemText = itemView.findViewById(R.id.item_text);

        //현위치 데이터 뽑아서 아이템뷰에 적용하는 과정
        String data = list.get(i);
        itemText.setText(data);

        return itemView;
    }
}
