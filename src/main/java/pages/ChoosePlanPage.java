package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pagebase.BasePage;

public class ChoosePlanPage extends BasePage {

	public ChoosePlanPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[contains(text(),' Blue Shield of California PPO Network ')]")
	private WebElement blueShield;

	@FindBy(xpath = "//button[contains(text(),'Continue with this plan')]")
	private WebElement continuePlan;

	public DoctorsPage selectBSPlan() {
		blueShield.click();
		continuePlan.click();
		return new DoctorsPage(driver);

	}
}
