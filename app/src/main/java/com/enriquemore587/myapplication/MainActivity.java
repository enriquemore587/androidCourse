package com.enriquemore587.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText et1, et2;
    private TextView tv;

    private String[] opciones = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.et1 = (EditText) findViewById(R.id.TXT_PRIMER_VALOR);
        this.et2 = (EditText) findViewById(R.id.TXT_SEGUNDO_VALOR);
        this.tv = (TextView) findViewById(R.id.TXT_MESSAGE);
        this.spinner = (Spinner) findViewById(R.id.spinner1);
        this.opciones[0] = "SUMAR";
        this.opciones[1] = "RESTAR";
        this.opciones[2] = "MULTIPLICAR";
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item_enriquemore587, opciones);

        this.spinner.setAdapter(adapter);
    }

    public void calcular(View view) {
        Integer valor1 = Integer.parseInt(this.et1.getText().toString());
        Integer valor2 = Integer.parseInt(this.et2.getText().toString());
        String itemSelected = this.spinner.getSelectedItem().toString();
        if (itemSelected.equals(this.opciones[0])) {
            Integer resultado = valor1 + valor2;
            this.tv.setText(String.format("Resultado: %s", String.valueOf(resultado)));
        } else if (itemSelected.equals(this.opciones[1])) {
            Integer resultado = valor1 - valor2;
            this.tv.setText(String.format("Resultado: %s", String.valueOf(resultado)));
        } else if (itemSelected.equals(this.opciones[2])) {
            Integer resultado = valor1 * valor2;
            this.tv.setText(String.format("Resultado: %s", String.valueOf(resultado)));
        }
    }

}
