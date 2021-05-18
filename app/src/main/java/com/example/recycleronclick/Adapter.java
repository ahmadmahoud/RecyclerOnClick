package com.example.recycleronclick;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    ArrayList<Data> personal;
    Context context;
    Onclicker onclicker;

    public Adapter(ArrayList<Data> personal, Context context, Onclicker onclicker) {
        this.personal = personal;
        this.context = context;
        this.onclicker = onclicker;
    }

    class Holder extends RecyclerView.ViewHolder {
        MaterialButton listView;
        Onclicker onclicker;
        TextView TextView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            listView = itemView.findViewById(R.id.list);
            TextView = itemView.findViewById(R.id.view);
        }

    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler, parent, false);
        return new Holder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull final Holder holder, final int position) {
        final Data person = personal.get(position);
        holder.listView.setText(person.getText());

        holder.listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onclicker.onClick(position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return personal.size();
    }
}
