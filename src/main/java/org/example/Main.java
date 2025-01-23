package org.example;

import org.example.exceptions.EventNotFoundException;
import org.example.exceptions.InvalidDateException;
import org.example.exceptions.UserAlreadyRegisteredException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static EventManager eventManager = new EventManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Event Manager ---");
            System.out.println("1. Add Event");
            System.out.println("2. Register User to Event");
            System.out.println("3. List All Events");
            System.out.println("4. Search for an Event");
            System.out.println("5. List All Users");
            System.out.println("6. List Users by Event");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addEvent();
                    break;
                case 2:
                    registerUser();
                    break;
                case 3:
                    eventManager.listAllEvents();
                    break;
                case 4:
                    searchEvent();
                    break;
                case 5:
                    eventManager.listAllUsers();
                    break;
                case 6:
                    listUsersByEvent();
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }

    private static void addEvent() {
        System.out.print("Enter event type (Concert, Conference, Workshop): ");
        String type = scanner.nextLine();
        System.out.print("Enter event name: ");
        String name = scanner.nextLine();
        System.out.print("Enter event date (yyyy-mm-dd): ");
        String date = scanner.nextLine();
        System.out.print("Enter event location: ");
        String location = scanner.nextLine();

        Event event = null;

        if ("Concert".equalsIgnoreCase(type)) {
            System.out.print("Enter artist: ");
            String artist = scanner.nextLine();
            System.out.print("Enter genre: ");
            String genre = scanner.nextLine();
            event = new ConcertEvent(name, LocalDate.parse(date), location, artist, genre);

        } else if ("Conference".equalsIgnoreCase(type)) {
            System.out.print("Enter number of speakers: ");
            int numSpeakers = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline
            List<String> speakers = new ArrayList<>();
            for (int i = 0; i < numSpeakers; i++) {
                System.out.print("Enter speaker " + (i + 1) + ": ");
                speakers.add(scanner.nextLine());
            }

            System.out.print("Enter number of topics: ");
            int numTopics = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline
            List<String> topics = new ArrayList<>();
            for (int i = 0; i < numTopics; i++) {
                System.out.print("Enter topic " + (i + 1) + ": ");
                topics.add(scanner.nextLine());
            }

            event = new ConferenceEvent(name, LocalDate.parse(date), location, speakers, topics);

        } else if ("Workshop".equalsIgnoreCase(type)) {
            System.out.print("Enter instructor: ");
            String instructor = scanner.nextLine();
            System.out.print("Enter duration (in hours): ");
            int duration = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline
            event = new WorkshopEvent(name, LocalDate.parse(date), location, instructor, duration);
        }

        if (event != null) {
            eventManager.addEvent(event);
            System.out.println("Event added successfully!");
        } else {
            System.out.println("Invalid event type!");
        }
    }

    private static void registerUser() {
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter user email: ");
        String email = scanner.nextLine();
        System.out.print("Enter event name to register: ");
        String eventName = scanner.nextLine();

        try {
            Event event = eventManager.searchEvent(eventName);
            User user = new User(userName, email);
            eventManager.registerUser(user, event);
            System.out.println("User registered to event successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void searchEvent() {
        System.out.print("Enter the event name to search for: ");
        String eventName = scanner.nextLine();
        try {
            Event event = eventManager.searchEvent(eventName);
            event.displayDetails();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void listUsersByEvent() {
        System.out.print("Enter the event name to list users for: ");
        String eventName = scanner.nextLine();
        try {
            Event event = eventManager.searchEvent(eventName);
            eventManager.listUsersByEvent(event);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
