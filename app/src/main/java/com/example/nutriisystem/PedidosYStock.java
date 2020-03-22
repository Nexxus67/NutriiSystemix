package com.example.nutriisystem;

import android.content.Context;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import android.os.Bundle;

public class PedidosYStock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos_ystock);

        Context context = getApplicationContext();
        CharSequence text = "Pedir los pollos antes del mediodía!!!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    } public void PEDIDOS(View view) {
        Intent listadepedidos = new Intent (this, listadepedidos.class);
        startActivity(listadepedidos);
    } public void STOCK(View view) {
        Intent stock = new Intent (this, Stock.class);
        startActivity(stock);

    } public void LAVALLE (View view) {
        Intent Lavalle = new Intent (this, Lavalle.class);
        startActivity(Lavalle);
    }

    public void reconquista(View view) {
        Intent reconquista = new Intent(this, reconquista.class);
        startActivity(reconquista);
    }
}


