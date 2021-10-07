package com.example.recycleronclick.rv_onclick_bundle_data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.recycleronclick.R;
import com.example.recycleronclick.databinding.ActivityBandleBinding;
import com.example.recycleronclick.rv_normal_book.AdapterNormal;
import com.example.recycleronclick.rv_normal_book.Data;
import com.example.recycleronclick.rv_with_binding.DataBinding;

import java.util.ArrayList;
import java.util.List;

public class BandleActivity extends AppCompatActivity implements ClickTab{
    ActivityBandleBinding binding;
    List<DataBinding> list = new ArrayList<>();
    AdapterBandle adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_bandle);

        list.add(new DataBinding("Geecoders" , R.drawable.ic_brush));
        list.add(new DataBinding("Test" , R.drawable.ic_heart));
        list.add(new DataBinding("Ahmed" , R.drawable.ic_brush));
        list.add(new DataBinding("R" , R.drawable.ic_brush));
        list.add(new DataBinding("تجربة" , R.drawable.ic_brush));

        adapter = new AdapterBandle(list, this,this);
        binding.rv.setLayoutManager(new LinearLayoutManager(this));
        binding.rv.setAdapter(adapter);


    }

    @Override
    public void onClick(int position) {
        Intent intent = new Intent(this , BndleShow.class);
        intent.putExtra("key_string" , list.get(position).getText());
        intent.putExtra("key_img" , list.get(position).getImg());
        startActivity(intent);
    }
}