package com.example.provaleonardo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Produto {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nome;
    public String codigo;
    public double preco;
    public int quantidade
}
