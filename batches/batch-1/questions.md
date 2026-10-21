# Batch 1 — Java Collections in E-Commerce

Ten related question placements extracted from the untouched Developer-7 library. The original question wording in the right column is preserved verbatim.

| ID | Job-experience debugging scenario (transformed) | Original Developer-7 interview question (unchanged) | Original source location |
|---|---|---|---|
| B1-Q1 ⭐ | While developing a Shopizer cart merge, customers reported incorrect product quantities after login. How would you investigate and fix the collection-processing logic? | Have you worked with collections in Java? | Set 20 · ⭐ anchor |
| B1-Q2 | Customers see repeated products in their carts. How would you determine whether a List or Set is appropriate? | What is the difference between Set and ArrayList? What are they used for and why have they been created? | Set 20 · Part A · 4 |
| B1-Q3 | A cart collection contains duplicate products. How would you investigate how HashSet detects duplicates? | In Collections, how does HashSet ensure that there are no duplicates? | Set 21 · Part A · 4 |
| B1-Q4 | Removing discontinued cart products throws an exception or skips entries during iteration. How would you correct it? | What will happen if you remove an element from an ArrayList while iterating over it using an enhanced for loop? | Set 22 · Part A · 3 |
| B1-Q5 | Two equivalent product identifiers are treated as distinct in a HashSet. How would you fix the custom key object's equality contract? | You want to store Custom Objects in a HashSet, but duplicates are being added. What could be wrong in the Object design? | Set 26 · Part A · 6 |
| B1-Q6 | A product lookup fails after SKU correction. How would you diagnose the key design used by a HashMap? | What are the issues with using a mutable object as a key in a HashMap? | Set 22 · Part A · 6 |
| B1-Q7 | Updating a shopping cart overwrites a previously saved quantity. How would you fix the Map update logic? | What happens internally when you put a key into a HashMap that already exists? | Set 34 · Part A · 5 |
| B1-Q8 | A cart summary reports the wrong combined quantities for repeated products. How would you implement correct per-SKU aggregation? | Can we use a Map and store how many times each element occurs to solve the duplicate-element problem? | Set 35 · Part A · 5 |
| B1-Q9 | Recently viewed products appear in the wrong order. How would you preserve first-seen order while removing duplicates? | Which collection should you use if you want to avoid duplicates and maintain insertion order? | Set 20 · Part B · 1 |
| B1-Q10 | Cart processing must preserve order and duplicates while prioritizing certain products. How would you choose and apply the correct collection? | You are given ArrayList, LinkedList and HashSet. Can you tell me when we should use each one and give a real-world example? | Set 27 · Part A · 7 |

## Source of truth

- Unmodified source: `reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md`
- Unmodified Shopizer code: `reference/shopizer/`
- Challenge branches: `batch-1-level-1`, `batch-1-level-2`, `batch-1-level-3`
- Each level's 10 training incidents are independent of the other levels.
- The supplied acceptance suite uses one deliberately failing test method per transformed question.
- This file describes learning scenarios, **not** claims of real incidents in upstream Shopizer or the user's employment.
