package pojoclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class LoginPojo extends Base {

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private List<WebElement> usr;
	@FindBy(id = "password")
	private List<WebElement> pss;
	@FindBy(id = "login")
	private List<WebElement> loginButton;
	
	
	public List<WebElement> getUsr() {
		return usr;
	}
	public List<WebElement> getPss() {
		return pss;
	}
	public List<WebElement> getLoginButton() {
		return loginButton;
	}
	

}
