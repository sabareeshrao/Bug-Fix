# BFX-002 — Shopping Cart Total Is Overwritten

**Stage:** Beginner · **Concept:** assignment vs accumulation in a loop · **Location marker:** `ORDER-002`  
**Status:** Published, learner mastery not assessed. Related to original source Sets 20 and 35 (collections/e-commerce), but not a verbatim question.

## 1. Original Java code (bug present)

```java
public class OrderCalculator {
    public static void main(String[] args) {
        String[] products = {"Keyboard", "Mouse", "Cable"};
        int[] prices = {120, 45, 20};
        int[] quantities = {1, 2, 1};
        int total = 0;

        // ORDER-002: Calculate total order amount
        for (int i = 0; i < products.length; i++) {
            int itemTotal = prices[i] * quantities[i];

            total = itemTotal;

            System.out.println(products[i] + ": $" + itemTotal);
        }

        System.out.println("Final Order Total: $" + total);
    }
}
```

**Original console output**
```text
Keyboard: $120
Mouse: $90
Cable: $20
Final Order Total: $20
```

**Expected final line:** `Final Order Total: $230`

## 2. Developer's AI prompt

> In `OrderCalculator.java`, locate the `ORDER-002` section inside the product loop. The individual line-item amounts are correct, but the final order amount only reflects the last product. With the current cart the program returns $20 instead of $230. Fix how the running total is calculated, and leave the item calculations and existing output structure unchanged.

## 3. AI code changes

```diff
         // ORDER-002: Calculate total order amount
         for (int i = 0; i < products.length; i++) {
             int itemTotal = prices[i] * quantities[i];
-            total = itemTotal;
+            total += itemTotal;
             System.out.println(products[i] + ": $" + itemTotal);
         }
```

## 4. Complete corrected Java code

```java
public class OrderCalculator {
    public static void main(String[] args) {
        String[] products = {"Keyboard", "Mouse", "Cable"};
        int[] prices = {120, 45, 20};
        int[] quantities = {1, 2, 1};
        int total = 0;

        // ORDER-002: Calculate total order amount
        // FIX: Include every line item in the running total
        for (int i = 0; i < products.length; i++) {
            int itemTotal = prices[i] * quantities[i];

            total += itemTotal;

            System.out.println(products[i] + ": $" + itemTotal);
        }

        System.out.println("Final Order Total: $" + total);
    }
}
```

**Corrected console output**
```text
Keyboard: $120
Mouse: $90
Cable: $20
Final Order Total: $230
```

## 5. Why it happened

`total = itemTotal` replaced the running sum on each loop iteration. The last iteration left only the price of the Cable. `total += itemTotal` accumulates each amount, yielding 120 + 90 + 20 = 230.

**Self-check:** What changes when the last item has quantity zero?
