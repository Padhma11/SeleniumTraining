 Feature: To validate the login functionality of facebook application
 
 Scenario: To validate login with valid username and invalid password
 Given  To launch the chrome browser and maximize window
 When  To launch the Url of the facebook application
 And  To pass valid username in email field
 And  To pass invalid password in password field
 And  To click the login button
 And  To check whether navigate to home page or not
 Then  To close the browser 
 
 Scenario Outline: To validate the positive and negative combination of login functionality
 Given User has to launch the browser and maximise the window
 When User has to hit the facebook url
 And User has to pass the data "<emaildatas>" in email field
 And User has to pass the data "<passworddatas>" in password field
 And User has to click login button
 Then User has to close the browser
 
 Examples:
|emaildatas|passworddatas|
|a@g.com|7894|
|as@g.com|1456|
|asd@g.com|!@yuyu|
|asdf@g.com|poilk|