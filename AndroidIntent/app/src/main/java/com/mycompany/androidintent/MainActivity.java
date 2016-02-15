package com.mycompany.androidintent;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {
    private EditText oper1, oper2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oper1 = (EditText) findViewById(R.id.editText);
        oper2 = (EditText) findViewById(R.id.editText2);
    }

    public void sumar(View v) {
        double n1 = Double.parseDouble(oper1.getText().toString());
        double n2 = Double.parseDouble(oper2.getText().toString());
        double suma = n1 + n2;
        mostrar(suma);
    }
    public void restar(View v){
        double n1 = Double.parseDouble(oper1.getText().toString());
        double n2 = Double.parseDouble(oper2.getText().toString());
        double resta = n1 - n2;
        mostrar(resta);
    }
    public void multiplicar(View v){
        double n1 = Double.parseDouble(oper1.getText().toString());
        double n2 = Double.parseDouble(oper2.getText().toString());
        double multiplicacion = n1 * n2;
        mostrar(multiplicacion);
    }
    public void dividir(View v){
        double n1 = Double.parseDouble(oper1.getText().toString());
        double n2 = Double.parseDouble(oper2.getText().toString());
        double division = n1 / n2;
        mostrar(division);
    }
    private void mostrar(double res){
        Toast.makeText(this, "Resultado operación: " + res, Toast.LENGTH_LONG).show();
    }

}
