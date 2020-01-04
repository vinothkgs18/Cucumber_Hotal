package pojoclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class HotalSelectionPojo extends Base{

	public HotalSelectionPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="radiobutton_0")
	private List<WebElement> hotalSelection;
	@FindBy(id="continue")
	private List<WebElement> cont;
	public List<WebElement> getHotalSelection() {
		return hotalSelection;
	}
	public List<WebElement> getCont() {
		return cont;
	}
	

}
