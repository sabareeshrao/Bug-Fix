# BFX-003 — Array Index Boundary in Duplicate Order Audit

**Stage:** Beginner / Year 1 · **Primary concept:** `array-off-by-one` (valid array indices and adjacent-item comparisons)  
**Java version:** 21 · **File:** `OrderAudit.java` · **Location marker:** `AUDIT-003`  
**Status:** Published; learner mastery not assessed. This is a derived debugging simulation, not a verbatim question from the [original 390-set source bank](../../reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md).

## 1. Original Java code — with bug

The application audits a sorted batch of order IDs to catch *adjacent* duplicates before fulfillment. It must print duplicate IDs and finish the audit without an exception.

```java
public class OrderAudit {
    public static void main(String[] args) {
        int[] orderIds = {4101, 4102, 4102, 4105};

        System.out.println("Starting duplicate order audit");

        // AUDIT-003: Compare each order ID with the following ID
        for (int i = 0; i < orderIds.length; i++) {
            if (orderIds[i] == orderIds[i + 1]) {
                System.out.println("Duplicate order ID: " + orderIds[i]);
            }
        }

        System.out.println("Audit completed");
    }
}
```

## Original code output (Java 21)

```text
Starting duplicate order audit
Duplicate order ID: 4102
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at OrderAudit.main(OrderAudit.java:9)
```

**Expected output:**

```text
Starting duplicate order audit
Duplicate order ID: 4102
Audit completed
```

## 2. Developer's prompt to AI

> In `OrderAudit.java`, inspect the `AUDIT-003` loop inside `main()`. The duplicate audit correctly identifies order 4102 but then crashes with `ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4` instead of completing. Find why the comparison fails on the last element, fix that issue without changing the duplicate-detection behavior, and leave unrelated code unchanged.

## 3. AI-generated code changes

```diff
         // AUDIT-003: Compare each order ID with the following ID
-        for (int i = 0; i < orderIds.length; i++) {
+        for (int i = 0; i < orderIds.length - 1; i++) {
             if (orderIds[i] == orderIds[i + 1]) {
                 System.out.println("Duplicate order ID: " + orderIds[i]);
             }
```

## 4. Complete AI-corrected Java code

```java
public class OrderAudit {
    public static void main(String[] args) {
        int[] orderIds = {4101, 4102, 4102, 4105};

        System.out.println("Starting duplicate order audit");

        // AUDIT-003: Compare each order ID with the following ID
        // FIX: Stop before the last index because we access i + 1
        for (int i = 0; i < orderIds.length - 1; i++) {
            if (orderIds[i] == orderIds[i + 1]) {
                System.out.println("Duplicate order ID: " + orderIds[i]);
            }
        }

        System.out.println("Audit completed");
    }
}
```

## Corrected code output (Java 21)

```text
Starting duplicate order audit
Duplicate order ID: 4102
Audit completed
```

## 5. Root cause and learning outcome

An array with four elements has valid indices `0`, `1`, `2`, and `3`. The loop originally allowed `i == 3`, but `orderIds[i + 1]` then tried to access index `4`. Because this algorithm checks **pairs of neighboring elements**, only the first `length - 1` positions can start a pair. Limiting `i` to `orderIds.length - 2` (using the condition `i < orderIds.length - 1`) avoids the invalid access without skipping any valid pair.

| Iteration | Current index `i` | Following index `i + 1` | Original result |
|---|---:|---:|---|
| 1 | 0 | 1 | Valid |
| 2 | 1 | 2 | Valid — finds duplicate 4102 |
| 3 | 2 | 3 | Valid |
| 4 | 3 | 4 | **Invalid — throws exception** |

**Regression thought exercise:** Verify the behavior with an empty array, a single order ID, two distinct order IDs, and two identical order IDs. The corrected loop remains safe for zero or one element.

**Verification:** Compiled and executed the original and corrected source using OpenJDK 21. Original process exit code: `1`; corrected process exit code: `0`. The console outputs shown above were reproduced.

**Next:** [BFX tracker](../TRACKER.md) — BFX-004: Empty array produces unexpected result.
