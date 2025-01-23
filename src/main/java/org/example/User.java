package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user who can register for events and receive notifications.
 */
public class User implements Notifiable {
    private String name;
    private String email;
    private List<Event> registeredEvents;

    /**
     * Constructs a User with the given name and email.
     *
     * @param name  the name of the user
     * @param email the email address of the user
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.registeredEvents = new ArrayList<>();
    }

    /**
     * Gets the name of the user.
     *
     * @return the name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user.
     *
     * @param name the new name of the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the email of the user.
     *
     * @return the email of the user
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the user.
     *
     * @param email the new email of the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Registers the user for an event.
     *
     * @param event the event to register for
     */
    public void registerForEvent(Event event) {
        registeredEvents.add(event);
        System.out.println("Registered for event: " + event.getName());
    }

    /**
     * Gets the list of events the user is registered for.
     *
     * @return the list of registered events
     */
    public List<Event> getRegisteredEvents() {
        return registeredEvents;
    }

    /**
     * Sends a notification to the user.
     *
     * @param message the notification message
     */
    @Override
    public void notifyParticipants(String message) {
        System.out.println("Notification to " + name + ": " + message);
    }
}
