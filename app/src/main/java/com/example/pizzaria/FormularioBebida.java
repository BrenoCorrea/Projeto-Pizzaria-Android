package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormularioBebida extends AppCompatActivity {
        EditText id,descricao,tamanho,preco;
        Button gravarb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_bebida);
        id= findViewById(R.id.edtidB);
        descricao= findViewById(R.id.edtdescricaoB);
        tamanho= findViewById(R.id.edttamanhoB);
        preco= findViewById(R.id.edtprecoB);
        gravarb=findViewById(R.id.btgravarB);
        gravarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fp= new Intent(getApplicationContext(),DadosBebida.class);
                fp.putExtra("Id", id.getText().toString());
                fp.putExtra("descricao", descricao.getText().toString());
                fp.putExtra("tamanho", tamanho.getText().toString());
                fp.putExtra("preco", preco.getText().toString());
                startActivity(fp);
                gravarB();
            }
        });
    }



    public void gravarB(){
        Intent fp= new Intent(getApplicationContext(),DadosBebida.class);
        fp.putExtra("Id",id.getText().toString());
        fp.putExtra("tamanho",tamanho.getText().toString());
        fp.putExtra("preco",preco.getText().toString());
        startActivity(fp);
        Bebida b = new Bebida();
        b.setTamanho(tamanho.getText().toString());
        b.setPreco(Float.parseFloat(preco.getText().toString()));
        BancoBebidas.getBaseBebida(this).getDaoBebida().inserir(b);

        }
}


