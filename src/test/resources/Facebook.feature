Feature: Verify Facebook Login

@Regression
Scenario: Verify Facebook login for valid username and invalid password.

Given Verify the user is on Facebook page.
When User enters valid username and invalid password.
|username|password|
|muralidharan2471995@gmail.com|9894250818|
|muralidharan2471995@gmail.com|9597121590|
|muralidharan|8838382154|
And user click the login button.
Then Error page for invalid password is displayed.

@Retest
Scenario: Verify Facebook login for valid username and invalid password.

Given Verify the user is on Facebook page.
When User enters valid username and invalid password.
|username|password|
|muralidharan2471995@gmail.com|9894250818|
|muralidharan2471995@gmail.com|9597121590|
|muralidharan|8838382154|
And user click the login button.
Then Error page for invalid password is displayed.

@Sanity
Scenario: Verify Facebook login for valid username and invalid password.

Given Verify the user is on Facebook page.
When User enters valid username and invalid password.
|username|password|
|muralidharan2471995@gmail.com|9894250818|
|muralidharan2471995@gmail.com|9597121590|
|muralidharan|8838382154|
And user click the login button.
Then Error page for invalid password is displayed.