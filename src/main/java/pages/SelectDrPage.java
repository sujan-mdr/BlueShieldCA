package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pagebase.BasePage;

public class SelectDrPage extends BasePage {

	public SelectDrPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//div[5]/div[2]/span[1]/a[1]")
	private WebElement viewDetail;
	
	public AffiliationPage viewDetailsofDr() {
		viewDetail.click();
		return new AffiliationPage(driver);
		
	}
}
