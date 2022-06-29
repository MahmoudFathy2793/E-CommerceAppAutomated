@smoke
  Feature: F07 | guest user could follow us using icons in social media section
    Scenario Outline: user could navigate to social media links (Facebook,Twitter,RSS,Youtube)
      Given user navigates to home page
      When user scroll down to select social media icon and click on "<social>" icon
      Then user should be redirected to the required page "<link>"
      Examples:
        | social | link |
        | facebook | https://www.facebook.com/nopCommerce |
        | twitter  | https://twitter.com/nopCommerce      |
        | rss      | https://demo.nopcommerce.com/new-online-store-is-open |
        | youtube  | https://www.youtube.com/user/nopCommerce              |

