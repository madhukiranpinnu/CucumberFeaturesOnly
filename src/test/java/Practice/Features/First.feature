Feature: Application Login Page
  @first
  Scenario: Login to application with default credentials
    Given  User is on the Application login page
    When   User enters "Admin" and "password"
    And    USer clicks on enter button
    Then   User lands to the homepage of the application
    And    User sees his cards added
  @second
  Scenario: Login to application with Real credentials
    Given  User is on the Application login page
    When   User enters "mkp@test.com" and "mkptest"
    And    USer clicks on enter button
    Then   User lands to the homepage of the application
    And    User sees his cards added
  @smoke @first
  Scenario: To pass integer
    Given  User is passing 25
 @regression
  Scenario: To pass float and double
    Given  User is passing value float 6.7
    Then   User passes the value double 7.99999999
