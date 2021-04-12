package com.ryanair.automation.webpages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains the web locators of the overview page.
 */

public class OverviewPageElements {
	
	WebDriver driver;

    @FindBy(xpath = "//a[@data-ref='secondary-navigation-section-trip-overview']")
    public WebElement nav_overview;

    @FindBy(xpath = "//a[contains(text(), 'Flights')]")
    public WebElement nav_flights;

    @FindBy(xpath = "//a[@data-ref='secondary-navigation-section-getting-around']")
    public WebElement nav_car_hire;

    @FindBy(xpath = "//a[@data-ref='secondary-navigation-section-staying-there']")
    public WebElement nav_accommodation;

    @FindBy(xpath = "//a[@data-ref='secondary-navigation-section-things-to-do']")
    public WebElement nav_events_activities;
    
    
	public OverviewPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
