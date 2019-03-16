Feature: Yankee Candle Feature

Scenario Outline: Yankee Candle Login Test Scenario

Given User in on Home Page.
When The Page Title is Yankee Candle.
Then User clicks on sign in link
Then User is on sign in page
Then User enter the "<Username>" and "<Password>"
And click on Login button
Then User is get sign in.

Examples:
	|Username		 |Password|
	|cts147@gmail.com|Test123 |

 
 