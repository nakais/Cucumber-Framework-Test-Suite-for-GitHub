# Cucumber-Framework-Test-Suite-for-GitHub
This project is aimed at testing the search functionality and About page of GitHub using Cucumber Framework.

## Acceptance Criteria

1. As a guest (not logged in), when searching GitHub for the term "create-react-app" from the landing page search input, you will see: A count of matching results.
2. You will find and verify "facebook/create-react-app " project as the first result.
3. As a guest, when clicking the "About" button in the landing page footer, you will be taken to the GitHub "About" page. Verify, you are on about page.

## Prerequisites
- Java
- Maven
- Chrome Browser

## Running the Test Suite
1. Clone this repository to your local machine.
2. Open the terminal or command prompt and navigate to the project directory.
3. Execute the following command to run the test suite:
```
mvn test
```
## Test Scenarios
The following scenarios are included in this test suite:
```
Feature: GitHub Search and About Page

  Scenario Outline: Verify search and project details
    Given I am on the GitHub homepage
    When I search for "<searchData>"
    Then I should see "<expectedTitle>" as the first result

    Examples:
      | searchData       | expectedTitle             |
      | create-react-app | facebook/create-react-app |

  Scenario: Verify About page
    Given I am on the GitHub homepage
    When I click the "About" link in the footer
    Then I should be on the GitHub About page
```    
## Cucumber HTML report:

![cumcumberhtmlreprt](https://user-images.githubusercontent.com/52671754/224529569-2933fa6e-8f02-4965-9a76-46002b2ed706.png)

    
