package pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class SearchHotalPojo extends Base{
	
	public SearchHotalPojo() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hotal;
	@FindBy(id="room_type")
	private WebElement roomType;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotal() {
		return hotal;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNo() {
		return roomNo;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(id="room_nos")
	private WebElement roomNo;
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	@FindBy(id="Submit")
	private WebElement submit ;

}
