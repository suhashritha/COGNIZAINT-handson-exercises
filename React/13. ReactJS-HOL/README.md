
# BloggerApp

A React JS application developed to demonstrate different types of conditional rendering and component-based design.

The application contains Book Details, Blog Details, and Course Details components and uses React conditional rendering techniques to display content dynamically.

## Features

* Display Book Details
* Display Blog Details
* Display Course Details
* Implement multiple conditional rendering techniques
* Render multiple components dynamically
* Use list components
* Use React keys for list rendering
* Extract reusable components
* Display data using `map()` function

## Technologies Used

* React JS
* JavaScript (ES6)
* HTML
* CSS
* Node.js
* NPM

## Project Structure

```text id="9g7r6m"
bloggerapp
│
├── public
│
├── src
│   ├── components
│   │   ├── BookDetails.js
│   │   ├── BlogDetails.js
│   │   └── CourseDetails.js
│   │
│   ├── App.js
│   ├── index.js
│
├── package.json
├── package-lock.json
└── README.md
```

## React Concepts Implemented

### Conditional Rendering

Different approaches of conditional rendering are implemented:

### 1. If-Else Conditional Rendering

Components are displayed based on conditions using JavaScript if-else statements.

Example:

```javascript id="n9h8gq"
if(show==="book"){
    return <BookDetails />;
}
```

### 2. Ternary Operator

A component is rendered based on a condition using the ternary operator.

Example:

```javascript id="e6m3f8"
condition ? Component1 : Component2
```

### 3. Logical AND Rendering

Components are displayed only when the condition is true.

Example:

```javascript id="qz3r9b"
show==="blog" && <BlogDetails />
```

## List Components

The application uses arrays to store data and displays items dynamically using the `map()` function.

Example:

```javascript id="z8l4tq"
books.map((book)=>(
    <li key={book.id}>
        {book.name}
    </li>
))
```

## Keys in React

Unique keys are assigned to list items to help React identify and update elements efficiently.

Example:

```javascript id="n5x4pd"
key={book.id}
```

## Components

### BookDetails Component

Displays book information using list rendering.

### BlogDetails Component

Displays blog titles dynamically.

### CourseDetails Component

Displays available courses.

## Installation

Clone the repository:

```bash id="j4d5ph"
git clone <repository-url>
```

Navigate to project folder:

```bash id="k2kq3m"
cd bloggerapp
```

Install dependencies:

```bash id="w9x4tz"
npm install
```

## Running the Application

Start the React development server:

```bash id="p6v2cf"
npm start
```

Application runs at:

```text id="5h6m2q"
http://localhost:3000
```

## Learning Outcomes

* Understanding React conditional rendering
* Working with multiple components
* Creating reusable list components
* Using keys in React lists
* Rendering dynamic data using `map()`
* Managing component display logic
