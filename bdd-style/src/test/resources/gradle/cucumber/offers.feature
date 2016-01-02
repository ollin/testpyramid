Feature: Offer management

  Scenario: Create a offer based on a proposal
    Given that the user is a customer representative
    And has a proposal
    When the user creates an offer based on the proposal
    Then the result is a offer based on the given proposal

