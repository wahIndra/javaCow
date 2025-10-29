# Example: Using JavaCow in Your Project

This is a simple example showing how to include the JavaCow library in any existing Java project to make it randomly slower.

## Project Structure

```
example-project/
├── pom.xml                 # Include JavaCow dependency
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   ├── MyApplication.java      # Your existing app
│                   └── SlowApplication.java    # App with JavaCow chaos
```

## Step 1: Add JavaCow Dependency

### Option A: Direct from GitHub (Recommended for easy setup)

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

### Option B: Traditional Maven (if published to Maven Central)

```xml
<dependency>
    <groupId>com.javacow</groupId>
    <artifactId>java-cow-lib</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Option C: Local Installation

```bash
git clone https://github.com/wahIndra/javaCow.git
cd javaCow
mvn clean install
```

Then use:

```xml
<dependency>
    <groupId>com.javacow</groupId>
    <artifactId>java-cow-lib</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Step 2: Release the Cows!

### Before (Normal Application):

```java
public class MyApplication {
    public static void main(String[] args) {
        System.out.println("Starting application...");

        // Your normal business logic
        processData();
        calculateResults();
        generateReport();

        System.out.println("Application completed!");
    }
}
```

### After (With Cow Chaos):

```java
import com.javacow.util.CowUtils;

public class SlowApplication {
    public static void main(String[] args) {
        System.out.println("Starting application...");

        // ADD THIS ONE LINE to release chaos! 🐄
        CowUtils.releaseCow("ProductionChaos");

        // Your SAME business logic - no other changes needed!
        processData();          // Now with random cow interference!
        calculateResults();     // Cows might be inspecting your calculations!
        generateReport();       // Background cows causing delays!

        System.out.println("Application completed (eventually)!");
    }
}
```

## What Happens?

Once you call `CowUtils.releaseCow("AnyName")`:

1. **Random Delays**: 200ms-1000ms delays appear randomly throughout your app
2. **Cow Messages**: Console fills with entertaining cow activities:

   - "🐄 A cow is blocking the CPU pipeline... _chew chew_"
   - "🐄 Cows are having a meeting in your memory... _moo moo_"
   - "🐄 A cow is reading your code very slowly... _confused moo_"

3. **Background Interference**: Cows continue causing chaos every 2 seconds
4. **Unpredictable Performance**: Your 10-second app might now take 15-30 seconds!

## Perfect For:

- 🧪 **Chaos Engineering**: Test how your app handles slowdowns
- ⏱️ **Performance Testing**: Simulate network delays and slow dependencies
- 🎭 **Team Pranks**: Deploy to staging and watch confusion ensue
- 📚 **Education**: Show the impact of performance issues

## Repository

Get JavaCow at: https://github.com/wahIndra/javaCow
