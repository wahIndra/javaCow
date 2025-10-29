# JavaCow Library Release JARs 🐄

This directory contains the release JAR files for the JavaCow library v1.0.0.

## Available JARs

### 1. `java-cow-lib-1.0.0.jar` (Main Library JAR)
- **Size**: ~12KB
- **Purpose**: The main library JAR containing only the JavaCow classes
- **Use Case**: Use this when you want to include JavaCow in your project with minimal dependencies
- **Dependencies**: None (just the core library)

### 2. `java-cow-lib-1.0.0-sources.jar` (Source JAR)
- **Size**: ~7.5KB
- **Purpose**: Contains the source code of the library
- **Use Case**: For IDEs to show source code, debugging, or understanding the implementation
- **Contents**: All `.java` source files

### 3. `java-cow-lib-1.0.0-jar-with-dependencies.jar` (Fat JAR)
- **Size**: ~12KB
- **Purpose**: Self-contained JAR with all dependencies included
- **Use Case**: Standalone usage or when you want everything in one file
- **Contents**: Library classes + all dependencies (currently minimal since JavaCow has no external runtime dependencies)

## How to Use

### Option 1: Direct JAR Usage
Download `java-cow-lib-1.0.0.jar` and add it to your classpath:
```bash
java -cp java-cow-lib-1.0.0.jar:your-app.jar com.yourpackage.YourMainClass
```

### Option 2: Maven Dependency (Recommended)
Add to your `pom.xml`:
```xml
<dependency>
    <groupId>com.github.wahIndra</groupId>
    <artifactId>javaCow</artifactId>
    <version>main-SNAPSHOT</version>
</dependency>
```

### Option 3: Gradle Dependency
Add to your `build.gradle`:
```gradle
dependencies {
    implementation 'com.github.wahIndra:javaCow:main-SNAPSHOT'
}
```

## Quick Start
```java
import com.javacow.util.CowUtils;

public class Main {
    public static void main(String[] args) {
        // Release the chaos! 🐄💨
        CowUtils.releaseCow("ChaosCow");
        
        // Your application will now run with random cow interference
        // Enjoy the 5x slower processing like a real cow! 🐄
    }
}
```

## Version Information
- **Version**: 1.0.0
- **Java Version**: 11+
- **Build Date**: October 29, 2025
- **Features**: Cow-themed slow processing, chaos interference, background cow activities

---
**Moooo!** 🐄 Remember: JavaCow makes everything 5x slower, just like a cow consuming food!