/*
* Autor: Victor Antonio Barbosa Silva
* Última atualização: 08/01/2017
*/
package com.example.victor.ap3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        TextView txt = (TextView) findViewById(R.id.txt);
        txt.setText(bundle.getString("result"));
    }
}
