package com.example.provaleonardo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        });

            String nome = editTextName.getText().toString().trim();
            String codigo = editTextCodigo.getText().toString().trim();
            String preco = editTextPreco.getText().toString().trim();
            String quantidade = editTextQuantidade.getText().toString().trim();

        if (nome.isEmpty() || codigo.isEmpty() | precoStr.isEmpty() || quantidade.isEmpty()){
            Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!preco.matches("^\\d+(\\.\\d{1,2})?$")) {
            Toast.makeText(this, "Preço inválido! Use até 2 casas decimais.", Toast.LENGTH_SHORT).show();
            return;
        }

        double preco = Double.parseDouble(precoStr);
        if (preco <= 0) {
            Toast.makeText(this, "Preço deve ser positivo!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!quantidade.matches("^\\d+$")) {
            Toast.makeText(this, "Quantidade inválida!", Toast.LENGTH_SHORT).show();
            return;
        }

        Produto product = new Produto();
        product.nome = nome;
        product.codigo = codigo;
        product.preco = preco;
        product.quantidade = quantidade;

        produtoDao.inserir(product);

        Log.d("MainActivity", "Produto salvo com sucesso");

        Toast.makeText(this, "Produto cadastrado", Toast.LENGTH_SHORT).show();

        editTextName.setText("");
        editTextCodigo.setText("");
        editTextPreco.setText("");
        editTextQuantidade.setText("");

        btnLista.setOnClickListener(v -> startActivities(new Intent(MainActivity.this, ListaActivity.class)));
        });
    }

}