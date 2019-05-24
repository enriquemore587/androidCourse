package com.enriquemore587.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etQuim;
    private EditText etCalc;
    private EditText etInv;
    private EditText etSis;
    private TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.etQuim = (EditText) findViewById(R.id.TXT_QUIM);
        this.etCalc = (EditText) findViewById(R.id.TXT_CALC);
        this.etInv = (EditText) findViewById(R.id.TXT_INVE);
        this.etSis = (EditText) findViewById(R.id.TXT_SISTE);
        this.tvMsg = (TextView) findViewById(R.id.TXT_MESSAGE);
    }

    // Este metodo realiza calculo de promedio
    public void calculo(View view) {

        Double promedio = Double.parseDouble(this.etCalc.getText().toString()) + Double.parseDouble(this.etSis.getText().toString()) + Double.parseDouble(this.etInv.getText().toString()) + Double.parseDouble(this.etQuim.getText().toString());
        promedio = promedio / 4;
        String msg = promedio < 7 ? "REPROBADO CALIFICACIÓN DE " : "APROBADO CALIFICACIÓN DE ";

        this.tvMsg.setText(msg + promedio.toString());
    }
}
