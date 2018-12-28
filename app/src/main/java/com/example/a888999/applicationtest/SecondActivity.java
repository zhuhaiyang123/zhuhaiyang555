package com.example.a888999.applicationtest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView=findViewById(R.id.image_view);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
                Toast.makeText(SecondActivity.this,"欢迎来到紫罗兰的永恒花园",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
        button3.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button3:
                Toast.makeText(SecondActivity.this,"这是最后一张了哦",Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.ima_2);
                break;
        }

    }
}
