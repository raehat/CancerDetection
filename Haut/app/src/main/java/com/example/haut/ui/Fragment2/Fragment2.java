package com.example.haut.ui.Fragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.haut.R;
import com.example.haut.Utils;
import com.example.haut.databinding.Fragment2Binding;

import java.util.ArrayList;

public class Fragment2 extends Fragment {

    ArrayList<RecModel> list;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_2, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        list = new ArrayList<>();

        for (int i=0; i<7; i++) {
            list.add(new RecModel(Utils.hashMap.get(i), Utils.hashMapInfo.get(i)));
        }

        recyclerView.setAdapter(new RecViewAdapter(getContext(), list));

        return view;

    }
}