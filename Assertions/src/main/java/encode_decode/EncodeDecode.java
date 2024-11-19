package encode_decode;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EncodeDecode {

	public static void main(String[] args) throws InterruptedException {
		
		//encode the password
		String pass="admin123";
	byte[] encodepass=	Base64.getEncoder().encode(pass.getBytes());
	String encodeString=new String(encodepass);
	System.out.println(encodeString);
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	//decode the password
    byte[] decodepass=	Base64.getDecoder().decode(encodeString);
    String decodeString=new String(decodepass);
	
	driver.findElement(By.name("password")).sendKeys(decodeString);
	
	driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']")).click();

	}

}
