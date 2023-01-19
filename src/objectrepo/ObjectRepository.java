package objectrepo;
import org.openqa.selenium.By;

public class ObjectRepository {
	 //Registration
	public By registerLink = By.xpath("//a[text()='Register']");
	public By loginTextBox = By.xpath("//input[@id='user_login']");
	public By password = By.xpath("//input[@id='user_password']");
	public By passwordConfirmation = By.xpath("//input[@id='user_password_confirmation']");
	public By firstName = By.xpath("//input[@id='user_firstname']");
	public By lastName = By.xpath("//input[@id='user_lastname']");
	public By userMail = By.xpath("//input[@id='user_mail']");
	public By language =  By.xpath("//select[@id='user_language']");
	public By submit =  By.xpath("//input[@name='commit']");
	public By successMsg = By.xpath("//div[@id='flash_notice']");
	public By signout = By.xpath("//a[text()='Sign out']");
	public By login = By.xpath("//a[text()='login']");
	public By logintext = By.xpath("//input[@id='username']");
	public By pwd = By.xpath("//input[@id='password']");
	public By loginclick = By.xpath("//input[@name='login']");
	
	
	
	//SignIn
	public static By SignInField = By.xpath("//a[text()='Sign in']");
	public static By userNmField = By.xpath("//input[@id='username']");
	public static By pwdField =  By.xpath("//input[@id='password']");
	public static By LoginField =  By.xpath("//input[@name='login']");
	public static By MyAccountField = By.xpath("//a[text()='My account']");
	public static By signoutField = By.xpath("//a[text()='Sign out']");
	
	
	
	//IssueCreation
	
	public static By projectLink = By.xpath("//a[text()='Projects']");
	public static By newProjectLink = By.xpath("//a[text()=' New Project']");
	public static By newIssueLink = By.xpath("//a[text()=' New issue']");
	public static By createAnyBtn = By.xpath("//input[@value='Create']");
	
	public static By projectName =  By.xpath("//input[@id='project_name']");
	public static By createAnyButton =  By.xpath("//input[@value='Create']");
	public static By issueSubject = By.xpath("//input[@id='issue_subject']");
	public static By issueDescription = By.xpath("//textarea[@id='issue_description']");
	public static By issuePriority =  By.xpath("//select[@id='issue_priority_id']");
	public static By issueAssignee =  By.xpath("//select[@id='issue_assigned_to_id']");
	public static By issueDuedate1 = By.xpath("//img[@class='ui_datepicker_trigger']");
	public static By issueDueDate2 = By.xpath("//p[@id='due_date_area']/img[@class='ui_datepicker_trigger']");
	
	
	

}
