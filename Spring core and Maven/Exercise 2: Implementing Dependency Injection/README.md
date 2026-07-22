
# Library Management System - Spring XML Dependency Injection

## Overview

This project demonstrates Dependency Injection using the Spring Framework with XML-based configuration.

The application shows how Spring IoC Container manages object creation and injects dependencies between classes.

## Technologies Used

- Java 23
- Spring Framework 6
- Maven
- XML Configuration
- IntelliJ IDEA

## Project Structure
src/main/java
└── com.library
├── MainApp.java
├── service
│ └── BookService.java
└── repository
└── BookRepository.java

src/main/resources
└── applicationContext.xml

## Concepts Implemented

- Spring IoC Container
- Dependency Injection
- Setter Injection
- XML Bean Configuration
- ApplicationContext
- ClassPathXmlApplicationContext

## How It Works

1. Spring reads the `applicationContext.xml` file.
2. The IoC container creates BookRepository and BookService objects.
3. Spring injects BookRepository dependency into BookService using setter injection.
4. MainApp retrieves the BookService bean from the Spring container.

## Configuration Example

```xml
<bean id="bookRepository"
      class="com.library.repository.BookRepository"/>

<bean id="bookService"
      class="com.library.service.BookService">

    <property name="bookRepository"
              ref="bookRepository"/>

</bean>
Output
Book Service Started
Book saved successfully
