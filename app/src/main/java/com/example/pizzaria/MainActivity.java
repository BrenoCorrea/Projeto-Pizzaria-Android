package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.security.Principal;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText login, senha;
    Button logar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.edtlogin);
        senha = findViewById(R.id.edtsenha);
        logar = findViewById(R.id.btlogar);
        LogarSistema();

    login = findViewById(R.id.edtlogin);
    senha = findViewById(R.id.edtsenha);
    logar = findViewById(R.id.btlogar);
    LogarSistema();

}
    public void LogarSistema() {

        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String l = login.getText().toString().trim();
                if (l.equals("") && senha.getText().toString().trim().equals("")) {

                    Intent tprincipal = new Intent(getApplicationContext(), Principal.class);
                    tprincipal.putExtra("Login", login.getText().toString());
                    startActivity(tprincipal);

                } else {
                    Toast.makeText(getApplicationContext(), "DADOS INVÁLIDOS!!!!", Toast.LENGTH_SHORT).show();
                    login.setText("");
                    senha.setText("");
                    login.requestFocus();
                }
            }
        });
    }
}



