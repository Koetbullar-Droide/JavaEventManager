package org.example;

import org.example.exceptions.InvalidDateException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

/**
 * Represents an abstract event with common attributes such as name, date, location, and time.
 * Subclasses must implement the {@code calculateCost()} method for specific cost calculations.
 */
public abstract class Event implements Schedulable {
    private String name;
    private LocalDate date;
    private String location;
    private LocalTime time;

    /**
     * Constructs an Event with the specified name, date, and location.
     *
     * @param name     the name of the event
     * @param date     the date of the event
     * @param location the location of the event
     */
    public Event(String name, LocalDate date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    /**
     * Gets the name of the event.
     *
     * @return the name of the event
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the event.
     *
     * @param name the new name of the event
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the date of the event.
     *
     * @return the date of the event
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the date of the event.
     *
     * @param date the new date of the event
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Gets the location of the event.
     *
     * @return the location of the event
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the event.
     *
     * @param location the new location of the event
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the scheduled time of the event.
     *
     * @return the time of the event
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * Schedules the event by setting the date and time.
     *
     * @param date the date of the event in the format {@code yyyy-MM-dd}
     * @param time the time of the event in the format {@code HH:mm:ss}
     * @throws InvalidDateException if the date or time format is invalid
     */
    @Override
    public void schedule(String date, String time) throws InvalidDateException {
        try {
            this.date = LocalDate.parse(date);
            this.time = LocalTime.parse(time);
            System.out.println("Event scheduled for " + this.date + " at " + this.time);
        } catch (DateTimeParseException e) {
            throw new InvalidDateException("Invalid date or time format: " + date + " " + time);
        }
    }

    /**
     * Displays the details of the event, including name, date, time, and location.
     */
    public void displayDetails() {
        System.out.println("Event Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Location: " + location);
    }

    /**
     * Calculates the cost of the event.
     * This method must be implemented by subclasses to provide specific cost calculations.
     *
     * @return the cost of the event
     */
    public abstract double calculateCost();
}
