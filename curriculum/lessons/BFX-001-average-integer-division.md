# BFX-001 — Integer Division Truncates an Average

**Stage:** Beginner · **Concept:** operand types in division · **Location marker:** `AVG-001`  
**Status:** Published, learner mastery not assessed. Supplemental foundation lesson; not a verbatim bank question.

## 1. Original Java code (bug present)

```java
public class StudentAverage {
    public static void main(String[] args) {
        int math = 85;
        int science = 90;
        int english = 88;

        // AVG-001: Calculate average marks
        double average = (math + science + english) / 3;

        System.out.println("Average: " + average);
    }
}
```

**Original console output**
```text
Average: 87.0
```

**Expected:** `Average: 87.66666666666667`

## 2. Developer's AI prompt

> In `StudentAverage.java`, locate the `AVG-001` calculation in `main()`. For marks 85, 90, and 88, the program returns 87.0 instead of approximately 87.67. Investigate why the decimal portion is lost, fix the calculation to preserve decimal precision, and leave the rest of the code unchanged.

## 3. AI code changes

```diff
         // AVG-001: Calculate average marks
-        double average = (math + science + english) / 3;
+        double average = (math + science + english) / 3.0;
```

## 4. Complete corrected Java code

```java
public class StudentAverage {
    public static void main(String[] args) {
        int math = 85;
        int science = 90;
        int english = 88;

        // AVG-001: Calculate average marks
        // FIX: Use floating-point division to retain decimals
        double average = (math + science + english) / 3.0;

        System.out.println("Average: " + average);
    }
}
```

**Corrected console output**
```text
Average: 87.66666666666667
```

## 5. Why it happened

Java evaluates the original expression using integer division because both operands are integers. Assigning the already-truncated result to a `double` cannot restore the fraction. Using `3.0` selects floating-point division.

**Self-check:** Would casting the sum to `double` before dividing also fix it?
