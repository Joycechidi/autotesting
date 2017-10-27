package beginner;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChildFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		
		
		//to work on child window frames = how to handle multiple windows in selenium
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		
		//this is your Create Your Google Account window
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());
		
		//To bring out all the windows use the below code
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		//to move to the 1st child window
		String parentid = it.next();
		
		//to move to the next child window after the 1st
		String childid = it.next();
		driver.switchTo().window(childid);
		
		//This will print the Why Google asks for your information at sign-up - Accounts help window
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		
		//To switch back to parent window
		driver.switchTo().window(parentid);
		System.out.println("Switching back to parent window");
		System.out.println(driver.getTitle());
		
		
	}

}
