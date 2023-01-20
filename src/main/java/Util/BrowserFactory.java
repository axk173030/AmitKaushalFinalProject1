package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	public static WebDriver driver;

	public static  WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://techfios.com/test/101/");
		return driver;

	}
	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
