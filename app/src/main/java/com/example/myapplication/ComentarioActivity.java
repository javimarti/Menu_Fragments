package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ComentarioActivity extends Activity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comentario_activity);
        Button button = (Button) findViewById(R.id.button_enviar);
        TextView email = (TextView) findViewById(R.id.email);
        TextView nombre = (TextView) findViewById(R.id.nombre);
        TextView comentario = (TextView) findViewById(R.id.comentario);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                new SendMail(email.getText().toString(), nombre.getText().toString(),comentario.getText().toString()).execute();
            }
        });
    }
}