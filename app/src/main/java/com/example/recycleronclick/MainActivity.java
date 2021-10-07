package com.example.recycleronclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.recycleronclick.databinding.ActivityMainBinding;
import com.example.recycleronclick.rv_normal_book.NormalActivity;
import com.example.recycleronclick.rv_onclick_bundle_data.BandleActivity;
import com.example.recycleronclick.rv_with_binding.MainBinding;
import com.example.recycleronclick.single_select.SelectorActivity;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.normal.setOnClickListener(v -> {
            startActivity(new Intent(this , NormalActivity.class));
        });

        binding.binding.setOnClickListener(v -> {
            startActivity(new Intent(this , MainBinding.class));
        });

        binding.bandle.setOnClickListener(v -> {
            startActivity(new Intent(this , BandleActivity.class));
        });

        binding.singleSelect.setOnClickListener(v -> {
            startActivity(new Intent(this , SelectorActivity.class));
        });

        binding.normal.setOnClickListener(v -> {
            startActivity(new Intent(this , NormalActivity.class));
        });

    }
}