Feature: Login Features 

Scenario: Login with valid username and empty password
Given User is on "LoginPage" 
When User enter into text box "Username" "home123@abc.com"
When User enter into text box "Password" ""
Then User Clicks on Button "Login"

Scenario: Login with valid username and empty password
Given User is on "LoginPage" 
When User enter into text box "Username" "home123@abc.com"
When User enter into text box "Password" "robbin08"
Then User Clicks on Button "Login"

Scenario: Login with valid username and valid password
Given User is on "LoginPage" 
When User enter into text box "Username" "home123@abc.com"
When User enter into text box "Password" "robbin08"
Then User Clicks on CheckBox "RememberMe"
Then User Clicks on Button "Login"
Then User Clicks on UsermenuDropDown "UserMenuDropDown"
Then User Clicks on UsermenuDropDown "Logout"
Then Validate Username text box diplaying with "expectedusername"

Scenario: Test forgot password
Given User is on "LoginPage" 
When User Clicks on ForgotLink "Forgot password"
When User enter into text box "un" "home123@abc.com"
Then User Clicks on Button "Continue"

Scenario: Login with invalid username and invalid password
Given User is on "LoginPage" 
When User enter into text box "Username" "123"
When User enter into text box "Password" "22131"
Then User Clicks on Button "Login"
Then validate LoginErrorMessage "expextedErrorMessage"


Scenario: Check opportunities drop down
Given User is on "LoginPage" 
When User enter into text box "Username" "home123@abc.com"
When User enter into text box "Password" "robbin08"
Then User Clicks on CheckBox "RememberMe"
Then User Clicks on Button "Login"
Then User Clicks on Button "Opportunities"
Then validate Opportunities dropdown "expectedOppDropDown"

@smoke
Scenario: Create a new opportunities
Given User is on "LoginPage" 
When User enter into text box "Username" "home123@abc.com"
When User enter into text box "Password" "robbin08"
Then User Clicks on CheckBox "RememberMe"
Then User Clicks on Button "Login"
Then User Clicks on Button "Opportunities"
Then User Clicks on Button "New"
Then User enter into text box "Opportunities Name" "Test2"
Then User enter into text box "Account Name" "light"
Then User Clicks on account lookup window "AccSearch"
Then User Clicks on Button "Go" 
Then User Clicks on AccNameLink "AccNameLight"
Then User enter into text box "CloseDate" 
Then User enter into text box "TodayDate" 
Then User Clicks on Stage DropDown "StageDropDown" "Qualification"
Then User enter into text box "Probability" "10"
Then User Clicks on Stage DropDown "Lead Source" "Web"
Then User enter into text box "Primary Campaign Source" "GC Product Webinar - Jan 7, 2002"
Then User Clicks on Button "Save"

