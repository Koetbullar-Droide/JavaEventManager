package org.example;
import java.time.LocalDate;
public class WorkshopEvent extends Event {
    private String instructor;
    private int duration;

    public WorkshopEvent(String name, LocalDate date, String location, String instructor, int duration) {
        super(name, date, location);
        this.instructor = instructor;
        this.duration = duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public double calculateCost() {
        double hourlyRate = 150.0; // z.B. Stundensatz des Lehrers
        return duration * hourlyRate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration: " + duration + " hours");
    }
}


