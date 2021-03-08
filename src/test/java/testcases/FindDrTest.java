package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AffiliationPage;
import pages.ChoosePlanPage;
import pages.DoctorsPage;
import pages.DrDetailsPage;
import pages.FindDoctorPage;
import pages.GetPersonalisedPage;
import pages.HomePage;
import pages.LocationPage;
import pages.SelectDrPage;
import pages.SelectPlanPage;
import testbase.BaseTest;

public class FindDrTest extends BaseTest {

	

	@Test
	public void findDoctor() {
		HomePage home = new HomePage(driver);
		FindDoctorPage fDrPg = new FindDoctorPage(driver);
		GetPersonalisedPage gPPg = new GetPersonalisedPage(driver);
		LocationPage Lpg = new LocationPage(driver);
		SelectPlanPage Spg = new SelectPlanPage(driver);
		ChoosePlanPage Cpg = new ChoosePlanPage(driver);
		DoctorsPage Dpg = new DoctorsPage(driver);
		DrDetailsPage DDpg = new DrDetailsPage(driver);
		SelectDrPage SDPg= new SelectDrPage(driver);
		AffiliationPage Apg = new AffiliationPage(driver);
						

		// clicking on Find A Doctor link
		home.findADoctor();
		log.info("---Clicked on Find A Doctor---");
		// Validating the Page after click
		String what = driver.findElement(By.xpath("//h1[contains(text(),'What are you looking for?')]")).getText();
		Assert.assertEquals(what, "What are you looking for?", "Title mismatched");
		log.info("---Validating Page as:" + what + "----");

		// clicking on Doctor and Specialists
		fDrPg.clickDrSpecilaist();
		log.info("---Clicked in Doctor and Specialist");

		// validating after clicking
		String getPerSearch = driver.findElement(By.xpath("//h2[contains(text(),'Get personalized search results')]"))
				.getText();
		Assert.assertEquals(getPerSearch, "Get personalized search results");
		log.info("---Validating Page is : " + getPerSearch + "----");

		// Continuing as Guest
		gPPg.clickContinueAsGuest();
		log.info("--- Clicked on Continue as Guest ---");

		// Validating the Page Title
		String location = driver.getTitle();
		Assert.assertEquals(location, "Location for Doctors and Specialists - Find a Doctor");
		log.info("---Validating Title of Page as : " + location + "----");
	     
		Lpg.locationInput(); 
		Spg.selectPopularPlans();
		Cpg.selectBSPlan();
		Dpg.searchDoctors();
		DDpg.selectDoc();
		SDPg.viewDetailsofDr();
		Apg.hospitalDetails();
			
	
	}

}
