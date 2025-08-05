package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import constants.ConstantsClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
	public static WebDriver driver;
	public static Properties property;

	public static void readProperty() throws IOException {
		property = new Properties();
		FileInputStream file = new FileInputStream(ConstantsClass.filePath);
		property.load(file);
	}

	@Parameters("Browser")
    

	@BeforeMethod(groups = { "tearUp" })
	public void setUp(String browservalue) throws IOException {
		readProperty();
		if(browservalue.equalsIgnoreCase("Chrome"))
				{
			driver = new ChromeDriver();
		}
		else if (browservalue.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else
		{
			throw new IllegalArgumentException("Browser Not Supported." + browservalue);
		}
		
		
		
		
		
		
		driver.get(property.getProperty("Base_URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConstantsClass.implicitWaitTimeDuration));
	}

	@AfterMethod(groups = { "tearDown" })
	public void tearDown() {

		driver.quit();
	}
}
