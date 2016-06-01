package com.mycompany.acategoria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbPruebaOpenHelper.init(this);
        //DbPruebaOpenHelper.getInstance().insertCategoria("Cateogoria 1");
        //DbPruebaOpenHelper.getInstance().insertCategoria("Cateogoria 2");
        //DbPruebaOpenHelper.getInstance().insertCategoria("Cateogoria 3");

        List<Categoria> categorias = DbPruebaOpenHelper.getInstance().getCategorias();

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter <Categoria> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                categorias
        );

        listView.setAdapter(arrayAdapter);
    }
}
