package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class deleteSingleEntry {

	WebDriver driver;

	public deleteSingleEntry(WebDriver driver) {
		this.driver = driver;

	}
	

	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement remove_checkedBox_Element;
	
	//@FindBy(how=How.XPATH,using="//*[@id=\\\"todos-content\\\"]/form/ul//input") List<WebElement> Checkbox_List_Element;
	

	
	public void deleteCheckboxOneAtATime() {
		
	List<WebElement> checkboxList =
			driver.findElements(By.xpath("//*[@id=\"todos-content\"]/form/ul//input"));
	
		for (WebElement e: checkboxList) {
			try {
			e.click();
			
			remove_checkedBox_Element.click();
			 System.out.println(" checkbox is deleted");}
			catch(Exception e1) {
				System.out.println(e1.getMessage());
			}
		 
		
		 
		
			
			
		}}}
	