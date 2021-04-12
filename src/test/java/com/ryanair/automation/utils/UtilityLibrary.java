package com.ryanair.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UtilityLibrary {

	
	public static final String PROP_FINAL_PATH = "application.properties";
	public static Properties properties;
	private static Actions actions;
	private static JavascriptExecutor javascriptExecutor;
	
	public UtilityLibrary() {
		try {
			properties = new Properties();
			properties.load(new FileInputStream(PROP_FINAL_PATH));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	// Method to scroll down the page
	public void scrollDown() {
		javascriptExecutor.executeScript("window.scrollBy(0, " + properties.getProperty("scroll.down") + ");", "");
	}

	// Method to scroll up the page
	public void scrollUp() {
		javascriptExecutor.executeScript("window.scrollBy(0, " + properties.getProperty("scroll.up") + ");", "");
	}

	// Method to click on a web element using different approaches
	public void click(WebElement element, WebDriver driver) {
		try {
			element.click();
		} catch (Exception e1) {
			try {
				javascriptExecutor = (JavascriptExecutor) driver;
				javascriptExecutor.executeScript("arguments[0].click();", element);
			} catch (Exception e2) {
				try {
					actions = new Actions(driver);
					int x = element.getLocation().getX();
					int y = element.getLocation().getY();
					actions.moveToElement(element, x, y).click().build().perform();
				} catch (Exception e3) {
					System.out.println("Unable to click on the given element. Find more: " + e3.getLocalizedMessage());
				}
			}
		}

	}

	// Method to check if the page is loaded.
	public boolean checkIfPageIsLoaded(WebDriver driver) {
		javascriptExecutor = (JavascriptExecutor) driver;
		if (javascriptExecutor.executeScript("return document.readyState").toString().equalsIgnoreCase("complete")) {
			return true;
		}

		for (int i = 0; i < 25; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (javascriptExecutor.executeScript("return document.readyState").toString()
					.equalsIgnoreCase("complete")) {
				return true;
			}
		}

		return false;
	}


}
