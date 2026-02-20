# Selenium Java TestNG Maven (POM) Framework

This repository contains a starter web automation framework built with:
- Java 17
- Maven
- Selenium WebDriver
- TestNG
- Page Object Model (POM)

## Project Structure

```text
src
├── main/java/com/automation
│   ├── pages
│   │   ├── BasePage.java
│   │   ├── LoginPage.java
│   │   └── ProductsPage.java
│   └── utils
│       └── DriverFactory.java
└── test/java/com/automation
    ├── base
    │   └── BaseTest.java
    └── tests
        ├── FrameworkStructureTest.java
        └── LoginTest.java
```

## Run tests

Run framework validation test (default):

```bash
mvn test
```

Run browser UI test:

```bash
mvn test -DrunUi=true
```

Optional runtime parameters:
- `-DbaseUrl=https://www.saucedemo.com/`
- `-Dusername=standard_user`
- `-Dpassword=secret_sauce`
