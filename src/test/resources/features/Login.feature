Feature: Login

  @Login @Denys
  Scenario: Login with Valid Credentials 
  	
  	Given Login With valid credentials
  	When Verify you login in as "Admin"
  
  
  @Login @Denys
  Scenario Outline: Login with Invalid Credentials
    Given Login With invalid login "<Login>" and valid password "<Password>"
    Then verify error message "<text from page>" from the page and header "<Header>"

    Examples: 
      | Login  | Password | text from page                | Header      |
      | admin1 | admin    | Invalid User Name or Password | Login Error |  

  