package com.ryanair.automation.webpages.functions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ryanair.automation.stepDefinitions.CommonUtils;
import com.ryanair.automation.utils.TestDataReader;
import com.ryanair.automation.webpages.elements.FlightsPageElements;

/**
 * This page contains the methods and operations that can be performed on the
 * web elements of flights page.
 */

public class FlightsPageFunctions extends FlightsPageElements{

	private WebDriver driver;
	private TestDataReader testData;

	// Constructor to initialize the elements on the flights page
	public FlightsPageFunctions(CommonUtils commonUtils) {
		this.driver = commonUtils.getDriver();
		PageFactory.initElements(driver, this);
		testData = new TestDataReader();
	}

	public void chooseFlight() throws Exception {
		flightCard.click();
	}

	public void chooseFlightType(String flightType) {
		if (flightType.equalsIgnoreCase("Value"))
			flightTypeCards.get(0).click();
		else if (flightType.equalsIgnoreCase("Regular"))
			flightTypeCards.get(1).click();
		else if (flightType.equalsIgnoreCase("Plus"))
			flightTypeCards.get(2).click();
		else
			flightTypeCards.get(3).click();
	}

	public void chooseLoginLater() {
		loginLater.click();
	}

	public void clickContinueButton() {
		continueButton.click();
	}

	public void selectRandomSeat(int totalSeatsRequired) {
		int totalSeats = seatList.size() - 1;
		for (int i = 0; i < totalSeatsRequired; i++)
			seatList.get(totalSeats--).click();
	}

	public void clickContinueToBags() {
		continueToBags.click();
	}

	public void clickContinueToFlightOffersPage() {
		continueToFlightOffers.click();
	}

	public void clickContinueToAllOffersPage() {
		continueToAllOffers.click();
	}

	public void moveToCheckout() {
		basketLink.click();
		checkoutButtonMiniBasket.click();
	}

	public void loginAtCheckout(String username, String password) {
		inputEmail.clear();
		inputEmail.sendKeys(username);

		inputPassword.clear();
		inputPassword.sendKeys(password);
		loginSubmitButton.click();
	}

	public void fillCreditCardDetails(String cardNumber, String expiryDate, String cvv) throws Exception {

		Thread.sleep(2000);
		String[] tokens = expiryDate.split("/");
		String expiryMonth = tokens[0];
		String expiryYear = tokens[1];
		creditCardNumber.clear();
		creditCardNumber.sendKeys(cardNumber);
		creditCardCvv.clear();
		creditCardCvv.sendKeys(cvv);
		CreditCardHolderName.clear();
		CreditCardHolderName.sendKeys("Ansh");
		expiryField.get(0).click();
		expiryMonthDropdown.get(Integer.parseInt(expiryMonth)).click();
		Thread.sleep(1003);
		expiryField.get(1).click();
		expiryYearDropDown.get(2).click();
	}

	public void fillPhoneNumber() {
		phoneNumber.sendKeys(testData.readValue("phone_number"));
	}

	public void requireInsurance(boolean choice) {

		if (choice == false) {
			optOutInsurance.click();
		}
	}

	public void optForCarbonFree(boolean choice) {

		if (choice == true) {
			optForCarbonFree.click();
		}
	}

	public void optForDonation(boolean choice) {

		if (choice == true) {
			optForDonation.click();
		}
	}

	public void fillBillingAddress() throws Exception {
		billingAddressLine1.clear();
		billingAddressLine1.sendKeys("5 Rock Abbey");
		billingCity.clear();
		billingCity.sendKeys("Dublin");
		billingCountry.clear();
		char[] country = "Ireland".toCharArray();
		for (char c : country) {
			billingCountry.sendKeys(String.valueOf(c));
			Thread.sleep(2000);
		}
		billingCountry.sendKeys(Keys.ENTER);
		billingPostCode.sendKeys("H91RT0C");
	}

	public void setCurrency() {
		
		currencySelector.click();
		currencyOptions.get(0).click();
		
	}
	
	public void clickPaymentButton() {
		paymentTerms.click();
		payButton.click();
	}
	public void dissmissFastTrackDialog() throws Exception {
		Thread.sleep(4000);
		noThanksFastTrack.click();
	}

	public void dismissFamilySeatingDialog() throws Exception {
		Thread.sleep(4000);
		familySeatingDialog.click();
	}

	public void verifyPaymentError() throws Exception {
		
		assertTrue(paymentErrorContainer.isDisplayed());
		String errorMsg = paymentErrorMsg.getText();
		Assert.assertTrue(errorMsg.contains(testData.readValue("transaction_error_message")));
	}
	public void fillPassengerDetails() throws Exception {

		titleBox.get(0).click();
		titleOptions.get(0).click();
		firstName.get(0).sendKeys("Ansh");
		lastName.get(0).sendKeys("Yadav");
		titleBox.get(1).click();
		titleOptions.get(1).click();
		firstName.get(1).sendKeys("Anshh");
		lastName.get(1).sendKeys("Yadavv");
		firstName.get(2).sendKeys("Anshhh");
		lastName.get(2).sendKeys("Yadavvv");
	}

	// Method to get the origin country
	public String getOriginCountry() {
		return originCountry.getAttribute("innerHTML");
	}

	// Method to get the destination country
	public String getDestinationCountry() {
		return destinationCountry.getAttribute("innerHTML");
	}

	// Method to get the departure date
	public String getDepartureDate() {
		return departureDate.getText() + " " + departureMonth.getText();
	}

	// Method to get the return date
	public String getReturnDate() {
		return returnDate.getText() + " " + returnMonth.getText();
	}


}
