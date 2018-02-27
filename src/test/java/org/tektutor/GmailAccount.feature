Feature: Gmail Account Creation
    Should be able to create an gmail account.

    Scenario: Successful gmail login creation
        Given I provided all valid details
        When I click the submit button
        Then I expect a user created message.