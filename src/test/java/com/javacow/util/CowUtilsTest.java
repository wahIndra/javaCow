package com.javacow.util;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for CowUtils
 */
class CowUtilsTest {

    @Test
    void testReleaseCow() {
        // Test releasing cows
        assertFalse(CowUtils.areCowsReleased());

        CowUtils.releaseCow("TestCow");

        assertTrue(CowUtils.areCowsReleased());

        // Try to contain them
        CowUtils.attemptToContainCows();
        // Note: containment may or may not succeed due to random nature
    }

    @Test
    void testSlowMap() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> result = CowUtils.slowMap(input, x -> x * 2);

        assertEquals(Arrays.asList(2, 4, 6), result);
    }

    @Test
    void testSlowFilter() {
        List<String> input = Arrays.asList("cat", "cow", "dog", "ox");
        List<String> result = CowUtils.slowFilter(input, word -> word.length() < 3);

        assertEquals(Arrays.asList("ox"), result);
    }

    @Test
    void testSlowCount() {
        List<String> input = Arrays.asList("a", "b", "c", "d");
        int result = CowUtils.slowCount(input);

        assertEquals(4, result);
    }

    @Test
    void testCreateHerd() {
        com.javacow.core.Cow[] herd = CowUtils.createHerd(3);

        assertEquals(3, herd.length);
        assertEquals("Cow1", herd[0].getName());
        assertEquals("Cow2", herd[1].getName());
        assertEquals("Cow3", herd[2].getName());
    }
}