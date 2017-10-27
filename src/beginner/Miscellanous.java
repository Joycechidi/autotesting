package beginner;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellanous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://fantasycricket.dream11.com/");		
	int number = swithToFrame(driver, By.xpath("//*[@id='m_frmRegister']/div[6]/p"));
	driver.switchTo().frame(number);
	driver.findElement(By.xpath("//*[@id='m_frmRegister']/div[6]/p")).click();

	}
	
	
	
	
	private static int swithToFrame(WebDriver driver, By by) {
		// TODO Auto-generated method stub
		return 0;
	}
	//this a utility for switching to frame when you need it
	public static int switchToFrame(WebDriver driver, By by)
	{
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();		
		for(int i = 0; i<framecount; i++)
		{
		driver.switchTo().frame(i);
		int count = driver.findElements(By.xpath("//*[@id='m_frmRegister']/div[6]/p")).size();
		
		if(count>0)
		{
		driver.findElement(By.xpath("//*[@id='m_frmRegister']/div[6]/p")).click();
		//This will stop the loop for executing once the target frames are found
		break;
		}
		else
		{
			System.out.println("Continue looping");
		}
		
	}
		
		
		driver.switchTo().defaultContent();
		
	}

}
