package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import objectrepo.ObjectRepository;
import objectrepo.signInPageObjects;
import testdate.Data;
import testing.design.setupTest;
import testng.RegistrationTestScripts;

public class SigninTestScripts {
	//new
	private static final CharSequence Data = null;
	ChromeDriver driver; //test	 
  @Test
  public void verifyCredentialswithcorrectCredentials() {
  ObjectRepository or = new ObjectRepository();
  Data d = new Data();
	  try
	  {
		  boolean expMyAccountPresence = true;
		  setupTest.driver.findElement(or.SignInField).click();
		  //OR
		  //PageFactory.initElements(SeleniumScripts.driver, SignInPageObjects.class)
		  //SignInPageObjects.signInLocation.click();
		  Thread.sleep(2000);//hang 2 secs ===> Bad step
		  setupTest.driver.findElement(or.logintext).sendKeys((CharSequence[]) readexcel(1,0));
		  setupTest.driver.findElement(or.password).sendKeys("abc123");
		  
		  setupTest.driver.findElement(or.login).click();
		  Thread.sleep(2000);
		   boolean actlPresOfMyAccount = setupTest.driver.findElement(or.MyAccountField).isDisplayed();
		  
				  
		  if (expMyAccountPresence == actlPresOfMyAccount) {
			  System.out.println ("Verify SignIn with Correct Credentials is Passed");
			  setupTest.driver.findElement(ObjectRepository.SignInField).click();
			  Thread.sleep(2000);
			  setupTest.driver.findElement(ObjectRepository.signoutField).click();
		  } else {
			  System.out.println ("Verify SignIn with Correct Credentials is Failed");
		  }
	  } catch (NoSuchElementException  | InterruptedException E) {
		  
		  System.out.println ("Passed is expired.... Please correctit or Incorrect Inputs");
		  //e.printStackTrace();
		  
		  //New Method
	  }
  }
	  
	  private Object readexcel(int i, int j) {
	// TODO Auto-generated method stub
	return null;
}

	//@BeforeSuite
//	  public void openApplication() {
	//	  driver = new ChromeDriver();
	//		driver.get("http://demo.redmine.org/");
	//		driver.manage().window().maximize();
	 // }

	 // @AfterSuite
	  //public void closeApplication() {
		  //driver.quit();
	//  }



  
		  
			  
			  
		  
		  
		  
		  
		  
}
  

