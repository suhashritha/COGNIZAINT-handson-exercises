

# REST - Get Country Based on Country Code

## 📌 Project Overview

This project demonstrates a **RESTful Web Service using Spring Boot** that retrieves a specific country based on the given country code.

The country details are stored in a **Spring XML configuration file**. The application loads the country beans, searches for the requested country code, and returns the matching country details as a JSON response.

The country code search is **case insensitive**.

---

## 🎯 Objective

The objective of this project is to understand:

* Creating REST APIs using Spring Boot
* Using `@GetMapping`
* Using `@PathVariable`
* Implementing Service layer architecture
* Loading Spring beans from XML configuration
* Searching data from Spring bean list
* Converting Java objects into JSON responses

---

## 🛠️ Technologies Used

* Java 23
* Spring Boot
* Spring Web
* Spring Core XML Configuration
* Gradle
* IntelliJ IDEA
* Jackson JSON Converter

---

## 📂 Project Structure

```text
CountryCodeRESTService
│
├── build.gradle
├── README.md
│
└── src
    └── main
        ├── java
        │   └── com.cognizant.countrycoderestservice
        │       │
        │       ├── CountryCodeRestServiceApplication.java
        │       ├── Country.java
        │       │
        │       ├── controller
        │       │   └── CountryController.java
        │       │
        │       └── service
        │           └── CountryService.java
        │
        └── resources
            │
            ├── country.xml
            └── application.properties
```

---

## 🌐 REST API Details

### Endpoint

```
GET /countries/{code}
```

### URL Example

```
http://localhost:8083/countries/in
```

### Controller

```
com.cognizant.countrycoderestservice.controller.CountryController
```

### Method

```java
public Country getCountry(String code)
```

### Annotation Used

```java
@GetMapping("/countries/{code}")
```

---

## ⚙️ Spring XML Configuration

Country details are stored in `country.xml`.

Example:

```xml
<bean id="countryIndia"
      class="com.cognizant.countrycoderestservice.Country">

    <property name="code" value="IN"/>

    <property name="name" value="India"/>

</bean>
```

The XML file contains country beans:

| Code | Name          |
| ---- | ------------- |
| IN   | India         |
| US   | United States |
| DE   | Germany       |
| JP   | Japan         |

---

## 🔄 Working Flow

1. Client sends a request:

```
GET http://localhost:8083/countries/in
```

2. Spring maps the request to:

```java
getCountry(String code)
```

3. `@PathVariable` extracts the country code:

```
in
```

4. Controller calls:

```java
countryService.getCountry(code)
```

5. Service loads country beans from:

```
country.xml
```

6. Service iterates through the country list and compares codes using:

```java
equalsIgnoreCase()
```

7. Matching country object is returned.

---

## 🔍 Case Insensitive Search

The application accepts both uppercase and lowercase country codes.

Examples:

Request:

```
/countries/in
```

and

```
/countries/IN
```

Both return:

```json
{
    "code": "IN",
    "name": "India"
}
```

---

## 📤 Sample Request

```
GET http://localhost:8083/countries/in
```

---

## 📥 Sample Response

```json
{
    "code": "IN",
    "name": "India"
}
```

---

## ▶️ How to Run

### Step 1

Open the project in IntelliJ IDEA.

### Step 2

Build the project and download dependencies.

### Step 3

Run:

```
CountryCodeRestServiceApplication.java
```

### Step 4

Test the API using browser or Postman:

```
http://localhost:8083/countries/in
```

---

## 🖥️ Output

Example Response:

```json
{
    "code": "IN",
    "name": "India"
}
```

---

## 📚 SME Explanation

### What happens in Controller method?

When the user sends:

```
GET /countries/in
```

Spring calls:

```java
getCountry("in")
```

The country code is extracted using:

```java
@PathVariable
```

The controller then calls the service layer to find the matching country.

---

### How does Service find the country?

The service:

1. Loads `country.xml`
2. Retrieves all country beans
3. Stores them in a list
4. Compares the requested code with country codes
5. Returns the matching country

The comparison is done using:

```java
equalsIgnoreCase()
```

which allows case-insensitive searching.

---

### How is Java Object converted into JSON?

The controller returns a `Country` object.

Spring Boot automatically uses **Jackson JSON Converter** to convert:

Java Object:

```java
Country{
code="IN",
name="India"
}
```

into JSON:

```json
{
 "code":"IN",
 "name":"India"
}
```

---

## 📸 Output Screenshot

Add your API response screenshot here:

```
screenshots/country-response.png
```

---



--
