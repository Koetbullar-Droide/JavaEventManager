package org.example;

import org.example.exceptions.InvalidDateException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public abstract class Event implements Schedulable {
    private String name;
    private LocalDate date;
    private String location;
    private LocalTime time;

    public Event(String name, LocalDate date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalTime getTime() {
        return time;
    }

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

    public void displayDetails() {
        System.out.println("Event Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Location: " + location);
    }

    public abstract double calculateCost();
}

