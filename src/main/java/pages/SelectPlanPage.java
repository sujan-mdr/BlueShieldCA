package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pagebase.BasePage;

public class SelectPlanPage extends BasePage{

	public SelectPlanPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//button[contains(text(),'Show popular plans')]")
	private WebElement popular;
	
	public ChoosePlanPage selectPopularPlans() {
		WebElement popularplans= popular;
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(popularplans));
		popularplans.click();
		return new ChoosePlanPage(driver);
		
		
	}

}
