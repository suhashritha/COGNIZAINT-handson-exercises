# Spring Core - Load Country from Spring XML Configuration

## 📌 Project Overview

This project demonstrates **Spring Core XML-based configuration**.
A country object is configured inside a Spring XML configuration file, and the application reads the bean details using Spring's `ApplicationContext`.

The project displays the country details stored in the Spring configuration file.

---

## 🎯 Objective

To understand:

* Spring XML configuration
* Bean creation and management
* Dependency Injection using property tags
* ApplicationContext
* ClassPathXmlApplicationContext
* Retrieving beans using `getBean()`

---

## 🛠️ Technologies Used

* Java 23
* Spring Framework 6
* Maven
* IntelliJ IDEA
* SLF4J Logging

---

## 📂 Project Structure

```
SpringCountryApplication
│
├── pom.xml
├── README.md
│
└── src
    └── main
        ├── java
        │   └── com.cognizant.springlearn
        │       │
        │       ├── Country.java
        │       └── SpringLearnApplication.java
        │
        └── resources
            │
            └── country.xml
```

---

## 📄 Spring Configuration

The country details are stored in `country.xml`.

Example:

```xml
<bean id="country"
      class="com.cognizant.springlearn.Country">

    <property name="code" value="IN"/>

    <property name="name" value="India"/>

</bean>
```

Here:

* `id` → Unique name of the Spring bean
* `class` → Java class managed by Spring
* `property` → Used for setting object values

---

## ⚙️ Implementation Details

### Country Class

The `Country` class contains:

* `code` variable to store country ISO code
* `name` variable to store country name
* Default constructor with logging
* Getter and setter methods with logging
* `toString()` method to display object details

---

### Loading Spring Configuration

The application loads the XML configuration using:

```java
ApplicationContext context =
new ClassPathXmlApplicationContext("country.xml");
```

The country bean is retrieved using:

```java
Country country =
context.getBean("country", Country.class);
```

---

## ▶️ How to Run

### Step 1: Clone Repository

```
git clone <repository-url>
```

### Step 2: Open Project

Open the project in IntelliJ IDEA.

### Step 3: Download Maven Dependencies

Reload Maven dependencies.

### Step 4: Run Application

Execute:

```
SpringLearnApplication.java
```

---

## 🖥️ Output

```
Inside Country Constructor.

Inside setCode method.

Inside setName method.

Country : Country{code='IN', name='India'}
```

---

## 📚 Learning Outcomes

After completing this project, I learned:

* Basics of Spring Core framework
* XML-based bean configuration
* Bean lifecycle in Spring
* Dependency Injection
* Using ApplicationContext
* Retrieving Spring-managed objects



This project is created for educational purposes.
