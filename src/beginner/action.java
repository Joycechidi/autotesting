package beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");
		Actions a = new Actions(driver);
		
		//this code moves to element, hovers over it, build and perform it to display the pop-up window
		WebElement move = driver.findElement(By.cssSelector("#nav-link-yourAccount > span.nav-line-2"));
		
		//To type in capital letters use the (Keys.SHIFT) method
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//to select the typed words use the (doubleClick Method) as in below code
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//To right-click on an element use: the context-click action method
		a.moveToElement(move).contextClick().build().perform();
		
		
		
		
		

	}

}
