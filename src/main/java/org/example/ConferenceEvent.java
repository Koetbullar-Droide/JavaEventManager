package org.example;

import java.util.List;
import java.time.LocalDate;

/**
 * Represents a conference event with a list of speakers and topics.
 */
public class ConferenceEvent extends Event {
    private List<String> speakers;
    private List<String> topics;

    /**
     * Constructs a ConferenceEvent with the specified details.
     *
     * @param name     the name of the event
     * @param date     the date of the event
     * @param location the location of the event
     * @param speakers the list of speakers at the event
     * @param topics   the list of topics covered in the event
     */
    public ConferenceEvent(String name, LocalDate date, String location, List<String> speakers, List<String> topics) {
        super(name, date, location);
        this.speakers = speakers;
        this.topics = topics;
    }

    /**
     * Gets the list of speakers at the conference.
     *
     * @return the list of speakers
     */
    public List<String> getSpeakers() {
        return speakers;
    }

    /**
     * Sets the list of speakers at the conference.
     *
     * @param speakers the list of speakers to set
     */
    public void setSpeakers(List<String> speakers) {
        this.speakers = speakers;
    }

    /**
     * Gets the list of topics covered in the conference.
     *
     * @return the list of topics
     */
    public List<String> getTopics() {
        return topics;
    }

    /**
     * Sets the list of topics covered in the conference.
     *
     * @param topics the list of topics to set
     */
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    /**
     * Calculates the cost of the conference.
     * Includes a base cost for organization and additional costs for the number of speakers.
     *
     * @return the total cost of the conference
     */
    @Override
    public double calculateCost() {
        double baseCost = 3000.0; // Organization base cost
        double speakerCost = speakers.size() * 1000.0; // Cost per speaker
        return baseCost + speakerCost;
    }

    /**
     * Displays the details of the conference event, including speakers and topics.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Speakers: " + String.join(", ", speakers));
        System.out.println("Topics: " + String.join(", ", topics));
    }
}
