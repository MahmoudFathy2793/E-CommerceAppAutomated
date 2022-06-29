@smoke
  Feature: F01_Register | user could register with new account
    Scenario: guest user could register with valid data successfully
      Given user go to register page
      When user select gender type "Male"
      And user enter first name "dummy" and last name "user"
      And user enter date of birth day "27" month "5" year "1993"
      And user enter email "mahmoud25@example.com"
      And user fills password fields "P@ssw0rd102030" "P@ssw0rd102030"
      And user clicks on register button
      Then user redirected to register completion page "https://demo.nopcommerce.com/registerresult/1?returnUrl=/"
      And a success message is displayed "Your registration completed"
      And the color of this message is green "rgba(76, 177, 124, 1)"