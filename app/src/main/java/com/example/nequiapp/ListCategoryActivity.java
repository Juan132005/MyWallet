package com.example.nequiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListCategoryActivity extends AppCompatActivity {
    private ArrayList<Categoria> listCategorias= new ArrayList<>();
    private RecyclerView rvCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_category);
        loadFakeDataCat();
        rvCategory=findViewById(R.id.rv_category);
        CategoryAdapter myAdapter2= new CategoryAdapter(listCategorias);
        rvCategory.setAdapter(myAdapter2);
        rvCategory.setLayoutManager(new LinearLayoutManager(ListCategoryActivity.this));
    }
    private void loadFakeDataCat(){
        Categoria cat1= new Categoria("Restaurante", "Es un restaurante","#FF0000","https://img.freepik.com/vector-premium/conjunto-ilustracion-comida-rapida-dibujos-animados_530597-17.jpg?w=2000");
        Categoria cat2= new Categoria("Gasolina","Esta cara"," #00913f","https://www.eltiempo.com/files/article_main_1200/uploads/2022/09/30/633745d4a6248.jpeg");
        Categoria cat3=new Categoria("Arriendo","Es un gasto necesario","#0000FF","https://images.adsttc.com/media/images/5d34/e507/284d/d109/5600/0240/large_jpg/_FI.jpg?1563747560");
        listCategorias.add(cat1);
        listCategorias.add(cat2);
        listCategorias.add(cat3);
    }

}