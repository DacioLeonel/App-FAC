package com.example.ads052dacio;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class CriarAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_aluno);
    }

    public void cadastarAlunoBtn(View view){
        System.out.println("Olá. voce clicou no Botão Cadastrar.");
    }


}
