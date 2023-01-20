package TestPages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.toggleAllCheckBox;
import Util.BrowserFactory;

public class toggelAllCheckBoxTest {
	WebDriver driver;
	@Test
	public void validateCheckbox() throws InterruptedException {
		driver=BrowserFactory.init();
		toggleAllCheckBox TAC= PageFactory.initElements(driver, toggleAllCheckBox.class);
	
	TAC.clickToggleAll();
	Thread.sleep(4000);
	TAC.CheckboxFirstChecked();
	//TAC.AllboxChecked1();
	Thread.sleep(4000);
	BrowserFactory.tearDown();
	
	
	}	
	}
	


