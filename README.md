# Bingo Card Generator

## Overview
This Java program generates a random BINGO card. It consists of two classes: `A15_Bingo` and `A15_BingoRunner`. The `A15_Bingo` class is responsible for generating the numbers on the BINGO card, and `A15_BingoRunner` is the main class that runs the program and prints the BINGO card to the console.

## How to Run
To run this program, you will need a Java Runtime Environment (JRE). Follow these steps:

1. Compile the Java files:
   ```
   javac A15_Bingo.java A15_BingoRunner.java
   ```
2. Run the `A15_BingoRunner` class:
   ```
   java A15_BingoRunner
   ```

## Features
- **Random Number Generation**: Each time the program runs, it generates a new BINGO card with random numbers.
- **Formatted Output**: The BINGO card is formatted and printed to the console.
- **Instructions**: Simple instructions are provided at the start of the program.

## Classes
- `A15_Bingo`: Handles the logic for generating random numbers for the BINGO card and printing the different sections of the card.
    - `instructions()`: Prints the introductory instructions for the program.
    - `numberGenerator(double min, double max)`: Generates a random number within the specified range.
    - `header()`: Prints the BINGO header.
    - `sideLine()`: Generates and prints a line of the BINGO card with random numbers.
    - `middleLine()`: Generates and prints the middle line of the BINGO card, including a free space.
- `A15_BingoRunner`: Contains the `main` method and orchestrates the creation of the BINGO card.

## Refreshing the Card
To generate a new BINGO card, simply rerun the program.
