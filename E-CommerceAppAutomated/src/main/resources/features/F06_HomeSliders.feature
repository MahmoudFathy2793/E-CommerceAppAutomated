@smoke
  Feature: F06 | guest user could navigate between sliders
    Scenario Outline: guest user select a slider and navigate to item page in slider
      Given user navigates to home page
      When user select a slider "<no.>"
      And user click on the item in slider "<no.>"
      Then user should be redirected to the item page "<link>"
      Examples:
        | no. | link |
        | 1   | https://demo.nopcommerce.com/nokia-lumia-1020 |
        | 2   | https://demo.nopcommerce.com/iphone-6 |