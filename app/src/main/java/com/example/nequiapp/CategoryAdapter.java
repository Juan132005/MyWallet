package com.example.nequiapp;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{
    private ArrayList<Categoria> dataSet2;

    public CategoryAdapter(ArrayList<Categoria> dataSet) {
        this.dataSet2 = dataSet2;
    }
    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView2= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_categoria,parent,false);
        return new ViewHolder(myView2);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        Categoria myCategoria=dataSet2.get(position);
        holder.loadItem2(myCategoria);
    }

    @Override
    public int getItemCount() {
        return dataSet2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_nombre, tv_color,iv_icon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nombre=itemView.findViewById(R.id.tv_nombrecat);
            tv_color=itemView.findViewById(R.id.btn_cat);
            iv_icon=itemView.findViewById(R.id.bg3);
        }
        public void loadItem2(Categoria myCategoria) {
            tv_nombre.setText(myCategoria.getNombre_cat());
            tv_color.setBackgroundColor(Color.parseColor(myCategoria.getColor_cat()));

        }
    }
}
