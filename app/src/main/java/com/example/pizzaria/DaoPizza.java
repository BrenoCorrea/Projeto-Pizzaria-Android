package com.example.pizzaria;
import androidx.room.Dao;
import androidx.room.Insert;




   @Dao
public abstract class DaoPizza {
    @Insert
    public abstract long inserir(Pizza p);
}
