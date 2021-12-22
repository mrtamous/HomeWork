package com.example.homework;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Add_Food_DetailsActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener{

    String[] c = { " Fruit ", "vegetables", "Protein", "Fat"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fooddetails);

        Spinner sp =  findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(Add_Food_DetailsActivity.this);

        ArrayAdapter ar = new ArrayAdapter(this,android.R.layout.simple_spinner_item, c);
        ar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ar);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), c[position] , Toast.LENGTH_LONG).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
