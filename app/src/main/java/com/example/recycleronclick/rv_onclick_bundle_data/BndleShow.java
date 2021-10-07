package com.example.recycleronclick.rv_onclick_bundle_data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.recycleronclick.R;
import com.example.recycleronclick.databinding.ActivityBndleShowBinding;

public class BndleShow extends AppCompatActivity {
    ActivityBndleShowBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_bndle_show);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key_string");
            int img = extras.getInt("key_img");
            binding.tv.setText(value);
            binding.img.setImageResource(img);
        }

    }
}