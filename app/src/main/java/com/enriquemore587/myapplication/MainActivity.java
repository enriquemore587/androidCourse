package com.enriquemore587.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText1 = (EditText) findViewById(R.id.txt_num1);
        this.editText2 = (EditText) findViewById(R.id.txt_num2);
        this.textView = (TextView) findViewById(R.id.txt_resultado);
    }

    // Este metodo realiza suma
    public void suma(View view) {
        String valor1 = this.editText1.getText().toString();
        String valor2 = this.editText2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String resultado = String.format("%s %s", this.textView.getText(), String.valueOf(suma));

        this.textView.setText(resultado);
    }
}
