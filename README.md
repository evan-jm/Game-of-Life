# Game-of-Life

This is a simple implementation of Conway's Game of Life using Java Swing. The Game of Life is a cellular automaton devised by the British mathematician John Horton Conway in 1970. It's a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input.

## Features

- Java Swing GUI: Utilizes Java Swing for the graphical user interface.
- Customizable Grid Size: Choose the size of the grid to simulate.
- Random Initialization: Randomly initialize the initial state of the grid.
- Step-by-Step Simulation: Control the simulation step by step.
- Continuous Simulation: Let the simulation run continuously.
- Colorful Representation: Cells are represented in different colors for better visualization.

## Getting Started

### Prerequisites

Java Development Kit (JDK) installed on your system.

### Installation and Running

Clone this repository:

## Usage

Upon running the program, you'll be presented with a grid representing the initial state of the Game of Life.

Use the Step button to advance the simulation one step at a time.

You can customize the grid size by modifying the GRID_WIDTH and GRID_HEIGHT constants in the Main.java file.

## How it Works

The game consists of a grid of cells, each of which can be in one of two possible states: alive or dead.

At each step in time, the following rules are applied simultaneously to every cell:

- Any live cell with fewer than two live neighbors dies, as if by underpopulation.
- Any live cell with two or three live neighbors lives on to the next generation.
- Any live cell with more than three live neighbors dies, as if by overpopulation.
- Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

## Roadmap

- [x] **Version 1.0**
  - [x] Implement cell lifecycle logic
  - [x] Design frontend to display cells as they evolve
  - [x] Make user input for manually cycling to next generation
- [ ] **Version 1.1**
  - [ ] Make user input for selecting which cells are alive to start first generation
  - [ ] Add button to continually progress generations in realtime

## Contributing

Contributions are welcome! If you'd like to contribute to this project, feel free to fork this repository, make your changes, and submit a pull request.

## Acknowledgments

Thanks to John Horton Conway for inventing the Game of Life.

This project was inspired by various implementations of the Game of Life available online.
