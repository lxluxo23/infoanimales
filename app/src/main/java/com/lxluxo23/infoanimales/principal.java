package com.lxluxo23.infoanimales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class principal extends AppCompatActivity {


    private ListView lv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        lv1 = (ListView) findViewById(R.id.listview1);

        String[] opciones = {"perro", "gato", "laucha", "loro"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, opciones);

        lv1.setAdapter(adapter);


        lv1.setOnClickListener(new AdapterView.OnClickListener() {

            @Override
            public void onClick(AdapterView, View view, int i, long l) {

                    String mensaje = "selcciono" + lv1.getItemAtPosition(i);
                    Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();


                }

            });


    }
}