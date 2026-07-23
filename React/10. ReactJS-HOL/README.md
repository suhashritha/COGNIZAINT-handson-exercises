
# OfficeSpaceRentalApp

A React JS application developed using JSX to create elements, display office space details, and render data dynamically to the DOM.

This project demonstrates React JSX syntax, JavaScript expressions, objects, arrays, mapping, and inline CSS styling.

## Features

* Display heading using JSX elements
* Display office image using JSX attributes
* Create office objects with details:

  * Office Name
  * Rent
  * Address
* Display multiple office spaces using array of objects
* Render data dynamically using `map()`
* Apply inline CSS in JSX
* Display rent color conditionally:

  * Red if rent is below ₹60,000
  * Green if rent is above ₹60,000

## Technologies Used

* React JS
* JavaScript (ES6)
* JSX
* HTML
* CSS
* Node.js
* NPM

## Project Structure

```text
officespacerentalapp
│
├── public
│
├── src
│   ├── App.js
│   ├── App.css
│   ├── index.js
│   └── office.jpg
│
├── package.json
├── package-lock.json
└── README.md
```

## JSX Concepts Implemented

### JSX Elements

Used JSX syntax to create React elements like headings, paragraphs, images, and div containers.

### React.createElement()

JSX is converted internally into React.createElement() calls by Babel.

### JavaScript Expressions

JavaScript values are displayed inside JSX using curly braces `{ }`.

Example:

```javascript
{office.name}
```

### Rendering JSX to DOM

React renders JSX elements into the browser DOM using the React rendering process.

### Inline CSS

CSS styles are applied directly using the `style` attribute.

Example:

```javascript
style={{color:"blue"}}
```

### Conditional Styling

Rent color changes based on value:

* Rent < 60000 → Red
* Rent >= 60000 → Green

## Installation

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to project folder:

```bash
cd officespacerentalapp
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

The application will run at:

```text
http://localhost:3000
```

## Output

The application displays:

* Office Space heading
* Office image
* Individual office details
* List of available office spaces
* Rent displayed with conditional colors

## Learning Outcomes

* Understanding JSX syntax
* Creating React elements
* Using JavaScript expressions in JSX
* Working with objects and arrays
* Rendering dynamic data
* Applying inline CSS styles
