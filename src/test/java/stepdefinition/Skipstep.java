package stepdefinition;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Skipstep {
	WebDriver driver;
	@Given("user in lelong home page")
	public void user_in_lelong_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bebom\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
	   	driver=new ChromeDriver();
	   	driver.get("https://www.lelong.com.my/");
	   	
	   	Assert.assertEquals("https://www.lelong.com.my/", driver.getCurrentUrl());
	}

	@When("user has enter the {string}")
	public void user_has_enter_the(String s) {
		WebElement search=driver.findElement(By.xpath("//input[@id='TheKeyword']"));
		search.sendKeys(s);
		WebElement ok=driver.findElement(By.xpath("//span[@class='input-group-addon btn-blue-default']"));
		ok.click();
		List<WebElement> smg=driver.findElements(By.xpath("//div[@class='summary']"));
		for(int i=0;i<smg.size()-1;i++) {
			WebElement text=smg.get(i);
			String s1=text.getText();
			
			System.out.println(s1);
		}
		int a=smg.size();
		System.out.println("Total Number of Product=="+a);
		driver.close();
	    
	}

	@Then("User has navigate to product details page")
	public void user_has_navigate_to_product_details_page() {
		//Assert.assertEquals("https://www.lelong.com.my/catalog/all/list?TheKeyword=Samsung+Mobile", driver.getCurrentUrl());
		
		}
		

	}

	

