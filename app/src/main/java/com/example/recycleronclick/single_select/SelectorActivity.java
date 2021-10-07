package com.example.recycleronclick.single_select;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.recycleronclick.R;
import com.example.recycleronclick.databinding.ActivitySelectorBinding;

import java.util.ArrayList;

public class SelectorActivity extends AppCompatActivity {
    ActivitySelectorBinding binding ;
    AdapterSingle adapter;
    ArrayList<DataSinglSelect> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_selector);

        data.add(new DataSinglSelect(R.drawable.ic_heart));
        data.add(new DataSinglSelect(R.drawable.ic_heart));
        data.add(new DataSinglSelect(R.drawable.ic_heart));
        data.add(new DataSinglSelect(R.drawable.ic_heart));
        data.add(new DataSinglSelect(R.drawable.ic_heart));

        adapter = new AdapterSingle(data);
        binding.rv.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));
        binding.rv.setAdapter(adapter);

    }
}