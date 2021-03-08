package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pagebase.BasePage;

public class DrDetailsPage extends BasePage {

	public DrDetailsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[contains(text(),', Thomas')]")
	private WebElement selectDr;

	public SelectDrPage selectDoc() {
		selectDr.click();
		return new SelectDrPage(driver);

	}

}
