Feature: validate the Rediff Sign on Page

  Scenario: Successful Login
    Given User navigates to "https://mail.rediff.com/cgi-bin/login.cgi"
    When User enters username as "test" and password as "password"
    And Clicks go
    Then successful logged in

  Scenario: Validate HomePage
    Given User navigates to "https://www.rediff.com"
    When user click "Sign In"
    Then user navigates to "Rediffmail" page
    When user click "Home"
    Then user navigates to "Rediff.com" page
    When user click "Create a Rediffmail account"
    Then user navigates to "Rediffmail Free Unlimited Storage" page
