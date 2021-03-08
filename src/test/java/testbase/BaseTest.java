package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static String fileName;
	public Properties Config= new Properties();
	public FileInputStream fis;
	public WebDriverWait wait;
	public Logger log = Logger.getLogger(BaseTest.class);
	
	@BeforeMethod
	public void setUp() {
		
		PropertyConfigurator.configure("./src/test/resources/properties/Log4j.properties");
		log.info("****** Test Execution Started*******");
		
		try {
			fis = new FileInputStream("./src/test/resources/properties/Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(Config.getProperty("browser").equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("----- Chrome has Launched-----");
		}else if(Config.get("browser").equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("---Firefox has Launched---");
		}else if (Config.getProperty("browser").equals("IE")) {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			log.info("---IE Launched----");
		}
		
		driver.get(Config.getProperty("testsiteurl"));
		log.info("--- Navigated to : " + Config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		log.info("----Window is maximize----");
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicitwait")), TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, Integer.parseInt(Config.getProperty("explicitwait")));
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
		
	}

	public static void captureScreenshot() {
		// TODO Auto-generated method stub
		
	}
		
	
	
	
	

}
