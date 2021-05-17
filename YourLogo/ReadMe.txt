Project - YourLogo
Programming Language - Java
Design Pattern - Page Object Model
Build Tool - Maven
Test run - Cucumber TestNG
Execution Report - Allure


Steps to run the Test:
1. Import the project from git onto IDE - File-Import-Git-Projects from Git-next-Clone URI-Paste the Git Repo URL-Next-Next-Finish
2. Right click on the testng.xml file and select Run As-> TestNG Suite
3. After test run refresh the project and right click on allure-results folder and go to properties and copy the path
4. Open command prompt and execute the below command to get the allure report
	allure serve "path"
