package com.example.locationgetter;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class ListBarang extends RecyclerView.Adapter<ListBarang.ListHolder>{

    private Context ctx;
    private List lbarang;

    public ListBarang(Context ctx, List lbarang) {
        this.ctx = ctx;
        this.lbarang = lbarang;
    }

    @NonNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.activity_main , parent, false);
        return new ListHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListHolder holder, int position) {
        Barang brg = lbarang.get(position)
        holder.textView.setText(brg.get);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public ListHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textLocation);
        }
    }
}
