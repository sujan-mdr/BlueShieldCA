package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pagebase.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	
	}
    
	@FindBy(id="findADoctorSvg2")
	private WebElement findDR;
	
	public FindDoctorPage findADoctor() {
		
		findDR.click();
		return new FindDoctorPage(driver);
	}
}
