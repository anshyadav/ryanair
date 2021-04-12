# ryanair
> Test Automation framework built for Ryanair Airlines using Cucumber, Selenium, Java, Junit with BDD approach.

'Ryanair Automation Framework' is UI autoamtion framework. This is ready to deploy for the Ryanair and easily customizable for the multi-pages web apps. The implementation strives to be simple and free of unnecessary dependencies.

[![forthebadge](https://forthebadge.com/images/badges/check-it-out.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/works-on-my-machine.svg)](https://forthebadge.com)

## Programming Languages

- [![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)
- [![forthebadge](https://forthebadge.com/images/badges/open-source.svg)](https://forthebadge.com)

## Tools Used

- Eclipse IDE - Java Development Kit
- Maven - A build tool
- Eclipse Cucumber Plugin - For Test projects using BDD approach
- Versioning Tool: Git
- Selenium - Open source UI automation tool
- JUnit - Unit testing framework
- Docker - For running test in isolated containers
- WebDriver Manager - Library to handle the setup of different drivers like chrome or safari


## Goals

- An easily maintainable, scalable robust framework.
- Support for cross browser testing
- Better HTMl reporting
- Support for Windows, Mac and Linux
- JavaScript requirement for client browsers
- Tested on major browsers - Google Chrome and Safari

## Structure
![code structure](https://user-images.githubusercontent.com/1428641/114463084-dba37d80-9bdb-11eb-95c6-485875739b33.png)

- `com.ryanair.automation.cucumberOptions` It contains the driver utility classes, page elements classes, file data reader classes, etc.
- `com.ryanair.automation.features` It contains all the feature files containing the business scenarios in the gherkin.
- `com.ryanair.automation.stepDefinitions` it contains all the steps liked to the feature files.
- `com.ryanair.automation.utils` It contains common utility classes like property file reader, test data reader and util library etc.
- `com.ryanair.automation.webpages` It contains the web elements organized according to the web pages and the actions that can be performed on those elements. It has two sub-packages, namely, elements and functions. The elements package has page classes that contain only elements on the web page. However, in the functions package, you will find the classes that perform actions on those page elements arranged according to the web pages.
- `application.properties` This file contains all the global configurations required by this automation framework.
- `docker-compose.yaml` Config file to configure and set the base for running the automation test in the container.
- `pom.xml` Atomic unit of the framework which holds all the knowledge of the project, dependencies and configurations to build a project.
- `testdata.json` JSON file which contains all the test data required by the test scenarios.

## Report
![report](https://user-images.githubusercontent.com/1428641/114463259-1a393800-9bdc-11eb-9d5c-27b661f97bd2.png)

## Steps To Run
1. Checkout or clone this github repository: https://github.com/anshyadav/ryanair.
2. Install Eclipse (In the Eclipse Installer choose - Eclipse for Java Developers).
3. Open Eclipse and check for Maven plugin (Eclipse > Help > Marketplace > Installed). If Maven is not there then install the Maven plugin and restart the Eclipse.
4. [Optional] Install the Cucumber Eclipse plugin : https://marketplace.eclipse.org/content/cucumber-eclipse-plugin. Restart the Eclipse.
5. Install Java(JDK) 1.7+ version.
6. [Optional] Set the JAVA_HOME path in environment variables.
7. Import the cloned reposiorty as 'Existing Maven Project'.
8. Right click project > Maven > Update Project.
9. Right click CucumberOptions/TestRunner.java and Run as JUnit.
Or
10. Change application.properties, browser value to 'docker-chrome'. In terminal run docker-compose up and right click CucumberOptions/TestRunner.java and Run as JUnit.


## Contributing

- Open issue, discuss proposal
- Fork and clone repository
- Change code and update
- Review changes
- Send pull request

## License

None

