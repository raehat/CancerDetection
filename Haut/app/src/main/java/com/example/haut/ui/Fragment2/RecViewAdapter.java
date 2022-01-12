package com.example.haut.ui.Fragment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.haut.R;

import java.util.ArrayList;

public class RecViewAdapter extends RecyclerView.Adapter<RecViewModel> {

    Context context;
    ArrayList<RecModel> list;

    public RecViewAdapter(Context context, ArrayList<RecModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.card_view_rec, parent, false);
        return new RecViewModel(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecViewModel holder, int position) {

        holder.textViewHeading.setText(list.get(position).getHeading());
        holder.textViewAbout.setText(list.get(position).getAbout());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
