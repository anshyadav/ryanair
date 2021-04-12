package com.ryanair.automation.webpages.functions;

import org.openqa.selenium.WebDriver;
import com.ryanair.automation.webpages.elements.OverviewPageElements;

import stepDefinitions.CommonUtils;


public class OverviewPageFunctions {

    private WebDriver driver;
    public OverviewPageElements overviewPageElements;

    // Constructor to initialize the elements on the flights page
    public OverviewPageFunctions(CommonUtils commonUtils){
    	this.driver = commonUtils.getDriver();
    	this.overviewPageElements = new OverviewPageElements(driver);
    }

}
