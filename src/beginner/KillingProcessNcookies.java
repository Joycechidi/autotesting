package beginner;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class KillingProcessNcookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this kills processes
		//WindowsUtils.killByName("excel.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		Set<org.openqa.selenium.Cookie> abc = driver.manage().getCookies();
		System.out.println(abc.size());
		
		driver.manage().deleteAllCookies();
		Set<org.openqa.selenium.Cookie> abcd = driver.manage().getCookies();
		System.out.println(abcd.size());
		

	}

}
