package pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class ConformpagePojo extends Base{
	
	public ConformpagePojo() {
		PageFactory.initElements(driver, this);		
	}
	@FindBy(id="order_no")
	private WebElement orderNo;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getOrderNo() {
		return orderNo;
	}
	

}
