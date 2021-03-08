package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoughTests  {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.blueshieldca.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,5);
 
		driver.findElement(By.id("findADoctorSvg2")).click();
		 String what = driver.findElement(By.xpath("//h1[contains(text(),'What are you looking for?')]")).getText();
	Assert.assertEquals(what, "What are you looking for?","Title mismatched");
		
		driver.findElement(By.xpath("//button[@id='Doctor']")).click();
		String getPerSearch = driver.findElement(By.xpath("//h2[contains(text(),'Get personalized search results')]")).getText();
		Assert.assertEquals(getPerSearch, "Get personalized search results");
		
	    driver.findElement(By.xpath("//button[@id='nonMember']")).click();
	    String location = driver.getTitle();
	    Assert.assertEquals(location, "Location for Doctors and Specialists - Find a Doctor");
	   // driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("Vacaville Junction, CA 95687, USA");
	// driver.findElement(By.xpath("//h1[contains(text(),'Where are you located?')]")).click();
	 WebElement add = driver.findElement(By.xpath("//*[@id='autocomplete']"));
	Actions action = new Actions(driver); 
	
	action.sendKeys(add, "Vacaville Junction, CA 95687, USA").perform();
	action.sendKeys(add, Keys.ENTER).build().perform();
	WebElement abc = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
	
	wait.until(ExpectedConditions.elementToBeClickable(abc));
	abc.click();
	WebElement cdf = driver.findElement(By.xpath("//button[contains(text(),'Show popular plans')]"));
	wait.until(ExpectedConditions.elementToBeClickable(cdf));
	cdf.click();
	  driver.findElement(By.xpath("//*[contains(text(),' Blue Shield of California PPO Network ')]")).click();
	  driver.findElement(By.xpath("xpath")).click();
	  
		try {
			driver.findElement(By.xpath("//label[contains(text(),'Doctor Type')]")).isSelected();
			System.out.println("Oh yeah!!!");

			driver.findElement(By.xpath("//button[@id='dropdownMenu']")).click();
		} catch (Exception e) {
			System.out.println("Khuching");

		}
	  
	 driver.findElement(By.xpath("//ngx-treeview-item[1]//ngx-treeview-item[2]//span")).click();
	 System.out.println("thena thena");
	 driver.findElement(By.id("searchBtn")).click();
	 driver.findElement(By.xpath("//*[contains(text(),', Thomas')]")).click();
	 driver.findElement(By.xpath("//div[5]/div[2]/span[1]/a[1]")).click();
	 driver.findElement(By.xpath("//a[@id='hospitalAffiliation0']")).click();
	 System.out.println("sidala sidala");
	}

}
