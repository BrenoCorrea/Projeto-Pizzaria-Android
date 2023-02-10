package com.example.pizzaria;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;



@Database(entities = {Bebida.class}, version = 1)
public abstract class BancoBebidas extends RoomDatabase {

    public abstract DaoBebida getDaoBebida();

    private static BancoBebidas INSTANCE;


    public static BancoBebidas getBaseBebida(Context context) {
        if (INSTANCE == null) {
            synchronized (BancoBebidas.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), BancoBebidas.class, "DadosBebida").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }

}

