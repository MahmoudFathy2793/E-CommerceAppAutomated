@smoke
  Feature: F08 | guest user able to add items to wishlist
    #Scneario 1
    Scenario: success message appear when user add an item to wishlist
      Given user navigates to home page
      When user click on wishlist button for item "HTC One M8 Android L 5.0 Lollipop"
      Then success message is shown to inform user that item has been added to wishlist
      And color of wishlist success message should be "#4bb07a"

    #Scenario 2
    Scenario: quantity of items increments after adding an item to wishlist
      Given user navigates to home page
      When user click on wishlist button for item "HTC One M8 Android L 5.0 Lollipop"
      And user navigate to wishlist page
      Then quantity of items should be incremented in wishlist page
