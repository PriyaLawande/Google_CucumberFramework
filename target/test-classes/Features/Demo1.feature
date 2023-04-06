Feature: Validation of email journey

@Email
Scenario: verify user is able to send email successfully
Given user is on gmail dashboard page
When user try to send email
Then user should see sent email in sent option 

@Search
Scenario: To verify the search operation i.e search the emails received from specific email address from INBOX
Given user is already on dashboard page
When user search about specific mail address
Then user should see all emails respective to specific mail address

@Attachments
Scenario: To verify the emails which are with attachments in INBOX
Given user is on gmail home page
When user search mail with attachments
Then user should see all emails with attachments

@Settings
Scenario: To verify that Settings page is displayed properly
Given user is on homepage
When user want to see setting page
Then user is able to see setting page

@Label
Scenario: To verify that the new label is properly created
Given user is on home page
When user creates new label
Then user should see new label created


@StarredEmails
Scenario: To verify the total no. of emails marked with STAR
Given i am on home page
When i want to count starred emails
Then i counted starred emails
 
@UnreadEmails
Scenario: To verify and count unread emails in an INBOX
Given i am on gmail home page
When i want to count total unread emails
Then i have counted total no of unread emails

@ReadEmails
Scenario: To verify and count the read emails in an INBOX
Given i am on gmail homepage
When i want to count total read emails
Then i have counted total no of read emails

@SignOut
Scenario: To verify that the user can successfully Sign-out from Gmail
Given i am on gmail dashboard page
When i want to sign out gmail
Then i have signed out gmail