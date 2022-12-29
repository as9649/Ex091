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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearL;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        linearL=findViewById(R.id.linearL);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(view -> {
            Intent si=new Intent(this, MainActivity2.class);
            startActivity(si);
        });
    }

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id==R.id.red)
            linearL.setBackgroundColor(Color.RED);

        else if (id==R.id.blue)
            linearL.setBackgroundColor(Color.BLUE);

        else if (id==R.id.green)
            linearL.setBackgroundColor(Color.GREEN);

        return true;
    }
}