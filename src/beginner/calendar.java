package beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com/");
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		driver.findElement(By.xpath("//*[@id='dp1505934578751']/div/div[1]/table/tbody/tr[4]/td[5]/a")).click();
		int i=0;
		while (i<5)
		{
			driver.findElement(By.xpath("//*[@id='hp-widget__paxCounter']")).click();			
			
			driver.findElement(By.xpath("//*[@id='js-adult_counter']/li[1]")).click();
			i++;
		}

	}

}
