@SortPrices
Feature: Search sports shoes at Etsy

  Scenario: verifying create and delete entry
    Given I am a on etsy page
    When I search for "sport shoes"
    And I select "sport shoes" and hit search
    And I sort by "Lowest Price"
    Then I print top 10 items price