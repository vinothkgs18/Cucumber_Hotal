package pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class CusandPaymentDetails extends Base{
	public CusandPaymentDetails() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="first_name")
	private WebElement fName; 
	
	@FindBy(id="last_name")
	private WebElement lName; 

	
	@FindBy(id="address")
	private WebElement address;

	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	@FindBy(id="cc_num")
	private WebElement ccNum;

	
	@FindBy(id="cc_type")
	private WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccYear;
	
	@FindBy(id="cc_cvv")
	private WebElement ccv;
	
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	}
