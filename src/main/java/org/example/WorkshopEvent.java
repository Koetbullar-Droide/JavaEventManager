package org.example;

import java.time.LocalDate;

/**
 * Represents a workshop event with details about the instructor and duration.
 */
public class WorkshopEvent extends Event {
    private String instructor;
    private int duration;

    /**
     * Constructs a WorkshopEvent with the specified details.
     *
     * @param name       the name of the event
     * @param date       the date of the event
     * @param location   the location of the event
     * @param instructor the instructor conducting the workshop
     * @param duration   the duration of the workshop in hours
     */
    public WorkshopEvent(String name, LocalDate date, String location, String instructor, int duration) {
        super(name, date, location);
        this.instructor = instructor;
        this.duration = duration;
    }

    /**
     * Gets the name of the instructor for the workshop.
     *
     * @return the instructor's name
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * Sets the name of the instructor for the workshop.
     *
     * @param instructor the new instructor's name
     */
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    /**
     * Gets the duration of the workshop in hours.
     *
     * @return the duration of the workshop
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the duration of the workshop in hours.
     *
     * @param duration the new duration of the workshop
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Calculates the cost of the workshop.
     * The cost is determined by multiplying the duration by an hourly rate.
     *
     * @return the total cost of the workshop
     */
    @Override
    public double calculateCost() {
        double hourlyRate = 150.0; // Example hourly rate for the instructor
        return duration * hourlyRate;
    }

    /**
     * Displays the details of the workshop event, including the instructor's name and duration.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration: " + duration + " hours");
    }
}
