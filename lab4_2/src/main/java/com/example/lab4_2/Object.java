package com.example.lab4_2;


public class Object {
    String author;
    String title;
    String journal;
    String year;
    String volume;
    Object (String author, String title, String journal, String year, String volume){
        this.author = !author.isEmpty() ? author : "Empty";
        this.title = !title.isEmpty() ? author : "Empty";
        this.journal = !journal.isEmpty() ? author : "Empty";
        this.year = !year.isEmpty() ? author : "Empty";
        this.volume = !volume.isEmpty() ? author : "Empty";
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
