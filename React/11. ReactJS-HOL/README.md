
# EventExamplesApp

A React JS application developed to demonstrate React event handling concepts.
This project implements different events, event handlers, synthetic events, state management, and form handling.

## Features

* Increment counter value using button click event
* Decrement counter value using button click event
* Invoke multiple methods from a single button click

  * Increment counter
  * Display Hello message
* Pass arguments to event handler functions
* Implement synthetic events
* Convert Indian Rupees to Euro using a form event

## Technologies Used

* React JS
* JavaScript (ES6)
* HTML
* CSS
* Node.js
* NPM

## Project Structure

```text
eventexamplesapp
│
├── public
│
├── src
│   ├── components
│   │   └── CurrencyConvertor.js
│   │
│   ├── App.js
│   ├── index.js
│
├── package.json
├── package-lock.json
└── README.md
```

## React Events Implemented

### Click Event

The `onClick` event is used to handle button clicks.

Example:

```javascript
<button onClick={this.increment}>
Increase
</button>
```

### Event Handlers

Functions are created to perform actions when events occur.

Implemented handlers:

* `increment()`
* `decrement()`
* `sayHello()`
* `sayWelcome()`
* `handleSubmit()`

### Synthetic Events

React provides a wrapper around browser events called Synthetic Events.

Example:

```javascript
onClick={this.onPress}
```

Displays:

```
I was clicked
```

### State Management

React state is used to store and update:

* Counter value
* Currency values

## Currency Converter

The CurrencyConvertor component converts Indian Rupees into Euros.

Conversion logic:

```
Euro = Rupees / 90
```

The conversion is triggered using the button click event.

## Installation

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to project folder:

```bash
cd eventexamplesapp
```

Install dependencies:

```bash
npm install
```

## Running the Application

Start the React development server:

```bash
npm start
```

Application runs at:

```
http://localhost:3000
```

## Learning Outcomes

* Understanding React events
* Creating event handlers
* Working with Synthetic Events
* Using `this` keyword in React class components
* Handling form input events
* Updating state using `setState()`
