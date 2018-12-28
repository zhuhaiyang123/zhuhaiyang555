package com.example.a888999.applicationtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button button4=findViewById(R.id.Textbutton);
        editText=findViewById(R.id.edit_text);
        textView=findViewById(R.id.text1);
        button4.setOnClickListener(this);
    Button button7=findViewById(R.id.bon);
    button7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(ThirdActivity.this,List_ViewText.class);
            startActivity(intent);

        }
    });}
    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.Textbutton:
                textView.setText("只有神知道的世界");
                break;
                default:
                    break;
        }

    };
}
