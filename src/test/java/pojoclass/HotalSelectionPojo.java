package pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class HotalSelectionPojo extends Base{

	public HotalSelectionPojo() {
		PageFactory.initElements(driver, this);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getHotalSelection() {
		return hotalSelection;
	}
	public WebElement getCont() {
		return cont;
	}
	@FindBy(id="radiobutton_0")
	private WebElement hotalSelection;
	@FindBy(id="continue")
	private WebElement cont;
	

}
