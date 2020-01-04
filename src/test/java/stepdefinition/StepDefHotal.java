package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojoclass.ConformpagePojo;
import pojoclass.CusandPaymentDetails;
import pojoclass.HotalSelectionPojo;
import pojoclass.LoginPojo;
import pojoclass.SearchHotalPojo;

public class StepDefHotal extends Base{
	WebDriver driver;
	@Given("User in hotal login page")
	public void user_in_hotal_login_page() {
		
		driver = getDriverAcces();
		LaunchUrl("https://adactin.com/HotelApp/");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\bebom\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.get("https://adactin.com/HotelApp/");
		
	    
	}

	@When("User has enter the valid crediantial{string},{string}")
	public void user_has_enter_the_valid_crediantial(String usr, String pss) {
		//WebElement u=driver.findElement(By.id("username"));
		//u.sendKeys(usr);
		//WebElement p=driver.findElement(By.id("password"));
		//p.sendKeys(pss);
		//driver.findElement(By.id("login")).click();
		
		
		LoginPojo l=new LoginPojo();
		WebElement us=l.getUsr().get(0);
		fill(us, usr);
		
		WebElement ps=l.getPss().get(0);
		fill(ps,pss);
		
		WebElement bu=l.getLoginButton().get(0);
		button(bu);
		
	}

	@When("User has enter the booking details{string},{string},{string},{string},{string},{string}>,{string},{string}")
	public void user_has_enter_the_booking_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   /* WebElement loc=driver.findElement(By.id("location"));
	    Select s=new Select(loc);
	    s.selectByVisibleText(string);
	    
	    WebElement hot=driver.findElement(By.id("hotels"));
	    Select s1=new Select(hot);
	    s1.selectByVisibleText(string2);
	    
	    WebElement roomT=driver.findElement(By.id("room_type"));
	    Select s2=new Select(roomT);
	    s2.selectByVisibleText(string3);
	    
	    WebElement roomN=driver.findElement(By.id("room_nos"));
	    Select s3=new Select(roomN);
	    s3.selectByIndex(2);
	    
	    WebElement date=driver.findElement(By.id("datepick_in"));
	    //date.sendKeys(string5);
	    
	   WebElement date1= driver.findElement(By.id("checkOutDate"));
	   date1.sendKeys(string6);
	   
	   WebElement adult=driver.findElement(By.id("adult_room"));
	   Select s4=new Select(adult);
	   s4.selectByVisibleText(string7);
	   
	   //WebElement child=driver.findElement(By.id("child_room"));
	   //Select s5=new Select(child);
	   //s5.selectByVisibleText(string8);
	   
	   WebElement sub=driver.findElement(By.id("Submit"));
	   sub.click();
	    
*/	 
		SearchHotalPojo shp=new SearchHotalPojo();
		WebElement lo=shp.getLoc().get(0);
		dropDown(lo, string);
		
		WebElement ho=shp.getHotal().get(0);
		dropDown(ho, string2);
		
		WebElement ty=shp.getRoomType().get(0);
		dropDown(ty, string3);
		
		WebElement rn=shp.getRoomNo().get(0);
		dropDown(rn, string4);
		
		//WebElement cid=shp.getCheckInDate().get(0);
		//fill(cid, string5);
		
		//WebElement cod=shp.getCheckOutDate().get(0);
		//fill(cod, string6);
		
		WebElement adu=shp.getAdult().get(0);
		dropDown(adu, string7);
		
		//WebElement ch=shp.getChild().get(0);
		//dropDown(ch, string8);
		WebElement sub=shp.getSubmit().get(0);
	button(sub);
		
		
		
		
		
	}

	@When("User need to select hotal and click ok")
	public void user_need_to_select_hotal_and_click_ok() {
		/*WebElement sec=driver.findElement(By.id("radiobutton_0"));
		sec.click();
		WebElement con=driver.findElement(By.id("continue"));
		con.click();
*/	  
		HotalSelectionPojo hsp= new HotalSelectionPojo();
		WebElement hs=hsp.getHotalSelection().get(0);
		button(hs);
		WebElement cont=hsp.getCont().get(0);
		button(cont);
		
		
		
	}

	@When("User need to fill the customer details and Payment details {string},{string},{string}{string},{string},{string},{string},{string}")
	public void user_need_to_fill_the_customer_details_and_Payment_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    /*WebElement fn=driver.findElement(By.id("first_name"));
	    fn.sendKeys(string);
	    
	    WebElement ln=driver.findElement(By.id("last_name"));
	    ln.sendKeys(string2);
	    
	    WebElement add=driver.findElement(By.id("address"));
	    add.sendKeys(string3);
	    
	    WebElement ccn=driver.findElement(By.id("cc_num"));
	    ccn.sendKeys(string4);
	    
	    WebElement ccty=driver.findElement(By.id("cc_type"));
	    Select s=new Select(ccty);
	    s.selectByVisibleText(string5);
	    
	    WebElement ccm=driver.findElement(By.id("cc_exp_month"));
	    Select s1=new Select(ccm);
	    s1.selectByVisibleText(string6);
	    
	    WebElement ccy=driver.findElement(By.id("cc_exp_year"));
	    Select s2=new Select(ccy);
	    s2.selectByVisibleText(string7);
	    
	    WebElement ccv=driver.findElement(By.id("cc_cvv"));
	    ccv.sendKeys(string7);
	    
	    WebElement book=driver.findElement(By.id("book_now"));
	    book.click();
	    
	    		
*/	   
		CusandPaymentDetails cpd=new CusandPaymentDetails();
		WebElement fn=cpd.getfName().get(0);
		fill(fn, string);
		
		
		WebElement ln = cpd.getlName().get(0);
		fill(ln, string2);
		
		
		WebElement addres = cpd.getAddress().get(0);
		fill(addres, string3);
		
		WebElement ccn = cpd.getCcNum().get(0);
		fill(ccn, string4);
		
		WebElement cct = cpd.getCcType().get(0);
		dropDown(cct, string5);
		
		WebElement ccm = cpd.getCcMonth().get(0);
		dropDown(ccm, string6);
		
		WebElement ccy = cpd.getCcYear().get(0);
		dropDown(ccy, string7);
		
		WebElement ccv = cpd.getCcv().get(0);
		fill(ccv, string8);
		WebElement book = cpd.getBookNow().get(0);
		button(book);
		
		
		
	}

	@Then("User get booking ID")
	public void user_get_booking_ID() throws InterruptedException {
		Thread.sleep(8000);
		/*WebElement order=driver.findElement(By.id("order_no"));
		String s=order.getAttribute("value");
		System.out.println("Booking ID iS="+s);
	  */
		
		ConformpagePojo cp=new ConformpagePojo();
		WebElement on = cp.getOrderNo().get(0);
		getAtibute(on);
		
		
	}

}
