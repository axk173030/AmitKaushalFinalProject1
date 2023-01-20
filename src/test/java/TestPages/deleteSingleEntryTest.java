package TestPages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.deleteSingleEntry;
import Util.BrowserFactory;

public class deleteSingleEntryTest {
WebDriver driver;
@Test
public void validateDeletionOfcheckedBox() throws InterruptedException {
	driver=BrowserFactory.init();
	deleteSingleEntry dse=PageFactory.initElements(driver, deleteSingleEntry.class);
	Thread.sleep(5000);
	dse.deleteCheckboxOneAtATime();
	//dse.clickToggleAll();
	//dse.checkBoxSelected();
	//Thread.sleep(5000);
	//dse.checkedBoxremoved();
	Thread.sleep(5000);
	BrowserFactory.tearDown();
	
	
	
}
}
