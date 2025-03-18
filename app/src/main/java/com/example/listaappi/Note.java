package com.example.listaappi;
import java.text.SimpleDateFormat;
import java.util.Date;
import androidx.recyclerview.widget.RecyclerView;


public class Note {
    private static int idCounter = 1;
    private int Id;
    private String title;
    private String content;
    private String timeAndDate;

    public Note(String title, String content) {
        this.Id = idCounter++;
        this.title = title;
        this.content = content;

        this.timeAndDate = new SimpleDateFormat("HH:mm dd.MM.yyyy").format(new Date());


    }

    public int getId() {
        return Id;
    }


    public String getTitle() {
        return title;
    }



    public String getContent() {
        return content;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }

    @Override


    public String toString() {
        return title;
    }

}