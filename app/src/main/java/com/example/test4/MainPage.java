package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.Adapter.MyAdapter;
import com.example.Model.ListItem;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends AppCompatActivity {

// https://console.firebase.google.com/u/6/project/myisamlicapplication/storage/myisamlicapplication.appspot.com/files/~2Fimages
// https://www.youtube.com/watch?v=i-_GQo-XTtk&list=PLMYF6NkLrdN8giOLjGRx81fjEIaE5ef-8&index=58

    private RecyclerView recyclerView;
    private List<ListItem> listitems;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main_page );

recyclerView = findViewById( R.id.recyclerViewID );
recyclerView.setHasFixedSize( true );
recyclerView.setLayoutManager( new LinearLayoutManager( this ) );

        listitems = new ArrayList<>();
//        for (int x = 0; x < 12; x++) {
//            ListItem listItem = new ListItem(
//                    "Abdullah" + (x+1),
//                    "Details",
//                    "33"
//            );
//
//           listitems.add(listItem);
//        }

        ListItem  item1 = new ListItem( "Abdullah Ahmed","Java Developer", "33" );
        ListItem  item2 = new ListItem( "Abdullah Ahmed 1","Android Developer", "33" );
        ListItem  item3 = new ListItem( "Abdullah Ahmed 3","Java Developer", "33" );
        ListItem  item4 = new ListItem( "Abdullah Ahmed 5","C#", "33" );
        ListItem  item5 = new ListItem( "Abdullah Ahmed 7","HTML", "33" );
        ListItem  item6 = new ListItem( "Abdullah Ahmed 9","VB", "33" );
        ListItem  item7 = new ListItem( "Abdullah Ahmed 11","C++", "33" );
        ListItem  item8 = new ListItem( "Abdullah Ahmed 13","Android Developer", "33" );
        ListItem  item9 = new ListItem( "Abdullah Ahmed 15","Java Developer", "33" );

        listitems.add( item1 );
        listitems.add( item2 );
        listitems.add( item3 );
        listitems.add( item4 );
        listitems.add( item5 );
        listitems.add( item6 );
        listitems.add( item7 );
        listitems.add( item8 );
        listitems.add( item9 );

        adapter = new MyAdapter( this,listitems );
        recyclerView.setAdapter( adapter );
    }
}