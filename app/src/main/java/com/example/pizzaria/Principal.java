package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    Button pz,be;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        pz= findViewById(R.id.btcadastrapizza);
        be= findViewById(R.id.btcadastrabebida);
        ChamaPizza();
        ChamaBebida();
    }
    public void ChamaPizza(){
        pz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent pz= new Intent(getApplicationContext(),FormularioPizza.class);
                startActivity(pz);
            }


    });

}
public void ChamaBebida(){
    be.setOnClickListener((new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent be = new Intent(getApplicationContext(),FormularioBebida.class);
            startActivity(be);

        }
    }));
    }
}