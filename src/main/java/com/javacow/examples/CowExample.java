package com.javacow.examples;

import com.javacow.core.Cow;
import com.javacow.util.CowUtils;
import java.util.Arrays;
import java.util.List;

/**
 * Example usage of the JavaCow library demonstrating how to use cow-speed
 * processing
 */
public class CowExample {

    public static void main(String[] args) {
        System.out.println("=== Welcome to JavaCow Library Demo ===\n");

        // WARNING: Releasing cows into the wild!
        System.out.println("=== WARNING: Releasing Cows Into The Wild! ===");
        CowUtils.releaseCow("ChaosCow");

        System.out.println("\n=== Now all operations may be randomly slowed by roaming cows! ===");

        // Traditional way to create a cow
        System.out.println("\n=== Traditional Cow Creation ===");
        Cow bessie = new Cow("Bessie");
        bessie.moo();

        System.out.println("\n=== Basic Operations (now with random cow interference!) ===");

        // Slow arithmetic
        int sum = bessie.slowAdd(5, 3);
        System.out.println("Slow addition result: " + sum);

        // Slow string concatenation
        String greeting = bessie.slowConcat("Hello", " ", "World", "!");
        System.out.println("Slow concatenation result: " + greeting);

        // Custom slow operation
        String result = bessie.chew("HELLO", String::toLowerCase);
        System.out.println("Slow lowercase result: " + result);

        System.out.println("\n=== Collection Operations ===");

        // Slow list processing
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        List<Integer> doubled = CowUtils.slowMap(numbers, x -> x * 2);
        System.out.println("Original: " + numbers);
        System.out.println("Doubled: " + doubled);

        // Slow filtering
        List<String> words = Arrays.asList("cow", "bull", "calf", "ox", "cattle");
        List<String> shortWords = CowUtils.slowFilter(words, word -> word.length() <= 3);
        System.out.println("Original words: " + words);
        System.out.println("Short words: " + shortWords);

        // Slow counting
        int count = CowUtils.slowCount(words);
        System.out.println("Slow count of words: " + count);

        System.out.println("\n=== Herd Operations ===");

        // Create a herd
        Cow[] herd = CowUtils.createHerd(3);
        for (Cow cow : herd) {
            cow.moo();
        }

        System.out.println("\n=== Attempting to Contain the Chaos ===");
        CowUtils.attemptToContainCows();

        System.out.println("\n=== Demo Complete ===");
        System.out.println(" All operations completed at cow speed (with random interference)!");
    }
}