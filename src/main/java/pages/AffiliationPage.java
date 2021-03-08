package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pagebase.BasePage;

public class AffiliationPage extends BasePage{

	public AffiliationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[@id='hospitalAffiliation0']")
	private WebElement details;

	public HospitalDetailsaPage hospitalDetails() {
		
		details.click();
		return new HospitalDetailsaPage(driver);
		
	}
}
