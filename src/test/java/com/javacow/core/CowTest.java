package com.javacow.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Cow class
 */
class CowTest {

    private Cow cow;

    @BeforeEach
    void setUp() {
        cow = new Cow("TestCow");
    }

    @Test
    void testCowCreation() {
        assertEquals("TestCow", cow.getName());
        assertFalse(cow.isChewing());
    }

    @Test
    void testSlowAdd() {
        long startTime = System.currentTimeMillis();
        int result = cow.slowAdd(5, 3);
        long endTime = System.currentTimeMillis();

        assertEquals(8, result);
        // Should take at least 500ms (5x slower)
        assertTrue(endTime - startTime >= 400);
    }

    @Test
    void testSlowConcat() {
        long startTime = System.currentTimeMillis();
        String result = cow.slowConcat("Hello", " ", "World");
        long endTime = System.currentTimeMillis();

        assertEquals("Hello World", result);
        // Should take at least 500ms (5x slower)
        assertTrue(endTime - startTime >= 400);
    }

    @Test
    void testChewWithFunction() {
        String input = "HELLO";
        String result = cow.chew(input, String::toLowerCase);

        assertEquals("hello", result);
    }

    @Test
    void testGraze() {
        int result = cow.graze(() -> 42);
        assertEquals(42, result);
    }

    @Test
    void testRuminate() {
        final boolean[] executed = { false };

        cow.ruminate(() -> executed[0] = true);

        assertTrue(executed[0]);
    }

    @Test
    void testDefaultCowName() {
        Cow defaultCow = new Cow();
        assertEquals("Bessie", defaultCow.getName());
    }

    @Test
    void testChewingState() {
        // Since chewing happens synchronously, we can't test the intermediate state
        // easily
        // But we can test that it starts and ends in the correct state
        assertFalse(cow.isChewing());
        cow.slowAdd(1, 1);
        assertFalse(cow.isChewing());
    }
}