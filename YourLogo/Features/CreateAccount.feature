Feature: Register to Your Logo App
    As a new customer to Your Logo Web site
    I should be able to create account for myself in Your Logo Web site

    @Priority1 
    Scenario Outline: Create Account
        Given I open YourLogo Web site
        And I click on Sign in 
		When I enter email address "<Email>" to register
        And I click on Create an account button
        Then I see the message "<Message>" on Create Account page
        
        Examples:
           | Email   | Message           | 
           | abc     | Create an account |