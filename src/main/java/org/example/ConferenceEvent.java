package org.example;

import java.util.List;
import java.time.LocalDate;

public class ConferenceEvent extends Event {
    private List<String> speakers;
    private List<String> topics;

    public ConferenceEvent(String name, LocalDate date, String location, List<String> speakers, List<String> topics) {
        super(name, date, location);
        this.speakers = speakers;
        this.topics = topics;
    }

    public List<String> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<String> speakers) {
        this.speakers = speakers;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @Override
    public double calculateCost() {
        double baseCost = 3000.0; // Organisation
        double speakerCost = speakers.size() * 1000.0; // Pro Sprecher
        return baseCost + speakerCost;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Speakers: " + String.join(", ", speakers));
        System.out.println("Topics: " + String.join(", ", topics));
    }
}

