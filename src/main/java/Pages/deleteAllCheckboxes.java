package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class deleteAllCheckboxes {
	WebDriver driver;
	public deleteAllCheckboxes(WebDriver driver) {
		this.driver=driver;
		}
	
	@FindBy(how=How.CSS,using="input[name='allbox']") WebElement Toggle_Element;
	@FindBy(how=How.CSS,using="input[value='Remove']") WebElement remove_checkedBox_Element;
	@FindBy(how=How.CSS,using="input[name='todo[0]']")WebElement first_Checkbox_Element;
	
public void ToggleAllClick() {
	Toggle_Element.click();
	
}
public void removeAllBoxes() {
	boolean allRemoved=first_Checkbox_Element.isEnabled();
	remove_checkedBox_Element.click();
	
	if (allRemoved) {
		System.out.println("All checkboxes are removed");
	}else {
		System.out.println("All checkboxes are not removed");
	}
	
	
}
}
