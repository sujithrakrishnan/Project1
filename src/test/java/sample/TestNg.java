package sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNg {
	WebDriver driver;
	@BeforeClass
	public void tc0() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
@BeforeMethod
public void tc1() {
	System.out.println("Start time");
}
@Test
public void tc2() {
	WebElement txtuser = driver.findElement(By.id("email"));
	txtuser.sendKeys("sujithra");
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("abcd");
}
@AfterMethod
public void tc3() {
	System.out.println("End Time");
}
@AfterClass
public void tc4() {
	System.out.println("Quit");
}


}
