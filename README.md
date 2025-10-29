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

### Option 1: Direct from GitHub using JitPack (Easiest - No compilation needed!)

Users can include JavaCow directly from GitHub without any compilation:

Add this to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.wahIndra</groupId>
        <artifactId>javaCow</artifactId>
        <version>master-SNAPSHOT</version>
    </dependency>
</dependencies>
```

### Option 2: Include JavaCow in your Maven project (if published to Maven Central)

Add the JavaCow library to your Maven project:

```xml
<dependency>
    <groupId>com.javacow</groupId>
    <artifactId>java-cow-lib</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Option 3: Clone and build from source

```bash
git clone https://github.com/wahIndra/javaCow.git
cd javaCow
mvn clean install
```

Then include in your project:

```xml
<dependency>
    <groupId>com.javacow</groupId>
    <artifactId>java-cow-lib</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Option 4: Download JAR directly

Download the JAR file from the [releases page](https://github.com/wahIndra/javaCow/releases) and add it to your classpath.

## Quick Start

**TL;DR**: Add JitPack repository + dependency to your `pom.xml`, then call `CowUtils.releaseCow("CowName")` to unleash chaos! 🐄

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

## 🚀 How to Make ANY Java Project 5x Slower

Want to slow down an existing Java project? Just add JavaCow and release the chaos!

### Step 1: Add JavaCow to your existing project

**Easiest way** - Add JitPack repository and dependency to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.wahIndra</groupId>
        <artifactId>javaCow</artifactId>
        <version>master-SNAPSHOT</version>
    </dependency>
</dependencies>
```

**Alternative** - If published to Maven Central:

```xml
<dependency>
    <groupId>com.javacow</groupId>
    <artifactId>java-cow-lib</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Step 2: Release the cows in your main method or startup code

```java
import com.javacow.util.CowUtils;

public class YourExistingApplication {
    public static void main(String[] args) {
        // Add this ONE line to make your entire application randomly slower!
        CowUtils.releaseCow("ChaosEngineer");

        // Your existing application code continues normally...
        // But now with random cow interference! 🐄
        yourExistingCode();
    }
}
```

### Step 3: Watch the chaos unfold!

Once you call `CowUtils.releaseCow("AnyName")`, your entire application will experience:

- ⏰ Random delays (200ms-1000ms) throughout execution
- 🐄 Humorous cow messages in your console
- 🎲 Unpredictable performance degradation
- 🤣 Confused users wondering why everything is suddenly slow

**Perfect for:**

- 🎯 Load testing with realistic slowdowns
- 🎪 April Fools' pranks on your team
- 🧪 Testing application resilience under slow conditions
- 🎭 Demonstrating the importance of performance optimization

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

- **🎯 Load Testing**: Simulate slow operations and network delays in your tests
- **⏱️ Performance Benchmarking**: Add controlled delays to measure application resilience
- **🎪 Chaos Engineering**: Introduce random slowdowns to test system behavior
- **📚 Educational**: Demonstrate the impact of slow operations on user experience
- **🎭 Team Pranks**: Release cows in staging to confuse your colleagues
- **🐄 Fun**: Because who doesn't want cow-themed programming chaos?

## Performance Impact

### Controlled Slowness (Regular Cow methods):

- Base processing time: 100ms
- Slowdown factor: 5x
- Total delay per operation: 500ms

### Chaotic Slowness (After releaseCow):

- Random delays: 200ms - 1000ms
- Interference probability: 20-40% per operation
- Background chaos: Every 2 seconds
- Containment success rate: ~50% (cows are stubborn!)

## 🚀 Repository & Development

## Building

```bash
mvn clean compile
mvn test
mvn package
```

## Running Examples

## 🚀 Repository & Development

**GitHub Repository**: [https://github.com/wahIndra/javaCow](https://github.com/wahIndra/javaCow)

### Building from Source

```bash
git clone https://github.com/wahIndra/javaCow.git
cd javaCow
mvn clean compile
mvn test
mvn package
```

### Running Examples

```bash
mvn exec:java -Dexec.mainClass="com.javacow.examples.CowExample"
```

### Development Setup

1. Clone the repository
2. Import into your IDE as a Maven project
3. Run tests: `mvn test`
4. Build JAR: `mvn package`
5. The compiled JAR will be in `target/java-cow-lib-1.0.0.jar`

## 📝 License

This project is open source. Feel free to use it in your projects! (But don't blame us when your production systems suddenly start mooing)

## 🤝 Contributing

Contributions are welcome! Ideas for new cow chaos:

- More creative cow interference messages
- Additional random slowdown patterns
- Cow-themed performance metrics
- Integration with monitoring tools
- Different cow personalities with unique behaviors

Please feel free to submit pull requests or open issues at [https://github.com/wahIndra/javaCow](https://github.com/wahIndra/javaCow)

## ⚠️ Disclaimer

**WARNING**: This library is designed to intentionally slow down your applications. Use responsibly and never in production unless you really, really want your users to experience the zen of cow-speed computing.

---

🐄 **Happy Cow Coding!** 🐄

_"In a world of fast code, be the cow that chews slowly."_
