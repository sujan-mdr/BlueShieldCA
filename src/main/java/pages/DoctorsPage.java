package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pagebase.BasePage;

public class DoctorsPage extends BasePage {

	public DoctorsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//label[contains(text(),'Doctor Type')]")
	private WebElement DrType;

	@FindBy(xpath = "//button[@id='dropdownMenu']")
	private WebElement dropdown;

	@FindBy(xpath = "//ngx-treeview-item[1]//ngx-treeview-item[2]//span")
	private WebElement SpecialityDr;

	@FindBy(id = "searchBtn")
	private WebElement searchBtn;

	public DrDetailsPage searchDoctors() {
		try {
			DrType.isSelected();
			System.out.println("Doctor Type is Selected");

			dropdown.click();
		} catch (Exception e) {
			System.out.println("Doctor Type is not Selected");

		}

		SpecialityDr.click();
		System.out.println("Selected");
		searchBtn.click();
		return new DrDetailsPage(driver);
	}

}
