package com.example.pizzaria;

import androidx.room.Dao;
import androidx.room.Insert;




@Dao
public abstract class DaoBebida {
    @Insert
    public abstract long inserir(Bebida b);
}