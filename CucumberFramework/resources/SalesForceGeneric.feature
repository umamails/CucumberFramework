Feature: Login Features 

Scenario: Login with valid username and valid password
Given User is on "LoginPage" 
When User enter into text box "Username" "home123@abc.com"
When User enter into text box "Password" "robbin08"
Then User Clicks on CheckBox "RememberMe"
Then User Clicks on Button "Login"


Scenario: Login with valid username and Invalid password
Given User is on "LoginPage"
When User enter into text box "Username" "home123@abc.com"
When User enter into text box "Password" "robbin08"
Then User Clicks on CheckBox "RememberMe"
Then User Clicks on Button "Login"