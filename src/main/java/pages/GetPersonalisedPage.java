package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pagebase.BasePage;

public class GetPersonalisedPage extends BasePage{

	public GetPersonalisedPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//button[@id='nonMember']")
	private WebElement continueAs;
	
	public LocationPage clickContinueAsGuest() {
		
		continueAs.click();
		return new LocationPage(driver);
	}

}
