/*
* Autor: Victor Antonio Barbosa Silva
* Última atualização: 08/01/2017
*/
package com.example.victor.ap3;
import java.text.DecimalFormat;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.Math;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Tela2.class);
        EditText editText1 = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        Bundle bundle = new Bundle();
        double x,y;
        x=(Double.parseDouble(String.valueOf(editText1.getText()))+Double.parseDouble(String.valueOf(editText2.getText())))*0.3;
        double valor1 = Double.parseDouble(String.valueOf(editText1.getText()));
        double valor2 = Double.parseDouble(String.valueOf(editText2.getText()));
        if (valor1>10||valor2>10){
            Context context = getApplicationContext();
            CharSequence text = "Insira as notas correntamente!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else {
            y = (5 - x) / 0.16;
            DecimalFormat df = new DecimalFormat("0");
            double z = Math.round(y);
            if (y <= 0) {
                bundle.putString("result", "Você já está aprovado!");
            } else if (y > 25) {
                bundle.putString("result", "Você já está reprovado!");
            } else {
                bundle.putString("result", "Você precisa acertar " + df.format(z) + " questões na AP3!");
            }
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
