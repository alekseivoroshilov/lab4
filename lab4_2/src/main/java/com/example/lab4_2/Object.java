package com.example.lab4_2;


public class Object {
    String author;
    String title;
    String journal;
    String year;
    String volume;
    Object (String author, String title, String journal, String year, String volume){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? title : "Empty";
        this.journal = !journal.isEmpty() ? journal : "Empty";
        this.year = !year.isEmpty() ? year : "Empty";
        this.volume = !volume.isEmpty() ? volume : "Empty";
    }

    public String getAuthor() {
        return author;
    }

    public String getJournal() {
        return journal;
    }

    public String getTitle() {
        return title;
    }

    public String getVolume() {
        return volume;
    }

    public String getYear() {
        return year;
    }
}
