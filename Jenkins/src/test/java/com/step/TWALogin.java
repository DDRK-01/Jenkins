package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TWALogin {
	static WebDriver driver;

@Given("user can able to launch the browser")
public void user_can_able_to_launch_the_browser() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Vignesh S.A\\ecli\\Jenkins\\driver\\chromedriver.exe");
 driver = new ChromeDriver();
driver.get("https://uat2.wealthplannerondevices.citigroup.com/citiplannerRA/ctpra/login.html\r\n");
 driver.manage().window().maximize();
 System.out.println("launched successfully");

}

@Given("user can enter the user name")
public void user_can_enter_the_user_name() {
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("ps95371\r\n");
	System.out.println("user details entered successfully");
	
}

@Given("user can enter the password")
public void user_can_enter_the_password() {
	driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Mar20@citi\r\n");
	System.out.println("password entered successfully");
}

@Given("user can select the country")
public void user_can_select_the_country() throws InterruptedException {
	Select country = new Select(driver.findElement(By.id("select")));
	country.selectByVisibleText("China");
	System.out.println("country selected successfully");
	Thread.sleep(2000);
//	country.selectByIndex(3);
}

@Then("user can click on submit button successfully")
public void user_can_click_on_submit_button() {

	driver.findElement(By.id("generateOtpBtn")).click();
	System.out.println("submitted successfully");
	driver.close();
}
}
