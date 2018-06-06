package com.inducesmile.androidnestedscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView bestRecyclerView = (RecyclerView)findViewById(R.id.product_list);
        GridLayoutManager mGrid = new GridLayoutManager(this, 2);
        bestRecyclerView.setLayoutManager(mGrid);
        bestRecyclerView.setHasFixedSize(true);
        bestRecyclerView.setNestedScrollingEnabled(false);
        ProductAdapter mAdapter = new ProductAdapter(MainActivity.this, getProductTestData());
        bestRecyclerView.setAdapter(mAdapter);
    }

    private List<ProductObject> getProductTestData() {
        List<ProductObject> featuredProducts = new ArrayList<ProductObject>();
        featuredProducts.add(new ProductObject("Gig Laptop", "lap1"));
        featuredProducts.add(new ProductObject("Mash Laptop", "lap1"));
        featuredProducts.add(new ProductObject("Blue Dot Lapto", "lap1"));
        featuredProducts.add(new ProductObject("Skin Laptop", "lap1"));
        featuredProducts.add(new ProductObject("Dice Laptop", "lap1"));
        featuredProducts.add(new ProductObject("Ingrate Laptop", "lap1"));
        featuredProducts.add(new ProductObject("Mush Laptop", "lap1"));
        featuredProducts.add(new ProductObject("Stained Laptop", "lap1"));
        return featuredProducts;
    }
}
