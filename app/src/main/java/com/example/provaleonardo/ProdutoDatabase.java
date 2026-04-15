package com.example.provaleonardo;

import android.content.Context;

import androidx.room.Database;

public class ProdutoDatabase {
    @Database(entities = {Produto.class}, version 1)

    public abstract class ProdutoDatabase INSTANCE;
    public abstract ProdutoDao produtoDao();

    public static synchronized ProdutoDatabase getInstance(Context context) {
        if(INSTANCE == null) {
            INSTACE = Room.fatabsebuilder(context.getApplicationContext(), ProdutoDatabase.class, "produto-database".fallbackToDestructiveMigration().allowMainThreadQueries().builder());
        }
    }
}
