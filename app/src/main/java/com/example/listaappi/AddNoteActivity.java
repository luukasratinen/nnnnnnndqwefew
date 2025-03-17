package com.example.listaappi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;


import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        EditText titleEdit = findViewById(R.id.TitleEdit);
        EditText contentEdit = findViewById(R.id.ContentEdit);
        Button addNoteButton = findViewById(R.id.AddNoteButton);

        addNoteButton.setOnClickListener(v -> {
            String title = titleEdit.getText().toString();
            String content = contentEdit.getText().toString();

            Note newNote = new Note(title, content);
            NoteStorage.getInstance().addNote(newNote);

            Intent intent = new Intent(AddNoteActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}