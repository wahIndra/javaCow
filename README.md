# JavaCow Library

A Java library that processes variables and operations 5 times slower than normal, simulating how a cow slowly chews and digests food. **WARNING**: The `releaseCow()` function unleashes chaotic cows that will randomly interfere with your entire application!

## Features

- **Cow-Speed Processing**: All operations are deliberately slowed down by 5x
- **Chaotic Cow Release**: Release cows that randomly slow down your entire application
- **Themed API**: Methods like `chew()`, `graze()`, and `ruminate()`
- **Collection Processing**: Slow mapping, filtering, and counting
- **Herd Management**: Create multiple cows for parallel slow processing
- **Fun Output**: Cow emojis and themed console messages
- **Random Interference**: Released cows cause unpredictable delays throughout your app

## Installation

Add the JavaCow library to your Maven project:

```xml
<dependency>
    <groupId>com.javacow</groupId>
    <artifactId>java-cow-lib</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Quick Start

```java
import com.javacow.core.Cow;
import com.javacow.util.CowUtils;

// WARNING: This releases chaotic cows into your application!
CowUtils.releaseCow("ChaosCow"); // Cows now roam free and randomly slow things down!

// Traditional way for controlled slowness
Cow bessie = new Cow("Bessie");
bessie.moo(); //  Bessie says: Moooooo!

// All operations may now have random cow interference
int result = bessie.slowAdd(5, 3); // Takes ~500ms + random cow delays
String greeting = bessie.slowConcat("Hello", " ", "World!");

// Collection processing (now with random cow chaos!)
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> doubled = CowUtils.slowMap(numbers, x -> x * 2); // Random cow interference included!
```

## Core API

### Cow Class

The main `Cow` class provides the core functionality:

- `chew(value, function)` - Process a value with a function, cow-style
- `graze(supplier)` - Execute a supplier with cow delays
- `ruminate(runnable)` - Run an operation with cow timing
- `slowAdd(a, b)` - Add two numbers slowly
- `slowConcat(strings...)` - Concatenate strings slowly
- `moo()` - Make the cow moo
- `isChewing()` - Check if the cow is currently processing

### CowUtils Class

Utility methods for collection processing and cow chaos:

- `releaseCow(cowName)` - **⚠️ WARNING** - Releases chaotic cows that randomly interfere with your entire application!
- `areCowsReleased()` - Check if cows are roaming free
- `attemptToContainCows()` - Try to contain the cows (success not guaranteed!)
- `slowMap(list, function)` - Map over a list slowly (with potential cow interference)
- `slowFilter(collection, predicate)` - Filter a collection slowly
- `slowCount(collection)` - Count items slowly
- `createHerd(size)` - Create multiple cows

## Examples

### ⚠️ Chaotic Cow Release (Use with Caution!)

```java
// This releases cows that will randomly interfere with your ENTIRE application!
CowUtils.releaseCow("ChaosCow");

// Now ALL operations in your app may randomly experience:
// - CPU pipeline blocking by chewing cows
// - Memory meetings of roaming cows
// - Network delays from playing cows
// - File system reorganization by confused cows

// Check if chaos has been unleashed
if (CowUtils.areCowsReleased()) {
    System.out.println(" Cows are roaming free and causing chaos!");
}

// Try to contain them (may fail due to stubborn cows)
CowUtils.attemptToContainCows();
```

### Easy Library Usage

```java
Cow cow = new Cow("Daisy");

// Each operation takes ~500ms
int sum = cow.slowAdd(10, 20);
String text = cow.slowConcat("Slow", " ", "Processing");
String upper = cow.chew("hello", String::toUpperCase);
```

### Collection Processing

```java
List<String> words = Arrays.asList("cow", "bull", "calf", "cattle");

// Filter words with length <= 4 (each check takes ~500ms)
List<String> shortWords = CowUtils.slowFilter(words, word -> word.length() <= 4);

// Double all numbers (each operation takes ~500ms)
List<Integer> numbers = Arrays.asList(1, 2, 3);
List<Integer> doubled = CowUtils.slowMap(numbers, x -> x * 2);
```

### Herd Operations

```java
// Create a herd of 3 cows
Cow[] herd = CowUtils.createHerd(3);

// Each cow can process independently
for (int i = 0; i < herd.length; i++) {
    final int index = i;
    herd[i].ruminate(() -> {
        System.out.println("Cow " + (index + 1) + " is working!");
    });
}
```

## Why Use JavaCow?

- **Testing**: Simulate slow operations in your tests
- **Rate Limiting**: Add deliberate delays to API calls
- **Educational**: Demonstrate the impact of slow operations
- **Fun**: Because who doesn't want cow-themed programming?

## Performance

All operations are intentionally slowed down by exactly 5x:

- Base processing time: 100ms
- Slowdown factor: 5x
- Total delay per operation: 500ms

## Building

```bash
mvn clean compile
mvn test
mvn package
```

## Running Examples

```bash
mvn exec:java -Dexec.mainClass="com.javacow.examples.CowExample"
```

## License

This project is open source. Feel free to use it in your projects!

## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues.

---

**Happy Cow Coding!**
