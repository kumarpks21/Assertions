package Demo.Assertions;

import org.testng.Assert;
import org.testng.annotations.*;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HardAssertions {
	@Test
	public void assertionDemo() {
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
System.out.println("Verifying Title .............");
String actualTitle=driver.getTitle();
String expectedTitle="Automation Testing Practice";
Assert.assertEquals(actualTitle, expectedTitle,"Title is verified");

System.out.println("Verifying presence of wikipedia-icon............");
WebElement icon= driver.findElement(By.className("wikipedia-icon"));
Assert.assertTrue(icon.isDisplayed());

System.out.println("Verifying presence of search-icon............");
WebElement searchBtn= driver.findElement(By.className("wikipedia-search-button"));
Assert.assertTrue(searchBtn.isDisplayed());

driver.close();
}
}
