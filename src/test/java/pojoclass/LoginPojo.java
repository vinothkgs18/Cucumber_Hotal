package pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class LoginPojo extends Base{
	 
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usr;
	@FindBy(id="password")
	private WebElement pss;
	
	public WebElement getUsr() {
		return usr;
	}
	public WebElement getPss() {
		return pss;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(id="login")
	private WebElement loginButton;
	

}
