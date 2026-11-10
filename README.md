# Campus Shop Inventory Management System


## Group Members

| No. | Name | Registration No. |
|-----|------|------------------|
| 1 | WAMBUZI ALEX HARRISON | 25/U/15726/PS |
| 2 | MURUNGI PRAISE        | 25/U/15293/PS |
| 3 | TWEBAZE MICHELLE     | 25/U/15709/PS |
| 4 | NAKIRAYI JANE MARIA   | 25/U/15415/PS |
| 5 | MATSY CLARISHA        | 25/U/15225/PS |

## Files

| File | Purpose |
|------|---------|
| `Product.java` | Product class: private attributes, constructor, getters, validating setters |
| `Main.java` | Creates five products, displays them, updates them, demonstrates validation |
| `README.md` | This file |
| `REPORT.md` | Short report on classes, objects, getters and setters |

## Requirements

- Java Development Kit (JDK) 8 or newer. Check with `java -version` and `javac -version`.

## How to Run

1. Put `Product.java` and `Main.java` in the same folder.
2. Open a terminal (Command Prompt, PowerShell or Terminal) in that folder.
3. Compile both files:

   ```
   javac Product.java Main.java
   ```

4. Run the program:

   ```
   java Main
   ```

## What You Should See

1. A table of the five products (initial stock).
2. Messages confirming a price update and a stock update.
3. The table again, showing the changed values.
4. Two rejected invalid inputs (negative price, negative stock) with error messages, followed by proof that the original values did not change.

## Running in an IDE

In IntelliJ IDEA, Eclipse or NetBeans, create a new Java project, add both files to the `src` folder, and run `Main`.
