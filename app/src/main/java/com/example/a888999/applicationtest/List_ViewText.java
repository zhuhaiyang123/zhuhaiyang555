package com.example.a888999.applicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class List_ViewText extends AppCompatActivity {
private List<Fruit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit_item);
        initFruits();
        FruitAdapter adapter=new FruitAdapter(List_ViewText.this,
                R.layout.fruit_item,fruitList);

        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initFruits()
    {
        for(int i=0;i<2;i++)
        {
            Fruit apple=new Fruit("apple",R.drawable.ima_2);
            fruitList.add(apple);
            Fruit aa=new Fruit("我不会告诉你",R.drawable.ima_5);
            fruitList.add(aa);
            Fruit aaa=new Fruit("z这只是在凑字数",R.drawable.ima_6);
            fruitList.add(aaa);

    }
}}
