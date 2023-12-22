package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSXdata;

public class FirstTestFW extends BaseTest{
	
	@Test(dataProviderClass= ReadXLSXdata.class, dataProvider="bvtdata")
	public static void LoginTest(String username, String password) throws InterruptedException
	{
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys("username");
		driver.findElement(By.xpath(loc.getProperty("next_btn"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys("password");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("login_next_btn"))).click();
		Thread.sleep(4000);
	}
}
