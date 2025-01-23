package org.example;
import java.time.LocalDate;
public class ConcertEvent extends Event {
    private String artist;
    private String genre;

    public ConcertEvent(String name, LocalDate date, String location, String artist, String genre) {
        super(name, date, location);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public double calculateCost() {
        double baseCost = 5000.0; // z.B. Miete für die Bühne
        double artistCost = 2000.0; // Kosten pro Künstler
        return baseCost + artistCost;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Artist: " + artist);
        System.out.println("Genre: " + genre);
    }
}


