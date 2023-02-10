package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormularioPizza extends AppCompatActivity {
    EditText id,nome,ingredientes,tamanho,preco;
    Button gravarp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_pizza);
        id = findViewById(R.id.edtidP);
        nome = findViewById(R.id.edtnomeP);
        ingredientes = findViewById(R.id.edtingredientesP);
        tamanho = findViewById(R.id.edttamanhoP);
        preco = findViewById(R.id.edtprecoP);
        gravarp = findViewById(R.id.btgravarP);
        gravarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fp = new Intent(getApplicationContext(), DadosPizza.class);
                fp.putExtra("Id", id.getText().toString());
                fp.putExtra("nome", nome.getText().toString());
                fp.putExtra("ingredientes", ingredientes.getText().toString());
                fp.putExtra("tamanho", tamanho.getText().toString());
                fp.putExtra("preco", preco.getText().toString());
                startActivity(fp);
                        gravarP();
                    }
                });

            }


            public void gravarP() {

                Intent fp = new Intent(getApplicationContext(), DadosPizza.class);
                fp.putExtra("Id", id.getText().toString());
                fp.putExtra("nome", nome.getText().toString());
                fp.putExtra("ingredientes", ingredientes.getText().toString());
                fp.putExtra("tamanho", tamanho.getText().toString());
                fp.putExtra("preco", preco.getText().toString());
                startActivity(fp);
                Pizza p = new Pizza();
                p.setNome(nome.getText().toString());
                p.setIngredientes(ingredientes.getText().toString());
                p.setTamanho(tamanho.getText().toString());
                p.setPreco(Float.parseFloat(preco.getText().toString()));
                BancoDados.getBasePizza(this).getDaoPizza().inserir(p);


            }
        }

