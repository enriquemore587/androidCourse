package com.enriquemore587.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tvResultado;
    private RadioButton rbSuma, rbResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.et1 = (EditText) findViewById(R.id.TXT_PRIMER_VALOR);
        this.et2 = (EditText) findViewById(R.id.TXT_SEGUNDO_VALOR);
        this.tvResultado = (TextView) findViewById(R.id.TV_RESULTADO);
        this.rbSuma = (RadioButton) findViewById(R.id.RB_SUMAR);
        this.rbResta = (RadioButton) findViewById(R.id.RB_RESTAR);
    }

    public void calcular(View view) {
        Integer value1 = Integer.parseInt(this.et1.getText().toString());
        Integer value2 = Integer.parseInt(this.et2.getText().toString());
        if (this.rbSuma.isChecked()) {
            Integer resultado = value1 + value2;
            this.tvResultado.setText(String.valueOf(resultado));
        } else if (this.rbResta.isChecked()) {
            Integer resultado = value1 - value2;
            this.tvResultado.setText(String.valueOf(resultado));
        }
    }

}
