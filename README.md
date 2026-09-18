# Lab 04 — String Toolkit

| | |
|---|---|
| **Week** | 4 |
| **Textbook** | Liang — **Chapter 4** (Mathematical Functions, Characters, Strings) |
| **Time budget** | 60 minutes |
| **Points** | 100 |

---

## Learning Objectives

1. Apply `Math.pow`, `Math.sqrt`, and `Math.round` to a geometric problem.
2. Distinguish `char` from `String`, and index characters with `charAt`.
3. Test character categories with `Character.isDigit`.
4. Use the `String` methods `length`, `toUpperCase`, `substring`, and `indexOf`.
5. Explain why `next()` and `nextLine()` behave differently after a numeric read.

---

## Background

**Distance formula.**

```java
double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
```

`Math.round` returns a `long`, which is why the rounded value prints without a decimal point.

**Indexing is zero-based.** For `"Lamar2026"`:

| Index | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
|---|---|---|---|---|---|---|---|---|---|
| Character | L | a | m | a | r | 2 | 0 | 2 | 6 |

The last valid index is therefore `length() - 1`, never `length()`. Using `length()` produces
`StringIndexOutOfBoundsException`.

**`substring(0, 5)`** returns characters 0, 1, 2, 3, and 4 — the second argument is **exclusive**.

**`indexOf("a")`** returns the position of the first match, or `-1` when the character is absent.
It is case-sensitive: `"STAMPEDE3".indexOf("a")` is `-1` because the string contains `A`, not `a`.

**The `Scanner` trap.** After `nextDouble()`, the newline you pressed is still waiting in the input
buffer. Calling `nextLine()` at that point returns an empty string rather than the next line of
text. This lab avoids the trap by reading a single token with `next()`, which skips leading
whitespace. Comment that choice in your code — it is a favourite examination question.

---

## Instructions

### Part A — Geometry

**Step 1.** Compute the distance between the two points using `Math.pow` and `Math.sqrt`.

The distance between two points $(x_1, y_1)$ and $(x_2, y_2)$ is calculated using:


$$
Distance = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}
$$

**Step 2.** Print it to two decimals: `Distance: 5.00`.

**Step 3.** Print `Rounded distance: 5` using `Math.round(distance)`.

### Part B — Character and String Analysis

Read one word with `input.next()`, then print these seven lines using the exact labels shown.
The values below are for the input `Lamar2026`:

| Step | Required output | Method to use |
|---|---|---|
| 4 | `Length: 9` | `length()` |
| 5 | `First character: L` | `charAt(0)` |
| 6 | `Last character: 6` | `charAt(length() - 1)` |
| 7 | `Last is a digit: true` | `Character.isDigit(...)` |
| 8 | `Uppercase: LAMAR2026` | `toUpperCase()` |
| 9 | `First five: Lamar` | `substring(0, 5)` |
| 10 | `Index of a: 1` | `indexOf("a")` |

---

## Commenting Standard (20 points)

```java
// WEAK
String word = input.next(); // read word

// STRONG
// next() reads a single whitespace-delimited token. nextLine() is avoided here
// because the newline left over from the last nextDouble() call would be
// consumed instead of the word the user typed.
String word = input.next();
```

---

## Compile, Run, and Test

```bash

```

---

## Sample Run

```
Enter x1 y1 x2 y2: 0 0 3 4
Distance: 5.00
Rounded distance: 5
Enter one word with no spaces: Lamar2026
Length: 9
First character: L
Last character: 6
Last is a digit: true
Uppercase: LAMAR2026
First five: Lamar
Index of a: 1
```

The driver also checks `(2,3)-(8,11)` with `CardinalPride` (distance 10.00) and a case with
negative coordinates and the word `STAMPEDE3`, where `Index of a: -1` because the string contains
no lower-case `a`.

---

## Grading Rubric

| Criterion | Points |
|---|---|
| All 23 checks pass | 60 |
| Line comments explain every statement | 20 |
| Correct use of the library methods rather than manual workarounds | 10 |
| Committed and pushed on time | 10 |

---

## Submission Checklist

- [ ] All four coordinates can be typed on one line separated by spaces.
- [ ] No `StringIndexOutOfBoundsException` on any input.

```bash


---

## Stretch Goal

Print `Reversed: 6202ramaL` without using a loop, by investigating the `StringBuilder` class and
its `reverse()` method — the class you will meet formally in Chapter 10.

---

## Troubleshooting

| Symptom | Cause | Fix |
|---|---|---|
| `StringIndexOutOfBoundsException: index 9` | Used `charAt(length())` | Use `length() - 1` |
| Word appears empty | Used `nextLine()` after `nextDouble()` | Use `next()` |
| `Distance: 5.0` instead of `5.00` | Used `println` | Use `printf("%.2f%n", ...)` |
| `Index of a: -1` when you expected 1 | The word has an upper-case `A` | `indexOf` is case-sensitive; this is correct behaviour |
| `Rounded distance: 5.0` | Rounded a `double` and printed it directly | `Math.round` returns a `long`; do not add `.0` |

