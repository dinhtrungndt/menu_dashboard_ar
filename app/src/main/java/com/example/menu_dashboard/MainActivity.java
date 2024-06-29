package com.example.menu_dashboard;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu_dashboard.adapter.GridAdapter;
import com.example.menu_dashboard.models.GridItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        List<GridItem> itemList = new ArrayList<>();
        itemList.add(new GridItem(R.drawable.ic_home, "Home"));
        itemList.add(new GridItem(R.drawable.ic_profile, "Profile"));
        itemList.add(new GridItem(R.drawable.ic_settings, "Settings"));
        itemList.add(new GridItem(R.drawable.ic_notifications, "Notifications"));
        itemList.add(new GridItem(R.drawable.ic_help, "Help"));
        itemList.add(new GridItem(R.drawable.ic_about, "About"));
        itemList.add(new GridItem(R.drawable.ic_about, "About"));
        itemList.add(new GridItem(R.drawable.ic_about, "About"));

        GridAdapter adapter = new GridAdapter(itemList, this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // 2 columns
        recyclerView.setAdapter(adapter);
    }
}
