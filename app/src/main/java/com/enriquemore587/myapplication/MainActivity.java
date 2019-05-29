package com.enriquemore587.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ListView listView;
    private String[] nombres = new String[5];
    private String[] edades = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.nombres[0] = "JOSE";
        this.edades[0] = "12";

        this.nombres[1] = "ENRIQUE";
        this.edades[1] = "14";

        this.nombres[2] = "LUZ";
        this.edades[2] = "20";

        this.nombres[3] = "JORGE";
        this.edades[3] = "22";

        this.nombres[4] = "MARIANA";
        this.edades[4] = "24";

        this.textView = (TextView) findViewById(R.id.tv1);
        this.listView = (ListView) findViewById(R.id.lb1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_enriquemore587, this.nombres);
        this.listView.setAdapter(adapter);
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(String.format("Usuario %s, tiene: %s", listView.getItemAtPosition(position), edades[position]));
            }
        });
    }

}
