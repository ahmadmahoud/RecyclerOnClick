package com.example.recycleronclick.rv_onclick_bundle_data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleronclick.R;
import com.example.recycleronclick.databinding.RvBindingBinding;
import com.example.recycleronclick.rv_with_binding.DataBinding;

import java.util.ArrayList;
import java.util.List;

public class AdapterBandle extends RecyclerView.Adapter<AdapterBandle.Holder> {
    List<DataBinding> list = new ArrayList<>();
    Context context;
    ClickTab clickTab;

    public AdapterBandle(List<DataBinding> list, Context context, ClickTab clickTab) {
        this.list = list;
        this.context = context;
        this.clickTab = clickTab;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.rv_binding, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.binding.setData(list.get(position));
        holder.binding.img.setImageResource(list.get(position).getImg());

        holder.binding.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickTab.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class Holder extends RecyclerView.ViewHolder {
        RvBindingBinding binding;

        public Holder(@NonNull RvBindingBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
