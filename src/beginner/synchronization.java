package beginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://alaskatrips.poweredbygps.com");
		driver.findElement(By.id("package-origin")).sendKeys("nyc");
		driver.findElement(By.id("package-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("package-departing")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("package-destination")).sendKeys("Washington, Pennsylvania, United States of America ");
		driver.findElement(By.id("search-button")).click();
		
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels-Days']")));
		
		//driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-Days']")).click();
		driver.findElement(By.id("search-button")).click();
		
		
		
		

	}

}
