# Menu Order Counter

A Java console app that tallies restaurant orders using a `LinkedHashMap` and reports the best-selling dish.

## Features

- Count how many times each dish is ordered (`addOrder`, `getCount`)
- Print a full order report in the same order dishes were first ordered
- Find the best-selling dish (on a tie, the dish ordered first wins)
- Manual PASS/FAIL tests for edge cases: empty counter, tie, and counting

## How to Run

Requires Java (JDK 17 or newer).

```bash
git clone https://github.com/CristianoRonaldo-ui/menu-order-counter.git
cd menu-order-counter
javac src/*.java
java -cp src OrderApp
```

## Example Output

```
=== Order Report ===
Pho: 2
Banh Mi: 1
Spring Rolls: 1
Bun Bo Hue: 1
Com Tam: 1
Best seller: Pho
=== Running Tests ===
Test 1 PASS: empty counter returns null
Test 2 PASS: tie goes to first ordered dish
Test 3 PASS: count increased correctly

## Complexity Analysis

Let *n* be the number of distinct dishes.

| Method | Time | Why |
|---|---|---|
| `addOrder` | O(1) average | One hash lookup + one hash insert |
| `getCount` | O(1) average | One hash lookup |
| `printReport` | O(n) | Visits every dish once |
| `findBestSeller` | O(n) | Visits every dish once to track the max |

Space: O(n), one entry per distinct dish.

## What I Learned

- **`HashMap` is Java's version of a Python `dict`**: `getOrDefault` ↔ `get(key, default)`, `put` ↔ `d[key] = value`. Java has no `map[key]` syntax.
- **`HashMap` does not keep insertion order.** Keys are stored in buckets based on their hash code, so iteration order looked random once I added more dishes. Switching to `LinkedHashMap` fixed it with only 3 changed lines, since both share the same methods. (Python dicts keep insertion order since 3.7, so this surprised me.)
- **Generics need wrapper types**: `HashMap<String, Integer>`, not `int`. Java converts between `int` and `Integer` automatically (autoboxing).
- **Null-safe string comparison**: `"Pho".equals(best)` instead of `best.equals("Pho")`, because the second one crashes with `NullPointerException` if `best` is `null`.
- **Debugging `.gitignore`**: my `.class` files were still showing up as untracked. Running `cat .gitignore` showed I had pasted the wrong content, so always check a file's real contents first.
```