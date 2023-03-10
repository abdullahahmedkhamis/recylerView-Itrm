package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    //     https://www.youtube.com/watch?v=htjDyLyk_bU&list=PLMYF6NkLrdN8giOLjGRx81fjEIaE5ef-8&index=66             Start from 66 video
    // https://console.firebase.google.com/u/6/project/myisamlicapplication/storage/myisamlicapplication.appspot.com/files/~2Fimages






    private TextView name, description, age;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_info );

        name = findViewById( R.id.name );
        description = findViewById( R.id.infodetails );
        age = findViewById( R.id.age );

        extras = getIntent().getExtras();

        if(extras != null)
        {
            name.setText( extras.getString( "name" ) );
            description.setText( extras.getString( "description" ) );
            age.setText( extras.getString( "age" ) );
        }
    }
}