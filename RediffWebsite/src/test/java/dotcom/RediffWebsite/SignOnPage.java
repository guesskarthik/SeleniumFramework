package dotcom.RediffWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignOnPage extends TestPlan {
	public WebDriver driver;
	
	//Constructor
	public SignOnPage(WebDriver driver2) {
		this.driver = driver2;
	}
	
	//Object declaration
	
	/*
	 driver.FindElement(By.xpath("//input[@name='login']"));
	 */
	
	//username
	public By txtusername = By.xpath("//input[@name='login']");
	public WebElement getUserName()
	{
		return driver.findElement(txtusername);
	}
	
	//password
	public By txtPwd = By.id("password");
	public WebElement getPwd()
	{
		return driver.findElement(txtPwd);
	}
	
	//Go Button
	public By btnGo = By.name("proceed");
	public WebElement ClickGo()
	{
		return driver.findElement(btnGo);
	}
}
