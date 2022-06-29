@smoke
  Feature: F04 | guest user could search for items in search field
    Scenario Outline: search using item name
      #Scenario 1
      Given user click on search field
      When user enter item name like "<item name>" to search for it
      And user click on search button
      Then user redirected to result search page "https://demo.nopcommerce.com/search?q="
      And user could find relative items to his search "<item name>"
      Examples:
        |item name  |
        |book       |
        |laptop     |
        |nike       |

      #Scenario 2
      Scenario Outline: search using item sku
        Given user click on search field
        When user enter item name like "<item sku>" to search for it
        And user click on search button
        Then user redirected to result search page "https://demo.nopcommerce.com/search?q="
        And user could find relative items using sku search "<item sku>"
        Examples:
          | item sku |
          | SCI_FAITH |
          | APPLE_CAM |
          | SF_PRO_11 |

