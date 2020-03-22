package com.example.nutriisystem;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;



import android.os.Bundle;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }


        public void INGRESAR(View view){
        Intent ingresar = new Intent(this, PedidosYStock.class);
        startActivity(ingresar);

        }




        {







}
}


