@Firstpage

Feature: Select Best Flight
 
Scenario: Choose fastest and chepeast flight
  
  Given Access Flights Website
  Then  Search the flights with selected Source and Destination
  And   Get the fare charges
  Then  Sort by Cheapest and Fastest
  And   Select the best itinerary
  And   Check and Select fastest evening flight  
  Then  Quit the Browser