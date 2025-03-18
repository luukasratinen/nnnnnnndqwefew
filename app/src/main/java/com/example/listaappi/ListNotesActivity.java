package com.example.listaappi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




import java.util.ArrayList;

public class ListNotesActivity extends AppCompatActivity {


    private RecyclerView notesRecyclerView;
    private NotesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_list_notes);

        notesRecyclerView = findViewById(R.id.ListNotesRV);
        notesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new NotesAdapter(NoteStorage.getInstance().getNotes());
        notesRecyclerView.setAdapter(adapter);


    }

    public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {

        private ArrayList<Note> notesList;



        public NotesAdapter(ArrayList<Note> notesList) {
            this.notesList = notesList;
        }

        @Override
        public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.note, parent, false);

            return new NoteViewHolder(view);
        }



        @Override

        public void onBindViewHolder(NoteViewHolder holder, int position) {

            Note note = notesList.get(position);
            holder.noteIdText.setText("ID: " + note.getId());
            holder.noteTitleText.setText(note.getTitle());

            holder.noteTimeAndDateText.setText(note.getTimeAndDate());
            holder.noteContentText.setText(note.getContent());
        }

        @Override
        public int getItemCount() {
            return notesList.size();
        }

        public class NoteViewHolder extends RecyclerView.ViewHolder {

            TextView noteIdText, noteTimeAndDateText, noteTitleText, noteContentText;

            public NoteViewHolder(View itemView) {
                super(itemView);
                noteIdText = itemView.findViewById(R.id.NoteIdText);


                noteTimeAndDateText = itemView.findViewById(R.id.NoteTimeAndDateText);
                noteTitleText = itemView.findViewById(R.id.NoteTitleText);
                noteContentText = itemView.findViewById(R.id.NoteContentText);
            }
        }

    }
}