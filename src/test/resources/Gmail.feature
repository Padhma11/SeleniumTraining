Feature: To validate the login functionality of gmail

Scenario Outline: To validate the login functionality of gmail with different users
Given User has to launch the browser and maximise the browser
When User has to launch the gmail url
And User has to pass email address "<emaildata>" in email field
And User has to click next button
Then User has to close the entire browser

Examples:
|emaildata|
|Amy@gmail.com|
|Aishu@gmail.com|
|Aarav@gmail.com|
|Aa@gmail.com|
	