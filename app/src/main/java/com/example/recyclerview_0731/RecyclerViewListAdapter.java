package com.example.recyclerview_0731;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewListAdapter extends ListAdapter<String, RecyclerViewListAdapter.ViewHolder> {

    public RecyclerViewListAdapter(@NonNull DiffUtil.ItemCallback<String> diffCallback){
        super(diffCallback);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_text, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewListAdapter.ViewHolder holder, int position) {
        holder.itemText.setText(getItem(position));
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView itemText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemText = itemView.findViewById(R.id.item_text);

        }
    }
}
