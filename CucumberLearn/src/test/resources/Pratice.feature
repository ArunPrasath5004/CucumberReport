Feature: To validate the login functionality

  Scenario: Validating the login functionality with a valid credentials
    Given User should be launch the URL
    And After that provide the valid 'Arun' and 'Arun@123'
    And click the login button
    Then User should be in home screen page
