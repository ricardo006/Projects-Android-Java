package com.example.appaula02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/* Exercício 02 - Ricardo Oliveira
* No aplicativo desenvolvido em sala, acrescente um ícone. Crie a ação de voltar a tela anterior.
Trabalhe a transição de tela com o button.
* */

public class MainActivity extends Activity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(), "onCreate método chamado", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SegundaActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart método chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart método chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume método chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause método chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onPause método chamado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy método chamado", Toast.LENGTH_SHORT).show();
    }
}
