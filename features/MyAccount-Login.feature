Feature: MyAccount-Login Feature
Description: This feature will test a login functionality 

#Simple login without parameters

#Scenario: Log-in with valid username and password

#Given open browser 
#When Enter URL "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username and password
#And Click on login button 
#Then User must successfully login to the web page





#Simple login without parameters

#Scenario: Log-in with valid username and password

#Given open browser 
#When Enter URL "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered "pavanoltraining" and "Test@selenium123"
#And Click on login button 
#Then User must successfully login to the web page



#Simple login with scenario and example keywords 

#Scenario Outline: Log-in with valid username and password

#Given open browser 
#When Enter URL "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered "<username>" and "<password>"
#And Click on login button 
#Then Verify Login 


#Examples:
#	| username        |    password     |
#	| pavanoltraining | Test@selenium   |
#	| pavanol		  | pavanoltraining	|
#	| pavanoltraing	  | pavanoltraining |
	




# simple login with data table parameter s
#Scenario: Log-in with valid username and password

#Given open browser 
#When Enter URL "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username and password
	#| pavanoltraining | Test@selenium123 |
#And Click on login button 
#Then User must successfully login to the web page



# simple login with data table parameter s
Scenario: Log-in with valid username and password

Given open browser 
When Enter URL "http://practice.automationtesting.in/"
And Click on My Account Menu
And Enter registered username and password
	|  user			  |  password		 |
	| pavanoltraining | Test@selenium123 |
And Click on login button 
Then User must successfully login to the web page








