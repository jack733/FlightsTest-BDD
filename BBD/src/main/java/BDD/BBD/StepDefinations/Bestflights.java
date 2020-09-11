package BDD.BBD.StepDefinations;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import BDD.BBD.PageObjects_methods;

public class Bestflights {

@Given("^Access Flights Website$")
	public static void flights_website() throws Throwable {
	
	PageObjects_methods.StartBrowserProprties();
	
}	

@Then("^Search the flights with selected Source and Destination")
public static void search_the_flights_with_from_and_to_date() throws Throwable {
	
	PageObjects_methods.search();

}
@And("^Get the fare charges")
public static void get_the_fare_charges() throws Throwable {

}

@Then("^Sort by Cheapest and Fastest")
public static void sort_by_cheapest_and_fastest() throws Throwable {

	PageObjects_methods.sortthefares();
}

@And("^Select the best itinerary")
public static void select_the_best_itinerary() throws Throwable {

	
}

@And("^Check and Select fastest evening flight ")
public static void check_and_select_fastest_evening_flight() throws Throwable {
	
}



@And("^Quit the Browser")
public static void quit_the_browser() throws Throwable {
	PageObjects_methods.Quit();
   }

}

