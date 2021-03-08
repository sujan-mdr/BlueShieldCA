package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pagebase.BasePage;

public class LocationPage extends BasePage {

	public LocationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[@id='autocomplete']")
	private WebElement inputField;
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	private WebElement ContinueBtn;

	public SelectPlanPage locationInput() {

		WebElement add = inputField;
		Actions action = new Actions(driver);

		action.sendKeys(add, "Vacaville Junction, CA 95687, USA").perform();
		action.sendKeys(add, Keys.ENTER).build().perform();

		WebElement btn = ContinueBtn;

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		return new SelectPlanPage(driver);
	}

}
