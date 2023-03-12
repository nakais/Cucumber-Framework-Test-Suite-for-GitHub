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
