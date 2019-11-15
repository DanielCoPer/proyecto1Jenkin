		@tag
		Feature: Login Feature
		As a user i should be able to log in so i can see my profile pages
	
 		@tag1
  	Scenario: As a user I should be able to log in with valid credentials
    Given User open the browser
    And User navigate to the following page "http://automationpractice.com/index.php"
    And User click on Sign in
    When User enter valid email address "test800@hotmail.com"
    And User enter valid password "test123"
    And User click sign in button
    Then User should be in profile page
	
	  @tag2
    Scenario: As a user I should not be able to log in with wrong password
		Given User open the browser
    And User navigate to the following page "http://automationpractice.com/index.php"
    And User click on Sign in
    When User enter valid email address "test800@hotmail.com"
    And User enter invalid password "prueba123"
    And User click sign in button
    Then User get a message notifying that credentials are wrong and user is not able to log in
    
    @tag3
    Scenario: As a user I should get a valid message when I click sign in without information
    Given User open the browser
    And User navigate to the following page "http://automationpractice.com/index.php"
    And User click on Sign in
    When User click Sign in button without enter information
    Then User get a message notifying about required information
    
    @tag4
    Scenario: As  a user I should get a valid message when I enter an invalid email
    Given User open the browser
    And User navigate to the following page "http://automationpractice.com/index.php"
    And User click on Sign in
    When User enter valid email address "testo800@hotmail.com"
    And User enter invalid password "prueba123"
    When User click Sign in button without enter information
    Then User get a message notifying about required information
    