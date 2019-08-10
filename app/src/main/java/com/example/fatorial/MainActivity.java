package com.example.fatorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Botao_On_Click(View v){
        EditText editText  = (EditText)findViewById(R.id.Numero);
        int n = Integer.parseInt(editText.getText().toString());
        int valor = (new Fat(n).Fatoria(n));
        Toast.makeText(this , String.valueOf(valor),Toast.LENGTH_LONG).show();
    }
}
