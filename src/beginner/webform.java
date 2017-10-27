package beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com/");
		System.out.println("Before clicking on Multi city Radio button");
		driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed();
		driver.findElement(By.xpath("//*[@id='multicity']/label")).click();
		
		//		driver.findElement(By.xpath("//*[@id='multicity']/label")).isEnabled();
		System.out.println("After clicking on Muticity Radio button");
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());
		driver.findElement(By.xpath("//*[@id='multicity']/label")).isDisplayed();
		
		
		System.out.println(driver.findElement(By.xpath("//*[@id='mmt_header_navigation']/div/div[4]/ul/li[2]/a/span[2]")).getText());
		
		//if you want to validate the object which is present in web page or code base
		int count = driver.findElements(By.xpath("//*[@id='multicity']/label")).size();
		if (count==0)
		{
			System.out.println("verified");
		}
		

	}

}
