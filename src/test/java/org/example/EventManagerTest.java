package org.example;

import org.example.exceptions.EventNotFoundException;
import org.example.exceptions.UserAlreadyRegisteredException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EventManagerTest {
    private EventManager eventManager;
    private Event testEvent;
    private User testUser;

    @BeforeEach
    void setUp() {
        eventManager = new EventManager();
        testEvent = new ConcertEvent("Rock Night", LocalDate.of(2023, 8, 1), "Stadium", "The Rockers", "Rock");
        testUser = new User("Alice", "alice@example.com");
    }

    @Test
    void testAddEvent() {
        eventManager.addEvent(testEvent);
        assertDoesNotThrow(() -> eventManager.searchEvent("Rock Night"));
    }

    @Test
    void testRegisterUserSuccessfully() throws EventNotFoundException, UserAlreadyRegisteredException {
        eventManager.addEvent(testEvent);
        eventManager.registerUser(testUser, testEvent);

        assertTrue(testUser.getRegisteredEvents().contains(testEvent));
    }

    @Test
    void testRegisterUserEventNotFound() {
        assertThrows(EventNotFoundException.class, () -> eventManager.registerUser(testUser, testEvent));
    }

    @Test
    void testRegisterUserAlreadyRegistered() throws EventNotFoundException, UserAlreadyRegisteredException {
        eventManager.addEvent(testEvent);
        eventManager.registerUser(testUser, testEvent);

        assertThrows(UserAlreadyRegisteredException.class, () -> eventManager.registerUser(testUser, testEvent));
    }

    @Test
    void testSearchEvent() throws EventNotFoundException {
        eventManager.addEvent(testEvent);
        Event foundEvent = eventManager.searchEvent("Rock Night");
        assertEquals(testEvent, foundEvent);
    }

    @Test
    void testSearchEventNotFound() {
        assertThrows(EventNotFoundException.class, () -> eventManager.searchEvent("Nonexistent Event"));
    }
}
