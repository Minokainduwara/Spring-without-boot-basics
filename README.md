# 🌱 Spring Without Boot — Core Fundamentals

> Master the internals of the Spring Framework before trusting the magic of Spring Boot.

---

## 📌 What Is This Project?

**Spring Without Boot — Basics** is a hands-on learning project that strips away Spring Boot's auto-configuration and forces you to build things the raw way — manually wiring beans, configuring the application context, and managing dependencies yourself.

If you've ever wondered *what Spring Boot is actually doing for you*, this project is your answer.

---

## 🎯 Learning Objectives

By working through this project, you will:

- Understand **Inversion of Control (IoC)** and why it matters
- Master **Dependency Injection (DI)** — constructor, setter, and field injection
- Configure beans using both **XML** and **annotations**
- Manage the **Bean lifecycle** (initialization, destruction, scopes)
- Work directly with the **ApplicationContext** and **BeanFactory**
- Build layered applications (Controller → Service → DAO) without Boot scaffolding
- Appreciate exactly what Spring Boot automates once you've done it manually

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| ☕ Java | Core language |
| 🌱 Spring Core / Context / Beans | Framework fundamentals |
| 🧩 Maven | Build and dependency management |
| 🗄️ JDBC / MySQL *(optional)* | Database connectivity |

---

## 📂 Project Structure

```
Spring-without-boot-basics/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/
│       │       ├── config/          # Spring configuration classes
│       │       ├── controller/      # Controller layer
│       │       ├── service/         # Business logic
│       │       └── dao/             # Data access layer
│       └── resources/
│           └── applicationContext.xml   # XML bean configuration
├── pom.xml
└── README.md
```

---

## ⚙️ Core Concepts Covered

### 🔹 Inversion of Control (IoC)
The Spring IoC container takes ownership of object creation and lifecycle management. Instead of your code creating its own dependencies, the container injects them — giving control to the framework.

### 🔹 Dependency Injection (DI)
Spring wires objects together automatically. This project demonstrates all three injection styles:
- **Constructor injection** — dependencies passed at creation time
- **Setter injection** — dependencies set after construction
- **Field injection** — injected directly via `@Autowired`

### 🔹 Bean Configuration
- **XML-based** — classic `applicationContext.xml` with `<bean>` definitions
- **Annotation-based** — `@Component`, `@Service`, `@Repository`, `@Autowired`, `@Qualifier`
- **Java-based** — `@Configuration` classes with `@Bean` methods

### 🔹 Bean Lifecycle & Scopes
Understanding how beans are created, initialized, used, and destroyed — and the difference between `singleton`, `prototype`, and other scopes.

### 🔹 ApplicationContext
The central Spring container interface. This project uses it directly to bootstrap the application and retrieve beans, exposing exactly what Spring Boot hides behind `SpringApplication.run()`.

---

## ▶️ Getting Started

### Prerequisites

- Java 11+
- Maven 3.6+

### 1. Clone the Repository

```bash
git clone https://github.com/Minokainduwara/Spring-without-boot-basics.git
cd Spring-without-boot-basics
```

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Application

```bash
mvn exec:java
```

Or run the main class directly from your IDE by locating and executing the class containing `public static void main(String[] args)`.

---

## 💡 Why Learn Spring Without Boot?

Most developers jump straight to Spring Boot, which works great — until something breaks and you have no idea why.

Learning Spring without Boot gives you:

| Benefit | Detail |
|---|---|
| 🔍 Deeper understanding | Know what's happening behind every annotation |
| 🐛 Better debugging | Trace issues to their root cause without guessing |
| 💪 Stronger fundamentals | Concepts that apply across frameworks and languages |
| 🚀 Boot appreciation | Understand *exactly* what Boot automates for you |
| 🏢 Enterprise readiness | Many large codebases still use manual Spring configuration |

> "Learning Spring Core first makes you a significantly better Spring Boot developer. You stop treating annotations as magic and start treating them as tools."

---

## 📸 Sample Use Cases in This Project

- ✅ Bean lifecycle demonstration (init, destroy, scope)
- ✅ Layered architecture — Controller → Service → DAO
- ✅ XML vs annotation configuration comparison
- ✅ Manual ApplicationContext bootstrapping
- ✅ Simple CRUD operations *(with optional JDBC/MySQL)*

---

## 🚧 Roadmap

- [ ] Spring MVC integration (DispatcherServlet, manual setup)
- [ ] REST API implementation without Boot
- [ ] MySQL database connection via JDBC Template
- [ ] Unit testing with Spring Test context
- [ ] Side-by-side comparison: Pure Spring vs Spring Boot equivalent

---

## 🤝 Contributing

Contributions are welcome! If you'd like to add examples, fix issues, or improve documentation:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add: your feature description'`)
4. Push to your branch (`git push origin feature/your-feature`)
5. Open a Pull Request

Please keep examples focused on core Spring concepts and avoid introducing Spring Boot dependencies.

---

## ⭐ Support

If this project helped you understand Spring better, consider giving it a star — it helps others find it too.

---

## 👨‍💻 Author

**Minoka Induwara**

Aspiring Software Engineer passionate about backend development, enterprise Java, and building things that scale.

- 🔗 [GitHub](https://github.com/Minokainduwara)

---

*Built with curiosity, coffee, and a refusal to let Spring Boot hide the good stuff.* ☕
