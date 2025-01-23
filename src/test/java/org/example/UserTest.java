package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private Event event;

    @BeforeEach
    void setUp() {
        user = new User("Alice", "alice@example.com");
        event = new ConcertEvent("Rock Night", LocalDate.of(2023, 8, 1), "Stadium", "The Rockers", "Rock");
    }

    @Test
    void testGetName() {
        assertEquals("Alice", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("Bob");
        assertEquals("Bob", user.getName());
    }

    @Test
    void testGetEmail() {
        assertEquals("alice@example.com", user.getEmail());
    }

    @Test
    void testSetEmail() {
        user.setEmail("bob@example.com");
        assertEquals("bob@example.com", user.getEmail());
    }

    @Test
    void testRegisterForEvent() {
        user.registerForEvent(event);
        assertTrue(user.getRegisteredEvents().contains(event));
    }

    @Test
    void testGetRegisteredEvents() {
        assertTrue(user.getRegisteredEvents().isEmpty());
        user.registerForEvent(event);
        assertEquals(1, user.getRegisteredEvents().size());
        assertEquals(event, user.getRegisteredEvents().get(0));
    }

    @Test
    void testNotifyParticipants() {
        // This is a simple output test, typically requires mocking to validate
        user.notifyParticipants("Test notification");
        // No assertion needed; just ensures method runs without exceptions
    }
}
