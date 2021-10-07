package com.example.recycleronclick.rv_with_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.recycleronclick.R;
import com.example.recycleronclick.databinding.ActivityMainBindingBinding;
import com.example.recycleronclick.rv_with_binding.AdapterBinding;
import com.example.recycleronclick.rv_with_binding.DataBinding;

import java.util.ArrayList;
import java.util.List;

public class MainBinding extends AppCompatActivity {
    ActivityMainBindingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_binding);
        rv();
    }

    private void rv() {
        AdapterBinding adapter;
        List<DataBinding> list = new ArrayList<>();

        list.add(new DataBinding("ahmed" , R.drawable.ic_brush));
        list.add(new DataBinding("eslam" , R.drawable.ic_brush));
        list.add(new DataBinding("mahmoud" , R.drawable.ic_heart));
        list.add(new DataBinding("mohamed" , R.drawable.ic_brush));

        adapter = new AdapterBinding(list , this);
        binding.rv.setLayoutManager(new LinearLayoutManager(this));
        binding.rv.setAdapter(adapter);


    }
}