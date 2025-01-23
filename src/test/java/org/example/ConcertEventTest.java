package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ConcertEventTest {
    private ConcertEvent concert;

    @BeforeEach
    void setUp() {
        concert = new ConcertEvent("Rock Night", LocalDate.of(2023, 8, 1), "Stadium", "The Rockers", "Rock");
    }

    @Test
    void testGetArtist() {
        assertEquals("The Rockers", concert.getArtist());
    }

    @Test
    void testSetArtist() {
        concert.setArtist("New Artist");
        assertEquals("New Artist", concert.getArtist());
    }

    @Test
    void testGetGenre() {
        assertEquals("Rock", concert.getGenre());
    }

    @Test
    void testSetGenre() {
        concert.setGenre("Pop");
        assertEquals("Pop", concert.getGenre());
    }

    @Test
    void testCalculateCost() {
        assertEquals(7000.0, concert.calculateCost(), 0.01);
    }

    @Test
    void testDisplayDetails() {
        // DisplayDetails is typically tested by observing output.
        // You may use libraries like System Rules or TestOutputCapture for advanced testing.
        assertDoesNotThrow(() -> concert.displayDetails());
    }
}
