package cookiesDemo;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CookiesClassDemo {

	public static void main(String [] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//get all the cookies
		Set <Cookie> allCookies=driver.manage().getCookies();
		int size=allCookies.size();
		System.out.println("Before adding Size is : " +size);
		System.out.println("******************************************************************************************************************");
		//print all cookies name and value
		for(Cookie ck0:allCookies) {
			System.out.println(ck0.getName() + " : " +ck0.getValue());
		}
		System.out.println("******************************************************************************************************************");
		// return specific cookies according to name
		System.out.println(driver.manage().getCookieNamed("i18n-prefs"));
		System.out.println("******************************************************************************************************************");
		
		//create cookies
		Cookie ck=new Cookie("testCookies","www.amazon.in");
		
		//add new cookie
		driver.manage().addCookie(ck);
		System.out.println("******************************************************************************************************************");
		//after adding cookies size
		allCookies=driver.manage().getCookies();
		int size1=allCookies.size();
		System.out.println("After adding Size is : " +size1);
		System.out.println("******************************************************************************************************************");
		//print all cookies name and value
		for(Cookie ck1:allCookies) {
			System.out.println(ck1.getName() + " : " +ck1.getValue());
		}
		System.out.println("******************************************************************************************************************");
		//delete cookie
		//driver.manage().deleteCookie(ck);
		
		//delete cookie by its name
		//driver.manage().deleteCookieNamed("testCookies");
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		allCookies=driver.manage().getCookies();
		int size2=allCookies.size();
		System.out.println("After deleting one cookie Size is : " +size2);
		System.out.println("******************************************************************************************************************");
		//print all cookies name and value
		for(Cookie ck2:allCookies) {
			System.out.println(ck2.getName() + " : " +ck2.getValue());
		}
		System.out.println("******************************************************************************************************************");
		driver.quit();
	}
}
