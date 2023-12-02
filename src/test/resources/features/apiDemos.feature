Feature: Verify Animation Button and TextBox in Api Demos app

  Background:
    Given I have opened the ApiDemos application

  Scenario: Verifying the Cloning Button in the Animation Page
    When I click on the Animation Button
    Then I should be able to see Cloning Button


  Scenario Outline: As I user I would like to send negative data in the Vibrate text box
    When I click on the Operating System Button
    And  I click on the Morce Code button
    Then I should type "<Text>" in the Vibrate text box
    Examples:
      | Text     |
      | Mehmet   |
      | Asli     |
      | Erva Naz |
      | Lucy     |
      | Lila     |
      | Simba    |

  Scenario Outline: Searching for a product on Amazon
    Given I have opened Amazon Mobile Web page
    When I enter "<product>" in the search bar
    Then I click on the search button
    Examples:
      | product   |
      | iPhone 11 |
      | iPhone 12 |
      | iPhone 13 |
      | iPhone 14 |
      | iPhone 15 |


  Scenario Outline: Login with valid username and password
    Given I have opened Souce Demo Web Page
    When I enter "<username>" and "<password>"
    Then I click on the login button
    And  I should be able to see header text
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |