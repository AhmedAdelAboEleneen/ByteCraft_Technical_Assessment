  # **_Web Testing Framework_**

## Tools Needed

* IntelliJ[(IntelliJ IDEA Community Edition
)](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC)
* Java minimum 17

## Framework Structure

### Main Folder

* ###  utilities
    **Contain** :
  * **ElementActions** class : Contains wrapped needed element action functionalities
  * **ScrollActions** class: Contains wrapped needed scroll functionalities
  * **VerifyAction** class: Contains verification needed wrapper functions
  * **WebBrowser** class: Contains driver logic
  * **Reader package**: Contains
    * JsonReader
    * PropertiesReader
  * **Pages package**: Contains 
    * Package for each project
      * Class for each page

## Requirments:
- Java Development Kit (JDK) 18: You can download JDK 18 from the Oracle website or use any other provider like OpenJDK.
- Apache Maven: Download and install Maven from the Apache Maven website.
- Allure Command-Line Tool: Install Allure from the Allure GitHub page.

## How to run Test
* From xml file
* From Test class
* From terminal by mvn command: `mvn clean test -DsuiteXmlFile=testng.xml` 

## How To Generate Allure Report

* From terminal by mvn command: `mvn allure:serve` 


  



