package org.example;

import org.example.exceptions.EventNotFoundException;
import org.example.exceptions.UserAlreadyRegisteredException;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages events and user registrations.
 * Provides functionalities to add events, register users to events,
 * search events, and list all events and users.
 */
public class EventManager {
    private List<Event> events;
    private List<User> users;

    /**
     * Initializes an empty EventManager.
     */
    public EventManager() {
        this.events = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    /**
     * Adds a new event to the list of managed events.
     *
     * @param event the event to be added
     */
    public void addEvent(Event event) {
        events.add(event);
        System.out.println("Event added: " + event.getName());
    }

    /**
     * Registers a user to a specific event.
     *
     * @param user  the user to be registered
     * @param event the event the user wants to register for
     * @throws EventNotFoundException         if the event is not found
     * @throws UserAlreadyRegisteredException if the user is already registered for the event
     */
    public void registerUser(User user, Event event) throws EventNotFoundException, UserAlreadyRegisteredException {
        if (!events.contains(event)) {
            throw new EventNotFoundException("Event not found: " + event.getName());
        }

        if (!users.contains(user)) {
            users.add(user);
        }

        if (user.getRegisteredEvents().contains(event)) {
            throw new UserAlreadyRegisteredException("User already registered for this event: " + event.getName());
        }

        user.registerForEvent(event);
        System.out.println("User " + user.getName() + " registered for event: " + event.getName());
    }

    /**
     * Searches for an event by its name.
     *
     * @param name the name of the event to search for
     * @return the event if found
     * @throws EventNotFoundException if no event with the given name is found
     */
    public Event searchEvent(String name) throws EventNotFoundException {
        for (Event event : events) {
            if (event.getName().equalsIgnoreCase(name)) {
                return event;
            }
        }
        throw new EventNotFoundException("Event not found with name: " + name);
    }

    /**
     * Lists all managed events.
     * Prints the details of each event to the console.
     */
    public void listAllEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
            return;
        }
        for (Event event : events) {
            event.displayDetails();
            System.out.println();
        }
    }

    /**
     * Lists all registered users.
     * Prints the details of each user to the console.
     */
    public void listAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
            return;
        }
        System.out.println("Registered Users:");
        for (User user : users) {
            System.out.println("- " + user.getName() + " (" + user.getEmail() + ")");
        }
    }

    /**
     * Lists all users registered for a specific event.
     *
     * @param event the event to list users for
     */
    public void listUsersByEvent(Event event) {
        System.out.println("Users registered for event: " + event.getName());
        boolean hasUsers = false;

        for (User user : users) {
            if (user.getRegisteredEvents().contains(event)) {
                System.out.println("- " + user.getName() + " (" + user.getEmail() + ")");
                hasUsers = true;
            }
        }

        if (!hasUsers) {
            System.out.println("No users registered for this event.");
        }
    }
}
