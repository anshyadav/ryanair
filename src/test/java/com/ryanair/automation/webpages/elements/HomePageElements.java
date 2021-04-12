package com.ryanair.automation.webpages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {
	
	WebDriver driver;
	
    @FindBy(xpath = "//button[@aria-label='flights']")
    public WebElement flights_tab;
    
    @FindBy(xpath = "//button[@aria-label='One way']")
    public WebElement one_way;
    
    @FindBy(xpath = "//input[@id='input-button__departure']")
    public WebElement origin_country;
    
    @FindBy(xpath = "//div[@class='list__airports-scrollable-container large-height']/fsw-airport-item")
    public WebElement origin_airport;

    @FindBy(id = "input-button__destination")
    public WebElement destination_country;

    @FindBy(xpath = "//div[@class='list__airports-scrollable-container large-height']/fsw-airport-item")
    public WebElement destination_airport;

    public String departure_date = "//div[@data-id='";

    @FindBy(xpath = "//div[@data-ref='input-button__dates-from']/div[2]")
    public WebElement departure_date_value;

    @FindBy(xpath = "//div[contains(@data-id, '2020-07-14')]")
    public WebElement return_date;

    @FindBy(xpath = "//ry-counter[@data-ref = 'passengers-picker__adults']/div[@class='counter']/div[3]")
    public WebElement number_of_adults;

    @FindBy(xpath = "//ry-counter[@data-ref = 'passengers-picker__teens']/div[@class='counter']/div[3]")
    public WebElement number_of_teens;

    @FindBy(xpath = "//ry-counter[@data-ref = 'passengers-picker__children']/div[@class='counter']/div[3]")
    public WebElement number_of_children;

    @FindBy(xpath = "//ry-counter[@data-ref = 'passengers-picker__infant']/div[@class='counter']/div[3]")
    public WebElement number_of_infants;

    @FindBy(xpath = "//button[contains(@class, 'passengers__confirm-button')]")
    public WebElement passengers_done_button;

    @FindBy(xpath ="//button[contains(@class, 'flight-search-widget__start-search')]")
    public WebElement search_button;

    @FindBy(xpath = "//button[@class='cookie-popup-with-overlay__button']")
    public WebElement cookie_popup;
    
    @FindBy(xpath = "//ry-checkbox")
    public WebElement termsCheckBox;

}
