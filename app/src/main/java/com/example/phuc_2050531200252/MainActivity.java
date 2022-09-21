package com.example.phuc_2050531200252;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvCauThu;
    ArrayList<CauThu> arrayCauThu;
    CauThuAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCauThu = (ListView) findViewById(R.id.listviewCauThu);
        arrayCauThu = new ArrayList<>();

        arrayCauThu.add(new CauThu("Cristiano Ronaldo","Bồ Đào Nha",R.drawable.b1));
        arrayCauThu.add(new CauThu("Ronaldo","Brazil",R.drawable.b2));
        arrayCauThu.add(new CauThu("Ronaldinho","Brazil",R.drawable.b3));
        arrayCauThu.add(new CauThu("Lionel Messi","Argentina",R.drawable.b4));
        arrayCauThu.add(new CauThu("Neymar Jr","Brazil",R.drawable.b5));
        adapter = new CauThuAdapter(MainActivity.this,arrayCauThu);
        lvCauThu.setAdapter(adapter);

        lvCauThu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                CauThu cauthu = arrayCauThu.get(i);
                intent.putExtra("cauthu", cauthu.getTen());
                startActivity(intent);
            }
        });
    }

        }
