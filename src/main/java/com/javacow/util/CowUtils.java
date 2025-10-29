package com.javacow.util;

import com.javacow.core.Cow;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Utility class for performing cow-speed operations on collections and complex
 * data types
 */
public class CowUtils {

    private static final Cow defaultCow = new Cow("UtilityCow");
    private static final Random random = new Random();
    private static ScheduledExecutorService cowInterferenceService;
    private static volatile boolean cowsReleased = false;

    // Private constructor to prevent instantiation
    private CowUtils() {
        // Utility class
    }

    /**
     * Release cows into the wild! They will randomly interfere with your
     * application,
     * making various operations slower and more cow-like.
     * WARNING: Once released, cows will roam freely and slow down random
     * operations!
     * 
     * @param cowName the name for the released cow (purely ceremonial)
     */
    public static void releaseCow(String cowName) {
        if (cowsReleased) {
            System.out.println(" Cows are already roaming free! " + cowName + " joins the chaos!");
            return;
        }

        cowsReleased = true;
        System.out.println(" WARNING: " + cowName + " has been released into the wild!");
        System.out.println(" Cows are now roaming free and will randomly slow down your application!");

        // Start the cow interference service
        cowInterferenceService = Executors.newSingleThreadScheduledExecutor(r -> {
            Thread t = new Thread(r, "CowInterferenceThread");
            t.setDaemon(true); // Don't prevent JVM shutdown
            return t;
        });

        // Schedule random cow interference
        cowInterferenceService.scheduleWithFixedDelay(() -> {
            if (random.nextDouble() < 0.3) { // 30% chance
                randomCowInterference();
            }
        }, 1, 2, TimeUnit.SECONDS);

        System.out.println(" " + cowName + " says: Moooooo! *wanders off to cause chaos*");
    }

    /**
     * Perform random cow interference to slow down the application
     */
    private static void randomCowInterference() {
        String[] cowActivities = {
                " A cow is blocking the CPU pipeline... *chew chew*",
                " Cows are having a meeting in your memory... *moo moo*",
                " A cow is reading your code very slowly... *confused moo*",
                " Cows are playing in your network stack... *network delay*",
                " A cow is reorganizing your file system... *slow file access*",
                " Cows are doing synchronized swimming in your thread pool...",
                " A cow is philosophically pondering your algorithms...",
                " Cows are having a tea party on your disk cache..."
        };

        try {
            String activity = cowActivities[random.nextInt(cowActivities.length)];
            System.out.println(activity);

            // Random delay between 200ms to 1000ms
            int delay = 200 + random.nextInt(800);
            Thread.sleep(delay);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Check if cows have been released and are causing interference
     * 
     * @return true if cows are roaming free
     */
    public static boolean areCowsReleased() {
        return cowsReleased;
    }

    /**
     * Attempt to contain the cows (with limited success)
     * Note: Cows don't like being contained and may ignore this
     */
    public static void attemptToContainCows() {
        if (!cowsReleased) {
            System.out.println(" No cows to contain - they're all safely in the barn!");
            return;
        }

        if (random.nextBoolean()) {
            System.out.println(" Cows have been successfully contained... for now.");
            if (cowInterferenceService != null) {
                cowInterferenceService.shutdown();
            }
            cowsReleased = false;
        } else {
            System.out.println(" Cows refuse to be contained! They're too busy causing chaos!");
            System.out.println(" *Distant mooing intensifies*");
        }
    }

    /**
     * Process a list of items with cow-like slowness
     * 
     * @param items     the list to process
     * @param processor function to apply to each item
     * @return processed list
     */
    public static <T, R> List<R> slowMap(List<T> items, Function<T, R> processor) {
        // Random cow interference
        if (cowsReleased && random.nextDouble() < 0.4) {
            randomCowInterference();
        }

        System.out.println(" Starting slow batch processing of " + items.size() + " items...");

        List<R> results = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            T item = items.get(i);
            System.out.println(" Processing item " + (i + 1) + "/" + items.size());

            // More cow interference during processing
            if (cowsReleased && random.nextDouble() < 0.2) {
                System.out.println(" A cow is inspecting this item... *sniff sniff*");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            R result = defaultCow.chew(item, processor);
            results.add(result);
        }

        System.out.println(" Finished slow batch processing!");
        return results;
    }

    /**
     * Slowly filter a collection like a cow carefully selecting grass
     * 
     * @param items     collection to filter
     * @param predicate filtering condition
     * @return filtered list
     */
    public static <T> List<T> slowFilter(Collection<T> items, Function<T, Boolean> predicate) {
        System.out.println(" Starting slow filtering of " + items.size() + " items...");

        List<T> results = new ArrayList<>();
        int count = 0;
        for (T item : items) {
            count++;
            System.out.println(" Examining item " + count + "/" + items.size());
            Boolean keep = defaultCow.chew(item, predicate);
            if (Boolean.TRUE.equals(keep)) {
                results.add(item);
                System.out.println(" Item selected for keeping: " + item);
            } else {
                System.out.println(" Item rejected: " + item);
            }
        }

        System.out.println(" Filtering complete! Kept " + results.size() + " out of " + items.size() + " items");
        return results;
    }

    /**
     * Count items slowly like a cow counting grass blades
     * 
     * @param items collection to count
     * @return count after slow processing
     */
    public static <T> int slowCount(Collection<T> items) {
        return defaultCow.chew(items, collection -> {
            System.out.println(" Slowly counting " + collection.size() + " items...");
            int count = 0;
            for (T item : collection) {
                count++;
                System.out.println(" Counted item " + count + ": " + item);
                try {
                    Thread.sleep(50); // Extra delay for counting
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
            return count;
        });
    }

    /**
     * Create a herd of cows for parallel slow processing
     * 
     * @param herdSize number of cows in the herd
     * @return array of cows
     */
    public static Cow[] createHerd(int herdSize) {
        System.out.println(" Creating a herd of " + herdSize + " cows...");
        Cow[] herd = new Cow[herdSize];
        for (int i = 0; i < herdSize; i++) {
            herd[i] = new Cow("Cow" + (i + 1));
        }
        System.out.println(" Herd created! All cows are ready to graze slowly.");
        return herd;
    }
}