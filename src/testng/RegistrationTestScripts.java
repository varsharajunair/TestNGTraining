package testng;

import org.testng.annotations.Test;

import objectrepo.ObjectRepository;
import testdate.Data;
import testing.design.setupTest;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class RegistrationTestScripts {
	
	ChromeDriver driver;
	
	  @Test
	  public void verifySuccessMessageOfRegistrationwithcorrectinput() {
			String actualSuccessMsg;
		    Data d = new Data();
			String expectSuccessMsg=d.readexcel(1, 9);
			ObjectRepository or = new ObjectRepository();
					
			try {
				setupTest.driver.findElement(or.registerLink).click();
				setupTest.driver.findElement(or.loginTextBox).sendKeys(d.readexcel(1,0));
				setupTest.driver.findElement(or.password).sendKeys("abc123");
				setupTest.driver.findElement(or.passwordConfirmation).sendKeys("abc123");
				setupTest.driver.findElement(or.firstName).sendKeys(d.readexcel(1,3));
				setupTest.driver.findElement(or.lastName).sendKeys(d.readexcel(1,4));
				setupTest.driver.findElement(or.userMail).sendKeys(d.readexcel(1,8));
				setupTest.driver.findElement(or.language).sendKeys("English");
				setupTest.driver.findElement(or.submit).click();
				actualSuccessMsg = setupTest.driver.findElement(or.successMsg).getText();
				System.out.println(actualSuccessMsg);
				if(expectSuccessMsg.equalsIgnoreCase(actualSuccessMsg))
				{
					
					System.out.println("Verification of Success message with correct input is passed");
					//driver.findElement(or.signout).click();
					//d.writeExcel(1,10,actualSuccessMsg);
					//d.writeExcel(1,11,"PASSED");
					//driver.findElement(or.signout).click();
					
				}
				else
				{
						System.out.println("Verification of Success message with correct input failed");
				}
				
			}catch (Exception e)
			
			{
				System.out.println("Verification of Success message with correct input failed due to Unexpected Error");
				//d.writeExcel(1,10,"Error Got");
				//d.writeExcel(1,11,"FAILED");
				
			}
		
	  }
	//  @BeforeSuite
	  //public void openApplication() {
		 // driver = new ChromeDriver();
		//	driver.get("http://demo.redmine.org/");
		//	driver.manage().window().maximize();
	//  }

	//  @AfterSuite
	 // public void closeApplication() {
		//  driver.quit();
	 // }

}
