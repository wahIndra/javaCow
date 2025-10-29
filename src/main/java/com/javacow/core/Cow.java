package com.javacow.core;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * The main Cow class that processes variables 5 times slower than normal,
 * simulating how a cow slowly consumes and processes food.
 * 
 * This library adds deliberate delays to operations to mimic the slow,
 * methodical way cows chew and digest their food.
 */
public class Cow {

    private static final int SLOWDOWN_FACTOR = 5;
    private static final long BASE_PROCESSING_TIME_MS = 100;

    private final String name;
    private boolean isChewing = false;

    public Cow() {
        this("Bessie");
    }

    public Cow(String name) {
        this.name = name;
    }

    /**
     * Processes a value with cow-like slowness
     * 
     * @param value     the value to process
     * @param processor the function to apply to the value
     * @return the processed value after cow-speed delay
     */
    public <T, R> R chew(T value, Function<T, R> processor) {
        startChewing();

        try {
            // Simulate the slow processing time
            Thread.sleep(BASE_PROCESSING_TIME_MS * SLOWDOWN_FACTOR);

            // Apply the actual processing
            R result = processor.apply(value);

            System.out.println("Cow " + name + " has slowly processed: " + value + " -> " + result);

            return result;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Cow was interrupted while chewing!", e);
        } finally {
            stopChewing();
        }
    }

    /**
     * Processes a supplier with cow-like slowness
     * 
     * @param supplier the supplier to execute
     * @return the result after cow-speed delay
     */
    public <T> T graze(Supplier<T> supplier) {
        startChewing();

        try {
            // Simulate the slow processing time
            Thread.sleep(BASE_PROCESSING_TIME_MS * SLOWDOWN_FACTOR);

            // Execute the supplier
            T result = supplier.get();

            System.out.println("Cow " + name + " has slowly grazed and produced: " + result);

            return result;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Cow was interrupted while grazing!", e);
        } finally {
            stopChewing();
        }
    }

    /**
     * Performs a slow operation that takes 5x longer than normal
     * 
     * @param operation the runnable operation to perform
     */
    public void ruminate(Runnable operation) {
        startChewing();

        try {
            // Simulate the slow processing time
            Thread.sleep(BASE_PROCESSING_TIME_MS * SLOWDOWN_FACTOR);

            // Execute the operation
            operation.run();

            System.out.println("Cow " + name + " has finished ruminating on the operation");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Cow was interrupted while ruminating!", e);
        } finally {
            stopChewing();
        }
    }

    /**
     * Slowly adds two numbers like a cow counting grass
     * 
     * @param a first number
     * @param b second number
     * @return sum after slow processing
     */
    public int slowAdd(int a, int b) {
        return chew(new int[] { a, b }, arr -> {
            System.out.println("Cow " + name + " is slowly counting: " + arr[0] + " + " + arr[1]);
            return arr[0] + arr[1];
        });
    }

    /**
     * Slowly concatenates strings like a cow chewing cud
     * 
     * @param strings strings to concatenate
     * @return concatenated string after slow processing
     */
    public String slowConcat(String... strings) {
        return chew(strings, arr -> {
            StringBuilder result = new StringBuilder();
            for (String s : arr) {
                result.append(s);
            }
            System.out.println("Cow " + name + " is slowly chewing through text concatenation");
            return result.toString();
        });
    }

    /**
     * Get the cow's name
     * 
     * @return the cow's name
     */
    public String getName() {
        return name;
    }

    /**
     * Check if the cow is currently chewing/processing
     * 
     * @return true if chewing, false otherwise
     */
    public boolean isChewing() {
        return isChewing;
    }

    /**
     * Make the cow moo
     */
    public void moo() {
        System.out.println("Cow " + name + " says: Moooooo!");
    }

    private void startChewing() {
        isChewing = true;
        System.out.println("Cow " + name + " starts chewing slowly...");
    }

    private void stopChewing() {
        isChewing = false;
        System.out.println("Cow " + name + " finished chewing.");
    }
}