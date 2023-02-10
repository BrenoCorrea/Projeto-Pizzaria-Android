package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DadosBebida extends AppCompatActivity {
    TextView id,descricao,tamanho,preco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_bebida);
        id=findViewById(R.id.txtidB);
        descricao=findViewById(R.id.txtdescricaoB);
        tamanho=findViewById(R.id.txttamanhoB);
        preco=findViewById(R.id.txtprecoB);

        Intent obj=getIntent();
        id.setText(obj.getStringExtra("id"));
        descricao.setText(obj.getStringExtra("descricao"));
        tamanho.setText(obj.getStringExtra("tamanho"));
        preco.setText(obj.getStringExtra("preco"));

    }
}