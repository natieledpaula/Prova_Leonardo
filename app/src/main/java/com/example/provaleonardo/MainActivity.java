package com.example.provaleonardo;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName, editTextCodigo, editTextPreco, editTextQuantidade;
    private ProdutoDao produtoDao;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextCodigo = findViewById(R.id.editTextCodigo);
        editTextPreco = findViewById(R.id.editTextPreco);
        editTextQuantidade = findViewById(R.id.edittextQuantidade);

        Button btnSalvar = findViewById(R.id.btnSalvar);
        Button btnLista = findViewById(R.id.btnLista);

        ProdutoDatabase db = Room.databaseBuilder(
                getApplication(), ProdutoDatabase.class, "produto-db").allowMainThreadQueries().build();

        produtoDao = db.produtoDao();

        btnSalvar.setOnClickListener( v -> {
            Log.d("MainActivity", "Botão salvar clicando");

            String nome = editTextName.getText().toString().trim();
            String codigo = editTextCodigo.getText().toString().trim();
            String preco = editTextPreco.getText().toString().trim();
            String quatidade = editTextQuantidade.getText().toString().trim();
        });
    }

}