package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DadosPizza extends AppCompatActivity {
    TextView id,nome,ingredientes,tamanho,preco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_pizza);
        id= findViewById(R.id.txtidP);
        nome=findViewById(R.id.txtnomeP);
        ingredientes=findViewById(R.id.txtingredientesP);
        tamanho= findViewById(R.id.txttamanhoP);
        preco= findViewById(R.id.txtprecoP);

        Intent obj=getIntent();
        id.setText(obj.getStringExtra("id"));
        nome.setText(obj.getStringExtra("nome"));
        ingredientes.setText(obj.getStringExtra("ingredientes"));
        preco.setText(obj.getStringExtra("preco"));

    }
}