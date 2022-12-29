package com.example.ex091;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {
    LinearLayout linearL;
    Button btn2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        linearL=findViewById(R.id.linearL2);
        btn2=findViewById(R.id.btn2);

        btn2.setOnClickListener(view -> {
            Intent si=new Intent(this, MainActivity.class);
            startActivity(si);
        });
    }
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400, "Yellow");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        String st= item.getTitle().toString();
        if (id==R.id.red)
            linearL.setBackgroundColor(Color.RED);

        else if (id==R.id.blue)
            linearL.setBackgroundColor(Color.BLUE);

        else if (id==R.id.green)
            linearL.setBackgroundColor(Color.GREEN);
        else if(st=="Yellow")
            linearL.setBackgroundColor(Color.YELLOW);

        return true;
    }
}