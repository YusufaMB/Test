package com.example.yusufmb.test;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<restaurantModels> suyaSpots = new ArrayList<>();

    RecyclerView ourRecyclerView;
    restaurantAdapter ourAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suyaSpots.add(new restaurantModels(R.drawable.mypic1, "Yahuza Suya", "State Road Kano"));
        suyaSpots.add(new restaurantModels(R.drawable.mypic1, "Sokoto Suya", "Zoo Road Kano"));
        suyaSpots.add(new restaurantModels(R.drawable.mypic1, "Murtala Suya", "Hotoro Road Kano"));
        suyaSpots.add(new restaurantModels(R.drawable.mypic1, "Al amir Suya", "Tarauni Road Kano"));
        suyaSpots.add(new restaurantModels(R.drawable.mypic1, "kowa Suya", "Zaria Road Kano"));


        ourRecyclerView = findViewById(R.id.my_recycler_view);
        ourRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ourAdapter = new restaurantAdapter(this, new restaurantAdapter.SuyaSpotClickListener() {
            @Override
            public void onSuyaSpotClicked(restaurantModels suyaSpot) {
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
        ourAdapter.setSuyaSpots(suyaSpots);
        ourRecyclerView.setAdapter(ourAdapter);
    }
}
