package com.example.lucasnascimento.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    private static final String TAG = "Activity2";
    private ArrayList<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Lucas","1234"));
        usuarios.add(new Usuario("Antonio","5678"));

        Log.d(TAG, "onCreate: usuario: " +usuarios.get(0).getNome());
    }
}
