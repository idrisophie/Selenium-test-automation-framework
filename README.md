# Selenium Test Automation Framework

A maintainable web UI test automation framework built with **Java, Selenium WebDriver, TestNG, and Maven**, following the **Page Object Model (POM)** design pattern.

This project demonstrates test automation best practices, reusable components, structured test cases, and automated execution for web applications.

## Technologies Used

- **Java** — Programming language
- **Selenium WebDriver** — Browser automation
- **TestNG** — Test execution and test organization
- **Maven** — Dependency management and build automation
- **Page Object Model (POM)** — Test architecture and maintainability
- **Git & GitHub** — Version control

## Project Structure

```text
selenium-test-automation-framework/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/
│   │           └── LoginPage.java
│   └── test/
│       └── java/
│           └── tests/
│               └── LoginTest.java
├── pom.xml
├── testng.xml
└── README.md
```

## Key Features

- Automated web UI testing with Selenium WebDriver
- Page Object Model (POM) implementation
- Reusable page classes and test methods
- Test organization and execution with TestNG
- Dependency management with Maven
- Clear separation between test logic and page interactions
- Maintainable and scalable test architecture

## Prerequisites

Make sure you have installed:

- Java JDK 17 or later
- Apache Maven
- Google Chrome or another supported browser
- Git

## Installation

**1. Clone the repository**

```bash
git clone https://github.com/YOUR_USERNAME/Selenium-test-automation-framework.git
```

**2. Navigate to the project directory**

```bash
cd Selenium-test-automation-framework
```

**3. Install dependencies**

```bash
mvn clean install
```

## Running the Tests

Execute the complete test suite:

```bash
mvn test
```

Execute the tests using the TestNG suite configuration:

```bash
mvn test -Dsurefire.suiteXmlFiles=testng.xml
```

## Page Object Model (POM)

The framework follows the Page Object Model design pattern:

- **Page classes:** Contain web element locators and page interaction methods.
- **Test classes:** Contain test scenarios and assertions.
- **TestNG:** Organizes and executes test cases.
- **Maven:** Manages dependencies and test execution.

This separation improves code reusability, readability, and maintainability.

## Testing Scope

The framework can be extended to automate scenarios such as:

- Login and logout
- Form validation
- Navigation between pages
- Positive and negative test cases
- Error message validation
- End-to-end user workflows

## Future Improvements

- Add explicit waits and reusable utilities
- Implement data-driven testing
- Add screenshots on test failures
- Generate automated test reports
- Integrate the test suite into a Jenkins CI/CD pipeline
- Add cross-browser testing

## Learning Objectives

This project aims to develop practical skills in:

- UI test automation
- Selenium WebDriver
- TestNG test management
- Maven build automation
- Page Object Model implementation
- Test framework design and maintenance

## Author

**Mohammed El Idrissi**

GitHub: [@idrisophie](https://github.com/idrisophie)

---

*This project is intended for learning, practicing, and demonstrating web test automation skills.*