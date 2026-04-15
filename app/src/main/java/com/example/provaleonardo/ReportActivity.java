package com.example.provaleonardo;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ReportActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProdutoDao produtoDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        recyclerView = findViewById(R.id.recyclerViewProdutos);

        ProdutoDatabase db = Room.databaseBuilder(
                getApplicationContext(),
                ProdutoDatabase.class,
                "product-db"
        ).allowMainThreadQueries().build();

        produtoDao = db.produtoDao();

        // Buscar dados
        List<Produto> lista = produtoDao.listarTodos();

        // Adapter
        ProdutoAdapter adapter = new ProdutoAdapter(lista);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    // botão voltar (usado no XML)
    public void voltarParaCadastro(View view) {
        finish();
    }
}
