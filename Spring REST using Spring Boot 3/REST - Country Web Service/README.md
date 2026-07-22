
# REST - Country Web Service

## 📌 Project Overview

This project demonstrates a **RESTful Web Service using Spring Boot** that returns India country details.

The country information is stored as a **Spring XML bean configuration**, loaded using `ApplicationContext`, and exposed through a REST API endpoint.

---

## 🎯 Objective

The objective of this project is to understand:

* Creating REST APIs using Spring Boot
* Using `@RestController`
* Using `@RequestMapping`
* Loading Spring beans from XML configuration
* Converting Java objects into JSON responses
* Understanding HTTP request and response headers

---

## 🛠️ Technologies Used

* Java 23
* Spring Boot
* Spring Web
* Spring Core XML Configuration
* Maven/Gradle
* IntelliJ IDEA
* Jackson JSON Converter

---

## 📂 Project Structure

```text
CountryRESTService
│
├── build.gradle
├── README.md
│
└── src
    └── main
        ├── java
        │   └── com.cognizant.countryrestservice
        │       │
        │       ├── CountryRestServiceApplication.java
        │       ├── Country.java
        │       │
        │       └── controller
        │           └── CountryController.java
        │
        └── resources
            │
            ├── country.xml
            └── application.properties
```

---

## ⚙️ Spring XML Configuration

The country details are stored in `country.xml`.

```xml
<bean id="countryIndia"
      class="com.cognizant.countryrestservice.Country">

    <property name="code" value="IN"/>

    <property name="name" value="India"/>

</bean>
```

The XML configuration creates a Spring-managed bean with:

* Country Code: `IN`
* Country Name: `India`

---

## 🌐 REST API Details

### Endpoint

```
GET /country
```

### URL

```
http://localhost:8083/country
```

### Controller

```
com.cognizant.countryrestservice.controller.CountryController
```

### Method

```java
public Country getCountryIndia()
```

### Annotation Used

```java
@RequestMapping("/country")
```

---

## 🔄 Working Flow

1. Client sends request:

```
GET http://localhost:8083/country
```

2. Spring Boot calls:

```java
getCountryIndia()
```

3. Controller loads Spring XML configuration:

```java
ApplicationContext context =
new ClassPathXmlApplicationContext("country.xml");
```

4. India country bean is retrieved:

```java
context.getBean("countryIndia", Country.class);
```

5. Country object is returned.

6. Spring converts the Java object into JSON response using Jackson.

---

## 📤 Sample Response

```json
{
    "code": "IN",
    "name": "India"
}
```

---

## ▶️ How to Run

### Step 1

Clone the repository:

```bash
git clone <repository-url>
```

### Step 2

Open the project in IntelliJ IDEA.

### Step 3

Run:

```
CountryRestServiceApplication.java
```

### Step 4

Open browser or Postman:

```
http://localhost:8083/country
```

---

## 🖥️ Output

REST API Response:

```json
{
    "code": "IN",
    "name": "India"
}
```

---

## 📚 Learning Outcomes

Through this project, I learned:

* Creating RESTful services using Spring Boot
* Using controllers to handle HTTP requests
* Spring XML bean configuration
* Dependency injection using Spring
* Object to JSON conversion
* Testing REST APIs using browser and Postman

---

## 👩‍💻 Author

**Ruttala Renuka**

B.Tech Computer Science Engineering (AI)

---

## 📄 License

This project is created for learning and educational purposes.
