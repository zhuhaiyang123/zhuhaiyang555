package com.example.a888999.applicationtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;}

      public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case R.id.add_item:
                    Toast.makeText(MainActivity.this, "别点了", Toast.LENGTH_LONG).show();
                    break;
                case R.id.remove_item:
                    Toast.makeText(MainActivity.this, "没用的", Toast.LENGTH_SHORT).show();
                    break;
                default:
            }
        return  true;
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button5 =  findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "恭喜你获得屠龙宝刀，这是第一个活动",
                        Toast.LENGTH_SHORT).show();
            }
        });
        Button button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Toast .makeText(MainActivity.this,"欢迎",Toast.LENGTH_SHORT)   .show();
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
            }
        });
    }
}

