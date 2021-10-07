package com.example.recycleronclick.single_select;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleronclick.R;
import com.example.recycleronclick.databinding.RvSingleSelectBinding;

import java.util.ArrayList;
import java.util.List;

public class AdapterSingle extends RecyclerView.Adapter<AdapterSingle.Holder> {
    List<DataSinglSelect> list = new ArrayList<>();
    int select = -1;

    private void selected(int adapterPosition) {
        if (adapterPosition == RecyclerView.NO_POSITION) return;
        notifyDataSetChanged();
        select = adapterPosition;
    }

    public AdapterSingle(List<DataSinglSelect> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()) , R.layout.rv_single_select, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.binding.setData(list.get(position));
        holder.binding.img.setImageResource(list.get(position).getImg());

        holder.binding.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected(holder.getAdapterPosition());
            }
        });


        if (select == position) {
            holder.binding.selector.setVisibility(View.VISIBLE);
        } else {
            holder.binding.selector.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class Holder extends RecyclerView.ViewHolder {
        RvSingleSelectBinding binding;
        public Holder(@NonNull RvSingleSelectBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
