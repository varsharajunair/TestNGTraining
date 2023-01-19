package testing.design;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import testing.design.setupTest;

import objectrepo.ObjectRepository;
import testdate.Data;

public class IssueTestScripts {
	
  //private static finalString WebElement = null;

@Test
  public void verifyIssueCreateWithCorrectInputs() {
	  ObjectRepository or = new ObjectRepository();
	  Data d = new Data();
	  
	  setupTest.driver.findElement(or.SignInField).click();
	  setupTest.driver.findElement(or.logintext).sendKeys(d.readexcel(1,0));
	  setupTest.driver.findElement(or.password).sendKeys("abc123");
	  
	  setupTest.driver.findElement(or.login).click();
		
	  setupTest.driver.findElement(or.projectLink).click();
	  setupTest.driver.findElement(or.newProjectLink).click();
	  setupTest.driver.findElement(or.projectName).sendKeys(d.readexcel(1,13));
	  setupTest.driver.findElement(or.createAnyBtn).click();	  
	  setupTest.driver.findElement(or.newIssueLink).click();
	  setupTest.driver.findElement(or.issueSubject).sendKeys(d.readexcel(1,13));
	  setupTest.driver.findElement(or.issueDescription).sendKeys(d.readexcel(1,13));
	  
	  WebElement priorityLocation = setupTest.driver.findElement(or.issuePriority);
	  Select s = new Select(priorityLocation);
	 	  
	  s.selectByVisibleText("Urgent");
	  setupTest.driver.findElement(or.createAnyBtn).click();
	  
	 
	  
  }



}
