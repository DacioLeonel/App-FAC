package com.example.ads052dacio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class CriarAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_aluno);
    }

    public void cadastarAlunoBtn(View view){
        Intent i= new Intent(this,ListaAlunosActivity.class);
        startActivity(i);
    }
    



}
