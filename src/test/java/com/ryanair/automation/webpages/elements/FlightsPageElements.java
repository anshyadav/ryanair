package com.ryanair.automation.webpages.elements;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsPageElements {

	WebDriver driver;

	@FindBy(xpath = "//div[contains(@class, 'details__header')]/h4[1]")
	public WebElement originCountry;

	@FindBy(xpath = "//div[contains(@class, 'details__header')]/h4[2]")
	public WebElement destinationCountry;

	@FindBy(xpath = "//journey-container[@outbound]//li[3]//div[contains(@class, 'date-item__date')]//span[1]")
	public WebElement departureDate;

	@FindBy(xpath = "//journey-container[@outbound]//li[3]//div[contains(@class, 'date-item__date')]//span[2]")
	public WebElement departureMonth;

	@FindBy(xpath = "//journey-container[@inbound]//li[3]//div[contains(@class, 'date-item__date')]//span[1]")
	public WebElement returnDate;

	@FindBy(xpath = "//journey-container[@inbound]//li[3]//div[contains(@class, 'date-item__date')]//span[2]")
	public WebElement returnMonth;

	@FindBy(xpath = "//journey-container[@outbound]//div[@class='card-info__cols-container']")
	public WebElement outboundFlight;

	@FindBy(xpath = "//journey-container[@outbound]//fare-table/div[@class='fare-card-container']/div[2]//button")
	public WebElement outboundRegularFlight;

	@FindBy(xpath = "//journey-container[@inbound]//flight-card/div//div[contains(@class, 'card-header')]")
	public WebElement inboundFlight;

	@FindBy(xpath = "//journey-container[@inbound]//div[@class='fare-card-container']/div[2]//button")
	public WebElement inboundRegularFlight;
	
	@FindBy(xpath = "//flight-card[@data-e2e='flight-card--outbound']")
	public WebElement flightCard;
	
	@FindBy(xpath = "//div[@class='fare-card-container']/div")
	public List<WebElement> flightTypeCards;
	
	@FindBy(xpath = "//button[@class='login-touchpoint__expansion-bar']")
	public WebElement loginLater;
	
	@FindBy(xpath = "//input[contains(@id,'.name')]")
	public List<WebElement> firstName;
	
	@FindBy(xpath = "//input[contains(@id,'.surname')]")
	public List<WebElement> lastName;
	
	@FindBy(xpath = "//button[contains(@class,'dropdown__toggle')]")
	public List<WebElement> titleBox;

	@FindBy(xpath = "//div[@class = 'dropdown__menu-items']/ry-dropdown-item")
	public List<WebElement> titleOptions;
	
	@FindBy(xpath = "//button[contains(@class,'continue-flow__button')]")
	public WebElement continueButton;
	
	@FindBy(xpath = "//button[contains(@class,'seats-modal__cta')]")
	public WebElement familySeatingDialog;
	
	@FindBy(xpath = "//div[contains(@class,'seatmap__seatrow--with-band')]/div/button[contains(@class,'standard')]")
	public List<WebElement> seatList;
	
	@FindBy(xpath = "//button[@data-ref = 'seats-action__button-continue']")
	public WebElement continueToBags;
	
	@FindBy(xpath = "//button[@data-ref = 'enhanced-takeover-beta-desktop__dismiss-cta']")
	public WebElement noThanksFastTrack; 
	
	@FindBy(xpath = "//bags-continue-flow/button")
	public WebElement continueToFlightOffers;
	
	
	@FindBy(xpath = "//div[contains(@class,'products-list__button-wrapper')]/button")
	public WebElement continueToAllOffers;
	
	@FindBy(xpath = "//a[@data-ref='basket-tooltip__open-basket']")
	public WebElement basketLink;
	
	@FindBy(xpath = "//button[@data-ref='basket-continue-flow__check-out']")
	public WebElement checkoutButtonMiniBasket;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement inputEmail;
	@FindBy(xpath = "//input[@type='password']")
	public WebElement inputPassword;
	@FindBy(xpath = "//ry-auth-submit/button")
	public WebElement loginSubmitButton;

	@FindBy(xpath = "//ry-input-d[@formcontrolname = 'phoneNumber']/div/input")
	public WebElement phoneNumber;
	
	@FindBy(xpath = "//ry-checkbox[@data-ref='insurance__checkbox-opt-out']//div")
	public WebElement optOutInsurance;	
	
	@FindBy(xpath = "//ry-checkbox[@inputid='carbon-regular']//div")
	public WebElement optForCarbonFree;
	
	@FindBy(xpath = "//ry-checkbox[@inputid='solidaryDonation']//div")
	public WebElement optForDonation;
	
	@FindBy(xpath = "//ry-input-d[@formcontrolname = 'accountNumber']/div/input")
	public WebElement creditCardNumber;
	
	@FindBy(xpath = "//ry-input-d[@formcontrolname = 'accountName']/div/input")
	public WebElement CreditCardHolderName;
	
	@FindBy(xpath = "//ry-input-d[@data-ref='verification-code__input']/div/input")
	public WebElement creditCardCvv;
	
	@FindBy(xpath = "//span[@class = 'select__wrapper']/div[position()=1]//ry-dropdown-item/button")
	public List<WebElement> expiryMonthDropdown;
	
	@FindBy(xpath = "//span[@class = 'select__wrapper']/div[position()=2]//ry-dropdown-item/button")
	public List<WebElement> expiryYearDropDown;
	
	@FindBy(xpath = "//span[@class = 'select__wrapper']//div/button")
	public List<WebElement> expiryField;
	
	
	@FindBy(xpath = "//ry-input-d[@data-ref = 'add-card-modal__address-line-1']/div/input")
	public WebElement billingAddressLine1;
	
	@FindBy(xpath = "//ry-input-d[@data-ref = 'add-card-modal__city']/div/input")
	public WebElement billingCity;
	
	@FindBy(xpath = "//ry-autocomplete[@formcontrolname = 'country']//input")
	public WebElement billingCountry;
	

	@FindBy(xpath = "//ry-input-d[@formcontrolname = 'postcode']/div/input")
	public WebElement billingPostCode;
	
	@FindBy(xpath = "//ry-dropdown[@formcontrolname='foreignCurrencyCode']//button[contains(@class,'dropdown__toggle')]")
	public WebElement currencySelector;
	
	@FindBy(xpath = "//ry-dropdown[@formcontrolname='foreignCurrencyCode']//ry-dropdown-item")
	public List<WebElement> currencyOptions;

	@FindBy(xpath = "//button[contains(@class,'pay-button')]")
	public WebElement payButton;

	@FindBy(xpath = "//div[@data-ref = 'terms-and-conditions__content-flights']")
	public WebElement paymentTerms;

	@FindBy(xpath = "//ry-alert[@data-ref='payment-methods__error-message']/div[@role='alert']")
	public WebElement paymentErrorContainer;
	
	@FindBy(xpath = "//ry-alert[@data-ref='payment-methods__error-message']//div[contains(@class,'b2 ng-star-inserted')]")
	public WebElement paymentErrorMsg;
	
}
