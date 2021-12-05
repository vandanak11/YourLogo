Feature: Logout and Login to Your Logo Web site
    As a user of Your Logo Web site
    I should be able to logout and login back to the web site

    @Priority1 
    Scenario Outline: Logout and Login
        Given I open YourLogo Web site
        And I click on Sign in button
        And I enter Email address "<Email>" and Password "<Password>" on home page
        When I click on SignIn button on Login form
        Then I am logged in to YourLogo web site and correct name "<username>" is displayed on the page
        
        Examples:
        	| Email               | Password | username     |
        	| usertest1@email.com | test1    | user test    |