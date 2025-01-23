package org.example;

import java.time.LocalDate;

/**
 * Represents a concert event with details about the artist and genre.
 */
public class ConcertEvent extends Event {
    private String artist;
    private String genre;

    /**
     * Constructs a ConcertEvent with the specified details.
     *
     * @param name     the name of the event
     * @param date     the date of the event
     * @param location the location of the event
     * @param artist   the artist performing at the event
     * @param genre    the genre of the concert
     */
    public ConcertEvent(String name, LocalDate date, String location, String artist, String genre) {
        super(name, date, location);
        this.artist = artist;
        this.genre = genre;
    }

    /**
     * Gets the artist performing at the concert.
     *
     * @return the artist's name
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the artist performing at the concert.
     *
     * @param artist the artist's name
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Gets the genre of the concert.
     *
     * @return the genre of the concert
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the concert.
     *
     * @param genre the genre of the concert
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Calculates the cost of the concert.
     * Includes a base cost for the venue and an additional cost for the artist.
     *
     * @return the total cost of the concert
     */
    @Override
    public double calculateCost() {
        double baseCost = 5000.0; // Example base cost
        double artistCost = 2000.0; // Example artist cost
        return baseCost + artistCost;
    }

    /**
     * Displays the details of the concert event, including the artist and genre.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Artist: " + artist);
        System.out.println("Genre: " + genre);
    }
}
