package pojoclass;

import java.util.List;

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
	private List<WebElement> loc;
	@FindBy(id="hotels")
	private List<WebElement> hotal;
	@FindBy(id="room_type")
	private List<WebElement> roomType;
	@FindBy(id="room_nos")
	private List<WebElement> roomNo;
	@FindBy(id="datepick_in")
	private List<WebElement> checkInDate;
	@FindBy(id="datepick_out")
	private List<WebElement> checkOutDate;
	
	@FindBy(id="adult_room")
	private List<WebElement> adult;
	
	@FindBy(id="child_room")
	private List<WebElement> child;
	
	
	@FindBy(id="Submit")
	private List<WebElement> submit ;
	public List<WebElement> getLoc() {
		return loc;
	}
	public List<WebElement> getHotal() {
		return hotal;
	}
	public List<WebElement> getRoomType() {
		return roomType;
	}
	public List<WebElement> getRoomNo() {
		return roomNo;
	}
	public List<WebElement> getCheckInDate() {
		return checkInDate;
	}
	public List<WebElement> getCheckOutDate() {
		return checkOutDate;
	}
	
	
	public List<WebElement> getAdult() {
		return adult;
	}
	public List<WebElement> getChild() {
		return child;
	}
	public List<WebElement> getSubmit() {
		return submit;
	}
	
	
	

}
