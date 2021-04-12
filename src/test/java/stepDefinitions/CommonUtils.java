package stepDefinitions;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ryanair.automation.utils.UtilityLibrary;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtils {

	private WebDriver driver;
	private static String browser;
	private static String baseUrl;
	public UtilityLibrary utilLib;

	@Before(order = 0)
	public void setUp() {
		utilLib = new UtilityLibrary();
		browser = utilLib.getProperty("browser.name");
		baseUrl = utilLib.getProperty("base.url");
		if (browser.equalsIgnoreCase("chrome")) {
			this.driver = openChromeWebDriverManager(driver);
		} else if (browser.equalsIgnoreCase("firefox")) {

		} else if (browser.equalsIgnoreCase("edge")) {

		} else if (browser.equalsIgnoreCase("docker-chrome")) {
			this.driver = openChromeBrowser(driver);
		} else if (browser.equalsIgnoreCase("sauceLabs-chrome")) {

		} else {
			Assert.fail("No Valid  browser passed.");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println(baseUrl);
		driver.get(baseUrl);
	}

	private static WebDriver openChromeBrowser(WebDriver driver) {
		try {
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		return driver;
	}

	private static WebDriver openChromeWebDriverManager(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	@Before(value = "@setCookies", order = 1)
	public void setCookies() {
		System.out.println("Set Cookies");
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
		Thread.sleep(1000);
	}

	public WebDriver getDriver() {
		return driver;
	}

}
