package TestPages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.deleteAllCheckboxes;
import Util.BrowserFactory;

public class deleteAllCheckedBoxesTest {
	WebDriver driver;
	@Test
	public void validatAllDeletion() throws InterruptedException {
		driver=BrowserFactory.init();
		deleteAllCheckboxes dAc= PageFactory.initElements(driver, deleteAllCheckboxes.class);
		dAc.ToggleAllClick();
		Thread.sleep(4000);
		dAc.removeAllBoxes();
		Thread.sleep(4000);
		BrowserFactory.tearDown();
		
	}
	

}
