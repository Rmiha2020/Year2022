@amazon
Feature: create an account 

Scenario Outline: Verify the error message by creating a invalid account 

Given user  on Amazon homepage 
When  user clicks on  Hello  Sign In button 
And   user Clicks  on Create An Amazon Account button  
And user enter "<yourName>"
And user enters  email as "<eMail>"
And user enters  password as "<password>"
And user enters repaswword as  "<rePassword>"
And user clicks on Continue button 
Then user verifies the error message 

Examples:
|yourName |eMail                  |password                |rePassword                 |
|addidas  |addrt@aoil.com         |nikerocks11             |nikerocks11               |
|STPL     |Vanscool@msn.com       |coolerthanme22          |coolerthanme22             |
|wework   |zookeeper9922@yahoo.com|lionkingwasnice33       |lionkingwasnice33          |          



