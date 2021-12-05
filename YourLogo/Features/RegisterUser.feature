Feature: Register to Your Logo App
    As a new customer to Your Logo Web site
    I should be able to register myself to Your Logo Web site

    @Priority1 
    Scenario Outline: Register to Your Logo
        Given I open YourLogo Web site
        And I click on Sign in 
		And I enter email address "<Email>" to register
        And I click on Create an account button
        When I enter Title as "<Title>"
        When I enter valid data on page
        | Test | User | abc | aaa | Lollipop street |  Melbourne |  Virginia | 30245 | 0412345678 |  Test |
        And I click on register button
        Then I am registered to YourLogo web site and the message "<Message>" is displayed on the page

        Examples:
           | Email   | Title | Message                 |
           | abc     | Mr    | Welcome to your account |