package com.hemil.k.swipetodelete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);


        List<String> movies = new ArrayList<>();
        movies.add("Harry Poter");
        movies.add("Captain America");
        movies.add("Iron Man");
        movies.add("Wonder Women");
        movies.add("The Flash");
        movies.add("Avengers");
        movies.add("Pirates of Caribbean");
        movies.add("Thor");
        movies.add("Hulk");

        SwipeRecylerAdapter adapter = new SwipeRecylerAdapter(movies, this);
        recyclerView.setAdapter(adapter);


    }
}
