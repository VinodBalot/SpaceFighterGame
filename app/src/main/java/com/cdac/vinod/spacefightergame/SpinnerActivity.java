
package com.cdac.vinod.spacefightergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    String arr [] = {"A","B","C","D"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinnerlayout);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(SpinnerActivity.this, android.R.layout.simple_spinner_dropdown_item, arr);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(SpinnerActivity.this, ""+spinner.getAdapter().getItem(i), Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
