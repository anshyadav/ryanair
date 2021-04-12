package com.ryanair.automation.webpages.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ryanair.automation.stepDefinitions.CommonUtils;
import com.ryanair.automation.webpages.elements.HomePageElements;

public class HomePageFunctions extends HomePageElements {

	private WebDriver driver;

	// Constructor to initialize the elements on the flights page.
	public HomePageFunctions(CommonUtils commonUtils) {
		this.driver = commonUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public String getDepartureDate() {
		return departure_date_value.getText();
	}

	public void selectCountries() throws Exception {
		System.out.println("In");
		cookie_popup.click();
		flights_tab.click();
		one_way.click();
		origin_country.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		origin_country.sendKeys("DUB");
		origin_airport.click();
		destination_country.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		destination_country.sendKeys("FRANK");
		destination_airport.click();
	}

	public void selectDepartureDate(String departureDate) throws Exception {
		String[] dateFields = departureDate.split("/");
		String date = dateFields[2] + "-" + dateFields[1] + "-" + dateFields[0];
		String path = departure_date + date + "']";
		System.out.println(path);
		driver.findElement(By.xpath(path)).click();
	}

	public void selectPassengers(int adults, int childrens) throws Exception {
		for (int i = 1; i < adults; i++)
			number_of_adults.click();
		for (int i = 1; i <= childrens; i++)
			number_of_children.click();
		passengers_done_button.click();
	}

	public void searchFlights() throws Exception {

		termsCheckBox.click();
		search_button.click();
	}

}
