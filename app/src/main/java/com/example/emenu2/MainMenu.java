package com.example.emenu2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainMenu extends AppCompatActivity {

    SearchView sw;
    ListView lw;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        sw = findViewById(R.id.search);
        lw = findViewById(R.id.list);
        lw.setVisibility(View.GONE);
        array = new ArrayList<>();
        array.add("Մսային նախուտեստներ");//0
        array.add("Պանրի տեսականի");//1
        array.add("Թթուներ");//2
        array.add("Կապարզե");//3
        array.add("Կեսար");//4
        array.add("Բանջարեղենային");//5
        array.add("Կարտոֆիլ ֆրի");//6
        array.add("Հոթ-դոգ բարբիքյու");//7
        array.add("Տավարի մսով բուրգեր");//8
        array.add("Արաբիկա");//9
        array.add("Կապուչինո");//10
        array.add("Լատտե");//11
        array.add("Միկադո");//12
        array.add("Նապոլեոն");//13
        array.add("արամելային միջուկով դոնաթ");//14
        array.add("Закуски");//15
        array.add("Сыры");//16
        array.add("Маринады");//17
        array.add("Капрезе");//18
        array.add("Цезарь");//19
        array.add("Овощной");//20
        array.add("Картофель фри");//21
        array.add("Хот-дог барбекю");//22
        array.add("Бургер с говядиной");//23
        array.add("Арабика");//24
        array.add("Капучино");//25
        array.add("Латте");//26
        array.add("Микадо");//27
        array.add("Наполеон");//28
        array.add("Донат с карамельной начинкой");//29
        array.add("Meat snacks");//30
        array.add("Cheese");//31
        array.add("Marinades");//32
        array.add("Caprese");//33
        array.add("Caesar");//34
        array.add("Vegetable");//35
        array.add("French fries");//36
        array.add("Hot-dog barbeque");//37
        array.add("Beef burger");//38
        array.add("Latte");//39
        array.add("Arabia");//40
        array.add("Cappuccino");//41
        array.add("Coca-Cola");//42
        array.add("Fanta");//43
        array.add("Sprite");//44
        array.add("Water");//45
        array.add("Micado");//46
        array.add("Napoleon");//47
        array.add("Caramel filled donut");//48
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,array);
        lw.setAdapter(adapter);
        sw.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                lw.setVisibility(View.VISIBLE);
                adapter.getFilter().filter(s);
                return false;
            }
        });
        lw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0 || position == 1 ||position == 2 ||position == 15 ||position == 16 ||position == 17 || position == 30 ||position == 31 ||position == 32){
                    Intent i = new Intent(MainMenu.this, naxutest.class);
                    startActivity(i);
                }
                if(position == 3 || position == 4 ||position == 5 ||position == 18 ||position == 19 || position == 20 ||position == 33 ||position == 34 ||position == 35){
                    Intent i = new Intent(MainMenu.this, Salad.class);
                    startActivity(i);
                }
                if(position == 6 || position == 7 ||position == 8 ||position == 21 ||position == 22 || position == 33 ||position == 36 ||position == 37 ||position == 38){
                    Intent i = new Intent(MainMenu.this, Fast_Food.class);
                    startActivity(i);
                }
                if(position == 9 || position == 10 ||position == 11 ||position == 24 ||position == 25 || position == 26 ||position == 39 ||position == 40 ||position == 41){
                    Intent i = new Intent(MainMenu.this, Coffee.class);
                    startActivity(i);
                }
                if(position == 12 || position == 13 ||position == 14 ||position == 27 ||position == 28 || position == 29 ||position == 46 ||position == 47 ||position == 48){
                    Intent i = new Intent(MainMenu.this, cakes.class);
                    startActivity(i);
                }
                if(position == 42 || position == 43 ||position == 44 ||position == 45){
                    Intent i = new Intent(MainMenu.this, Drint.class);
                    startActivity(i);
                }
            }
        });
    }
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
    public void coffee(View view){
        Intent i = new Intent(MainMenu.this, Coffee.class);
        startActivity(i);
    }
    public void cake(View view){
        Intent i = new Intent(MainMenu.this, cakes.class);
        startActivity(i);
    }

}