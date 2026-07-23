
# TicketBookingApp

A React JS application developed to demonstrate conditional rendering concepts in React.
This project allows guest users to view flight details and logged-in users to book flight tickets.

## Features

* Display flight details for guest users
* Login functionality for users
* Logout functionality to return to guest page
* Conditional rendering based on login status
* Element variables for rendering components
* Prevent unnecessary component rendering

## Technologies Used

* React JS
* JavaScript (ES6)
* HTML
* CSS
* Node.js
* NPM

## Project Structure

```text
ticketbookingapp
│
├── public
│
├── src
│   ├── components
│   │   ├── GuestPage.js
│   │   └── UserPage.js
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

The application displays different components based on the login status.

* If the user is not logged in:

  * Guest page is displayed
  * Flight details are shown

* If the user is logged in:

  * User page is displayed
  * Ticket booking option is available

### Element Variables

An element variable is used to store the component that needs to be rendered.

Example:

```javascript
let page;

if(isLoggedIn){
    page = <UserPage />;
}
else{
    page = <GuestPage />;
}
```

### Login and Logout Handling

Login button changes the state to display the user page.

Logout button changes the state back to display the guest page.

## Installation

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project folder:

```bash
cd ticketbookingapp
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

The application runs at:

```text
http://localhost:3000
```

## Output

### Guest User

Displays:

* Flight details
* Login button
* Message to login for booking

### Logged In User

Displays:

* Welcome message
* Book Ticket option
* Logout button

## Learning Outcomes

* Understanding React conditional rendering
* Working with component rendering
* Using state for login status
* Implementing login/logout functionality
* Controlling component visibility
