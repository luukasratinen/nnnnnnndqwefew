package com.example.listaappi;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addNoteButton = findViewById(R.id.AddNoteActivityButton);

        Button listNotesButton = findViewById(R.id.ListNotesActivityButton);

        addNoteButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddNoteActivity.class);


            startActivity(intent);


        });


        listNotesButton.setOnClickListener(v -> {


            Intent intent = new Intent(MainActivity.this, ListNotesActivity.class);
            startActivity(intent);

        });

    }
}