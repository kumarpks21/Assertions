package Demo.Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
@Test
	public void softAssertionDemo() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	SoftAssert softverify=new SoftAssert();
	
	System.out.println("Verifying Title .............");
	String actualTitle=driver.getTitle();
	String expectedTitle="Automation Testing Practice";
	softverify.assertEquals(actualTitle, expectedTitle,"Title is verified");

	System.out.println("Verifying presence of wikipedia-icon............");
	WebElement icon= driver.findElement(By.className("wikipedia-icon"));
	softverify.assertTrue(icon.isDisplayed());

	System.out.println("Verifying presence of search-icon............");
	WebElement searchBtn= driver.findElement(By.className("wikipedia-search-button"));
	softverify.assertTrue(searchBtn.isDisplayed());

	driver.close();
	}
}
