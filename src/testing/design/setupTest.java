package testing.design;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class setupTest {

	public static ChromeDriver driver = new ChromeDriver();
	@BeforeSuite
	  public void openApplication() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\MyTrainingWorkSpaceNew\\Libraries\\Browsers\\Chrome\\chromedriver.exe");
			((RemoteWebDriver) driver).get("http://demo.redmine.org/");
			((RemoteWebDriver) driver).manage().window().maximize();
	  }

	  @AfterSuite
	  public void closeApplication() {
		  ((ChromiumDriver) driver).quit();
	  }


}
