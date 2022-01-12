package com.example.haut.ui.Fragment2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.haut.R;

import org.w3c.dom.Text;

public class RecViewModel extends RecyclerView.ViewHolder {

    TextView textViewHeading;
    TextView textViewAbout;

    public RecViewModel(@NonNull View itemView) {
        super(itemView);

        textViewHeading = itemView.findViewById(R.id.text_view_heading);
        textViewAbout = itemView.findViewById(R.id.text_view_about);

    }
}
