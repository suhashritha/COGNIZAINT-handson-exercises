
# Hands-on 4 – Difference Between JPA, Hibernate and Spring Data JPA

## Objective
The objective of this hands-on is to understand the differences between **JPA**, **Hibernate**, and **Spring Data JPA**, and learn how they work together in a Spring Boot application.

---

## What is JPA?

**JPA (Java Persistence API)** is a Java specification (JSR 338) that defines a standard way to map Java objects to relational database tables.

### Key Points
- JPA is a **specification**, not an implementation.
- It defines APIs for persisting, reading, updating, and deleting data.
- It provides annotations such as `@Entity`, `@Table`, `@Id`, and `@Column`.
- It uses JPQL (Java Persistence Query Language).
- It requires an implementation like **Hibernate**.

---

## What is Hibernate?

**Hibernate** is a popular **Object Relational Mapping (ORM)** framework that implements the JPA specification.

### Key Points
- Implements JPA.
- Converts Java objects into database tables.
- Automatically generates SQL queries.
- Supports caching and lazy loading.
- Manages transactions and sessions.
- Reduces the need to write SQL manually.

---

## What is Spring Data JPA?

**Spring Data JPA** is a Spring module that simplifies database access using JPA.

It does **not** implement JPA. Instead, it works on top of a JPA implementation such as Hibernate.

### Key Points
- Built on top of JPA.
- Uses Hibernate internally by default.
- Reduces boilerplate code.
- Provides built-in CRUD operations.
- Supports pagination and sorting.
- Simplifies transaction management using `@Transactional`.

---

# Hibernate Example

```java
public Integer addEmployee(Employee employee) {

    Session session = factory.openSession();
    Transaction tx = null;
    Integer employeeID = null;

    try {
        tx = session.beginTransaction();
        employeeID = (Integer) session.save(employee);
        tx.commit();
    } catch (HibernateException e) {
        if (tx != null)
            tx.rollback();
        e.printStackTrace();
    } finally {
        session.close();
    }

    return employeeID;
}
```

### Observation
In Hibernate, the developer manually manages:

- Session creation
- Transaction handling
- Commit
- Rollback
- Closing the session

This results in more boilerplate code.

---

# Spring Data JPA Example

## Repository

```java
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
```

## Service

```java
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
```

### Observation

Spring Data JPA automatically handles:

- Session management
- Transaction management
- SQL generation
- CRUD operations

Only one line of code is required:

```java
employeeRepository.save(employee);
```

---

# Comparison

| Feature | JPA | Hibernate | Spring Data JPA |
|----------|-----|-----------|-----------------|
| Type | Specification | ORM Framework | Spring Module |
| Implementation | ❌ No | ✅ Yes | ❌ No |
| Database Operations | Defines API | Performs Operations | Simplifies Operations |
| Boilerplate Code | High | Medium | Very Low |
| CRUD Methods | Through Implementation | Manual | Automatic |
| Transaction Management | No | Yes | Yes |
| SQL Generation | No | Yes | Yes |
| Repository Support | No | No | Yes |

---

# Relationship

```
Spring Boot Application
        │
        ▼
Spring Data JPA
        │
        ▼
       JPA
        │
        ▼
   Hibernate
        │
        ▼
     Database
```

---

# Advantages

## JPA
- Standard Java persistence specification
- Database independent
- Portable across different ORM implementations
- Easy to switch implementations

## Hibernate
- Powerful ORM framework
- Automatic SQL generation
- Supports caching
- Supports lazy loading
- Reduces manual SQL coding

## Spring Data JPA
- Minimal boilerplate code
- Built-in CRUD methods
- Easy repository creation
- Pagination and sorting support
- Better integration with Spring Boot

---

# Conclusion

- **JPA** is a specification that defines how Java objects should be persisted.
- **Hibernate** is the implementation of JPA that provides ORM functionality.
- **Spring Data JPA** is a Spring framework that simplifies working with JPA by reducing boilerplate code and providing ready-made repository interfaces.

Together, Spring Data JPA, JPA, and Hibernate make database operations simple, efficient, and easy to maintain in modern Java applications.

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

---
