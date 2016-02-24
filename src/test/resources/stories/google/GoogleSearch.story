Meta:

Narrative:
As a user
I should be able to search in google
So That I can get answer to my question

Scenario: Google should display appropriate search results page when I enter a Search Term
Meta:
@simple

Given user is on Google Search Page
When the user searches for 'Serenity BDD'
Then search results page should display 'Serenity BDD - Automated Acceptance Testing with Style'
When the user searches for 'Webdriver'
Then search results page should NOT display 'Serenity BDD - Automated Acceptance Testing with Style'
And search results page should display 'WebDriver - W3C'



Scenario: Google should display appropriate search results page when I enter a Search Term (PARAMETRISED TABLE Demo -  Input Data on External File)
Meta:
@parametrised external

Given user is on Google Search Page
When the user enters <Search Text>
Then search results page should contain <Search Results>

Examples:
stories_data/google_search_input.table



Scenario: Google should display appropriate search results page when I enter a Search Term (PARAMETRISED TABLE Demo - Input Data tightly coupled with scenario)
Meta:
@parametrised internal

Given user is on Google Search Page
When the user enters <Search Text>
Then search results page should contain <Search Results>

Examples:
|   Search Text     |   Search Results   |
|   Serenity BDD    |   Serenity BDD - Automated Acceptance Testing with Style|




Scenario: Google should display appropriate search results page when I enter a Search Term (EXAMPLES TABLE Demo - Input Data on External File)
Meta:
@examplestable external

Given user is on Google Search Page
Then for each of the <Search Text> entered,
appropriate <Search Results> should be displayed:stories_data/google_search_input.table




Scenario: Google should display appropriate search results page when I enter a Search Term (EXAMPLES TABLE Demo - Input Data tightly coupled with scenario)
Meta:
@examplestable internal

Given user is on Google Search Page
Then for each of the <Search Text> entered,
appropriate <Search Results> should be displayed:
|   Search Text     |   Search Results   |
|   Serenity BDD    |   Serenity BDD - Automated Acceptance Testing with Style| -- Success
|-- Some Input Text |   Expected Output  | -- This is commented Test Data and Serenity will skip this data
