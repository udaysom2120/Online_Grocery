package com.example.f_mart1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapter.GroceryProductAdapter;
import model.Grocery;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private GroceryProductAdapter mAdapter;
    private List<Grocery> mProductList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getting the recyclerview from xml
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerViewid);
        //mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Populate the products
        mProductList = new ArrayList<>();
        mProductList.add(new Grocery("Grocery & Staples",R.drawable.grocerystaples,"Pulses, Atta & Other Flours, Rice & Other Grains"));
        mProductList.add(new Grocery("Vegetables & Fruits",R.drawable.fruits,"Fruits and Veggies New Launch, Vegetables, Fruits"));
        mProductList.add(new Grocery("Beverages",R.drawable.beverages,"Cold Drinks, Juices & Drinks, Tea & Coffee, Health & Energy Drinks"));
        mProductList.add(new Grocery("Biscuits, Snacks & Chocolates",R.drawable.biscuits,"Chocolates, Biscuits & Cookies, Namkeen & Snacks, Chips"));
        //set adapter to recyclerview
        mAdapter = new GroceryProductAdapter(mProductList,this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
