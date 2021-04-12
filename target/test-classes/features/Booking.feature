#Summary : Validate the functionalities around podcasts on the Ryanair website like check podcast availability, total podcast, play them, etc.
Feature: Journey Booking

@SmokeTest
  Scenario: Booking a journey for 3 passengers with declined card
    Given I make a booking from "DUB" to "SXF" on "22/05/2021" for 2 adults and 1 child
    When I pay for booking with card details "5555 5555 5555 5557", "2/25" and "265"
    Then I should get payment declined message
