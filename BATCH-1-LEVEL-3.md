# Batch 1 — Java Collections — Level 3

**Difficulty:** 3-year: object identity, data ownership, and subtle collection-contract errors  
**Base code:** unmodified Shopizer commit `6a4a0a65a3408ee8f62597b51d1b3aac24b77dee`  
**Question source:** `reference/developer-7/docs/questions/roadmap/ALL_SETS_001_390.md`

## Your 10 incidents

| ID | Debugging task | Source Set |
|---|---|---|
| B1-Q1-L3 | Cart quantity merge: Incorrect merged quantity | 20 |
| B1-Q2-L3 | List vs Set: Duplicate SKU rows | 20 |
| B1-Q3-L3 | HashSet uniqueness: Wrong distinct SKU count | 21 |
| B1-Q4-L3 | Iteration and deletion: Discontinued items remain or removal throws | 22 |
| B1-Q5-L3 | Object equality: Duplicate custom SKU identity objects | 26 |
| B1-Q6-L3 | Mutable HashMap keys: Lost quantity after SKU correction | 22 |
| B1-Q7-L3 | HashMap replacement: Existing quantity overwritten | 34 |
| B1-Q8-L3 | Map counting: Incorrect quantity totals | 35 |
| B1-Q9-L3 | Order-preserving collection: Recently viewed products reordered | 20 |
| B1-Q10-L3 | Collection choice: Priority processing loses ordering or duplicates | 27 |

## Build compatibility

The pinned Shopizer baseline uses a legacy Spring Maven repository that now rejects anonymous artifact access. This challenge workspace includes `.bugfix-maven-settings.xml` to use Maven Central without altering the original source-reference POM. Use that settings file for Maven commands.

## How to start

1. Download this branch, open **`workspace/shopizer/pom.xml`** in IntelliJ as a Maven project.
2. Work in `workspace/shopizer`, never `reference/shopizer` or `reference/developer-7`.
3. Inspect actual shopping-cart domain entities and methods, especially `ShoppingCartServiceImpl.mergeShoppingCarts()`.
4. Read the incident methods in `sm-core/src/main/java/com/salesmanager/core/business/services/shoppingcart/CartCollectionChallenges.java`.
5. Run the acceptance tests; fix one failed question at a time. Preserve domain semantics and input immutability where specified.
6. Re-run the acceptance suite and then broader Shopizer tests. Do not modify tests just to make them pass.

```bash
cd workspace/shopizer
./mvnw -s .bugfix-maven-settings.xml -pl sm-core -am -Dtest=CartCollectionChallengesTest -Dsurefire.failIfNoSpecifiedTests=false test
```

On Windows, replace `./mvnw` with `mvnw.cmd`.

## Acceptance rules

- Exactly 10 JUnit methods are supplied (Q1–Q10). They are intended to fail before repair.
- Java should compile despite intentionally incorrect behavior.
- `ShoppingCartServiceImpl.mergeShoppingCarts()` also has a real Shopizer source-code bug injected for Q1. Correct **both** that path and the Q1 challenge routine.
- The Q2–Q10 failures live in a new Shopizer `sm-core` domain-support class using real `ShoppingCartItem` entities; these are deliberately introduced practice features, **not pre-existing upstream Shopizer bugs**.
- The tests cover the training routines; passing them alone does **not** prove the entire e-commerce application behaves correctly. Run existing regression tests and manually verify the cart-merge integration.
- All references under `reference/` are preserved from the frozen baseline.
- No solution patches are provided in this challenge branch.

## Reset

Discard your local changes and download this same branch again, or clone the next level's branch. All levels start independently from the same pinned clean Shopizer source.
