package com.ryanair.automation.stepDefinitions;

import static org.junit.Assert.fail;
import com.ryanair.automation.utils.UtilityLibrary;
import com.ryanair.automation.webpages.functions.FlightsPageFunctions;
import com.ryanair.automation.webpages.functions.HomePageFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingStepDefinition {

	UtilityLibrary utilLib;
	HomePageFunctions hompage;
	FlightsPageFunctions flightPage;

	public BookingStepDefinition(UtilityLibrary utilLib, HomePageFunctions hompage, FlightsPageFunctions flightPage) {
		this.utilLib = utilLib;
		this.hompage = hompage;
		this.flightPage = flightPage;
	}

	@Given("I make a booking from {string} to {string} on {string} for {int} adults and {int} child")
	public void i_make_a_booking_from_something_to_something_on_something_for_something_adults_and_something_child(
			String strArg1, String strArg2, String strArg3, int noOfAdults, int noOfChildrens) throws Throwable {
		try {
			hompage.selectCountries();
			hompage.selectDepartureDate(strArg3);
			hompage.selectPassengers(noOfAdults, noOfChildrens);
			hompage.searchFlights();
			flightPage.chooseFlight();
			flightPage.chooseFlightType("Regular");
			flightPage.chooseLoginLater();
			flightPage.fillPassengerDetails();
			flightPage.clickContinueButton();
			flightPage.dismissFamilySeatingDialog();
			flightPage.selectRandomSeat(noOfAdults + noOfChildrens);
			flightPage.clickContinueToBags();
			flightPage.dissmissFastTrackDialog();
			flightPage.clickContinueToFlightOffersPage();
			flightPage.clickContinueToAllOffersPage();
			flightPage.moveToCheckout();
			flightPage.loginAtCheckout("anshonmail@gmail.com", "Abtak56bar..,.1");
		} catch (Exception e) {
			fail(e.getLocalizedMessage());
		}
	}

	@When("^I pay for booking with card details \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_pay_for_booking_with_card_details_something_something_and_something(String strArg1, String strArg2,
			String strArg3) throws Throwable {
		flightPage.fillCreditCardDetails(strArg1, strArg2, strArg3);
		flightPage.fillPhoneNumber();
		flightPage.requireInsurance(false);
		flightPage.optForCarbonFree(true);
		flightPage.optForDonation(true);
		flightPage.fillBillingAddress();
		flightPage.setCurrency();
		flightPage.clickPaymentButton();
	}

	@Then("^I should get payment declined message$")
	public void i_should_get_payment_declined_message() throws Throwable {
		flightPage.verifyPaymentError();
	}

}
