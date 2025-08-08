

This is a basic test automation framework built with **Java 17**, **Selenium WebDriver**, and **TestNG**.  
It was built for interview purposes. 


## 🔧 Technologies Used

- **Java 17**
- **Selenium WebDriver**
- **TestNG**
- **Maven 3.9.9**
- **Page Object Model (POM)** design pattern

## ⭐ Features
- **Local run only**
- **Supports Chrome and Firefox browsers:** Chrome will be selected by default
- **Supports parallel test execution:** 2 threads by default for faster feedback.
- **Automatic WebDriver management:** Drivers are downloaded and managed automatically by Selenium.
- **Basic screenshot capture on test fail:** png files will be stored in /screenshots directory.
- **Basic reporting:** /target/surefire-reports/emailable-report.html.


## 🚀 How to Run Tests

1. **Clone the repository:**

   ```
   git clone https://github.com/Miczura/InterviewPlaygSel.git

2. **Import the project into your favorite IDE (e.g., IntelliJ IDEA) as a Maven project.**
3. **Compile project:**
   ```
   mvn clean compile
4. **Run the entire test suite:**
   ```
   mvn clean test

7. **Browser selection**
   ```
   mvn clean test -Dbrowser=firefox
Tested on:

Win 10, CH, FF, Java 17.0.6, Maven 3.9.9






