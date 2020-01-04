package pojoclass;

import java.util.List;

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
	private  List<WebElement> fName; 
	
	@FindBy(id="last_name")
	private List<WebElement> lName; 

	
	@FindBy(id="address")
	private List<WebElement> address;
	
	@FindBy(id="cc_num")
	private List<WebElement> ccNum;

	
	@FindBy(id="cc_type")
	private List<WebElement> ccType;
	
	@FindBy(id="cc_exp_month")
	private List<WebElement> ccMonth;
	
	@FindBy(id="cc_exp_year")
	private List<WebElement> ccYear;
	
	@FindBy(id="cc_cvv")
	private List<WebElement> ccv;
	
	@FindBy(id="book_now")
	private List<WebElement> bookNow;

	public List<WebElement> getfName() {
		return fName;
	}

	public List<WebElement> getlName() {
		return lName;
	}

	public List<WebElement> getAddress() {
		return address;
	}

	public List<WebElement> getCcNum() {
		return ccNum;
	}

	public List<WebElement> getCcType() {
		return ccType;
	}

	public List<WebElement> getCcMonth() {
		return ccMonth;
	}

	public List<WebElement> getCcYear() {
		return ccYear;
	}

	public List<WebElement> getCcv() {
		return ccv;
	}

	public List<WebElement> getBookNow() {
		return bookNow;
	}
	
	
	}
