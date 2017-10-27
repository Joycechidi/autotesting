package beginner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//Clicking on September 29. It's best to use cssSelector but you can use other locators as well
		//This clicks on the date space
		driver.findElement(By.id("travel_date")).click();	
		
		//This will get the text December but with the !, it will return it as false. 
		//This while loop will keep executing until it becomes
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("December"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']"));
		}	
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		//Grab common attribute, get date and iterate
		
		int count = driver.findElements(By.className("day")).size();
		for(int i=0; i<count; i++)
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("29"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		

	}

}
