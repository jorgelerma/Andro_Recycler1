package com.example.root.myrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    String[] myArray = {" Luis", "John", "Maria", "Albert", "Euler", "Mario",
                        "Elon", "Musks", "Alex", "Amazon", "Joe", "John", "Bill"};

    ArrayList<String> myArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.rvAnimals);

        myArrayList = new ArrayList<String>();

        myArrayList.add("Luis");
        myArrayList.add("John");
        myArrayList.add("Bazels");
        myArrayList.add("Jeff");
        myArrayList.add("Bill");
        myArrayList.add("Gates");
        myArrayList.add("Sage");

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

//        mAdapter = new MyRecyclerViewAdapter(this, myArray);
        mAdapter = new MyRecyclerViewAdapter(this, myArrayList);
        mRecyclerView.setAdapter(mAdapter);

    }
}
