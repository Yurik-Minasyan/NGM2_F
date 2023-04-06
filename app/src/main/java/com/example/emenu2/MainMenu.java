package com.example.emenu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
//    public void box(View view){
//        Intent i = new Intent(MainMenu.this, Boxoqner.class);
//        startActivity(i);
//    }
    public void snack(View view){
        Intent i = new Intent(MainMenu.this, naxutest.class);
        startActivity(i);
    }
    public void salad(View view){
        Intent i = new Intent(MainMenu.this, Salad.class);
        startActivity(i);
    }
    public void drink(View view){
        Intent i = new Intent(MainMenu.this, Drint.class);
        startActivity(i);
    }
    public void junk_food(View view){
        Intent i = new Intent(MainMenu.this, Fast_Food.class);
        startActivity(i);
    }

}