package com.example.pizzaria;
import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;



@Database(entities = {Pizza.class}, version = 1)
public abstract class BancoDados extends RoomDatabase {

    public abstract DaoPizza getDaoPizza();

    private static BancoDados INSTANCE;


    public static BancoDados getBasePizza(Context context) {
        if (INSTANCE == null) {
            synchronized (BancoDados.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), BancoDados.class, "DadosPizza").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }

}
