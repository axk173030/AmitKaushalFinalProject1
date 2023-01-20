package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class toggleAllCheckBox {
	WebDriver driver;

	public toggleAllCheckBox(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "input[name='allbox']")
	WebElement Toggel_All_Element;


	@FindBy(how = How.CSS, using = "input[name='todo[0]']")
	WebElement First_checkboc_Element;

	@FindBy(how = How.CSS, using = "input[name='todo[1]']")
	WebElement Second_checkboc_Element;

	/*for(int i=0,i<4;i++) {
		boolean statusi=  @FindBy(how = How.CSS, using = "input[name='todo[i]']")
	WebElement ith_checkboc_Element;}*/
	
	public void clickToggleAll() {
		Toggel_All_Element.click();
	}
	
		
	
	public void CheckboxFirstChecked() {
		boolean status1= First_checkboc_Element.isEnabled();
		if(status1) {
			System.out.println("All checkbox are checked");
		}else {
			System.out.println("All checkbox are unchecked");
		}}}
		/*public void AllboxChecked1() {
			boolean statusi=ith_checkboc_Element.isDisplayed();
			while(statusi) {
				System.out.println("All Checkboxes are checked");
		
		
		
	



	//private void AllboxChecked() {
		// TODO Auto-generated method stub
		
	}
	*/
	
	
	
	


