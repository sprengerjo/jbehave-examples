Narrative:
In order to develop a bowling game 
As a development team
I want to use ...
					 
Scenario: One Pin game

Given a bowling game
When 20 rolls score 0
Then the overall score must equal 0

Given a bowling game
When 20 rolls score 1
Then the overall score must equal 20

Given a bowling game
When 2 rolls score 5
And 18 rolls score 1 
Then the overall score must equal 29
