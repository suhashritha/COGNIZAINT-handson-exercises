
# CricketApp

A React JS application developed to demonstrate ES6 features and React component concepts.
This project implements player details, filtering, array operations, destructuring, and conditional rendering.

## Features

* Display list of 11 cricket players with their scores
* Use ES6 `map()` method to display player details
* Filter players with scores below 70 using `filter()`
* Use ES6 arrow functions
* Implement array destructuring
* Merge arrays using spread operator
* Display components conditionally using flag variable

## Technologies Used

* React JS
* JavaScript ES6
* HTML
* CSS
* Node.js
* NPM

## Project Structure

```
cricketapp
│
├── public
│
├── src
│   ├── components
│   │   ├── ListofPlayers.js
│   │   └── IndianPlayers.js
│   │
│   ├── App.js
│   ├── index.js
│
├── package.json
├── package-lock.json
└── README.md
```

## ES6 Concepts Implemented

### map()

Used to iterate through the players array and display player details.

### Arrow Functions

Used for filtering and rendering player information.

### Destructuring

Used to extract player values from arrays.

### Spread Operator

Used to merge T20 players and Ranji Trophy players arrays.

### Conditional Rendering

A flag variable is used to display either:

* ListofPlayers component
* IndianPlayers component

## Installation

Clone the repository:

```
git clone <repository-url>
```

Navigate to project folder:

```
cd cricketapp
```

Install dependencies:

```
npm install
```

## Run Application

Start the development server:

```
npm start
```

The application runs at:

```
http://localhost:3000
```

## Output

### Flag = true

Displays:

* List of players
* Player scores
* Players with scores below 70

### Flag = false

Displays:

* Odd team players
* Even team players
* Merged T20 and Ranji Trophy players
