package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pagebase.BasePage;

public class FindDoctorPage extends BasePage
{

	public FindDoctorPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//button[@id='Doctor']")
	private WebElement drSpecialist;
	
	
	public GetPersonalisedPage clickDrSpecilaist() {
		drSpecialist.click();
		return new GetPersonalisedPage(driver);
		
	}

	
	

}
