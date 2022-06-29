@smoke
  Feature: F02_Login | user should be able to login to his account
    Scenario: guest user could successfully login using valid credentials
      Given user navigate to login page
      When user enter valid email "mahmoud25@example.com"
      And user enter valid password "P@ssw0rd102030"
      And user press on login button
      Then user login to the system successfully
