# JWT Authentication Service

## Overview
This project implements a JWT Authentication REST service using Spring Boot and Spring Security.

The service accepts user credentials and returns a JWT token.

## Technologies Used

- Java 23
- Spring Boot
- Spring Security
- JWT
- Gradle

## API Endpoint

### Generate JWT Token

URL:


GET http://localhost:8090/authenticate


Request:


curl -s -u user:pwd http://localhost:8090/authenticate


Response:

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9.fake-token"
}
Project Structure
AuthenticationController
Handles authentication request
Returns JWT token response
SecurityConfig
Configures Spring Security
Allows access to authentication endpoint
How to Run
Clone the repository
Run the application:
./gradlew bootRun
Test API:
curl -s -u user:pwd http://localhost:8090/authenticate
#####Output

The service returns a JWT token in JSON format.
