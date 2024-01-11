# References

- https://en.wikipedia.org/wiki/Don%27t_repeat_yourself
- https://en.wikipedia.org/wiki/KISS_principle
- https://en.wikipedia.org/wiki/SOLID
- see also: object pattern and page object factory pattern

# Project dependencies

## Lombok

- lombok documentation: https://projectlombok.org/features/all

## Spring

- spring documentation: https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/

## Testng

- testng documentation: https://testng.org/doc/documentation-main.html

## Selenium

- selenium documentation: https://www.selenium.dev/documentation/en/webdriver/

## Maven

- maven documentation: https://maven.apache.org

# Preconditions

- install maven http://maven.apache.org/download.cgi#
- install intellij community edition https://www.jetbrains.com/idea/
- install open java 8 or higher https://openjdk.java.net/
- install following intellij plugins: cucumber, gherkin, lombok

## Configuration

- configure maven env variables https://www.tutorialspoint.com/maven/maven_environment_setup.htm
- configure java env variables https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html

## Downloading webdriver

- execute download.sh or download.bat in resources.driver.linux/macos/windows folder (depends on system that you are
  using)

# Executing tests

## Executing tests from commandline

- Rebuilding project with all changes, execute tests and generating report: maven clean install
- Executing already compiled tests from target folder but without generating cucumber report: mvn test

## Overriding default configuration
- executing tests that using configuration file from classpath:/resources/config/dev.yml: mvn test
  -Dconfig.file=sparta-dev3
- executing tests that using different operating system: mvn install -Ddriver-details.os=windows

# Executing tests from intellij

- open intellij and click on Run -> edit configuration
- add new maven configuration
- in command line property set: clean install -Dcucumber.filter.tags=@login   (where @compliance is your tagged test
  case)
- click on play button and set previously created configuration

# Reporting

## generating cucumber reports

- after every test execution by "install" command - maven is creating cucumber report in
  ui_test_automation/target/generated-report/index.html

# Creating tests

## adding page objects

- add @Scope("cucumber-glue") and @Component under all page objects
- inject object by call @Autowire under filed or constructor


 