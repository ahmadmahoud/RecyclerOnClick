package com.example.recycleronclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity implements Onclicker{
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Data> arr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recler_eqtnasa);

        adapter = new Adapter(arr, this,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arr.add(new Data("qwe"));
        arr.add(new Data("sadasd"));
        arr.add(new Data("sadasd"));
        arr.add(new Data("sadasd"));
        arr.add(new Data("sadasd"));
        arr.add(new Data("sadasd"));

        recyclerView.setAdapter(adapter);

    }
    @Override
    public void onClick(int position) {
        arr.get(position);
        Intent i = new Intent(this,ShowMathActivity.class);
        i.putExtra("geecoders",position);
        startActivity(i);
    }
}