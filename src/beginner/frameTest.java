package beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryui.com/droppable");
		
		//to get the count of frames this index code:
		//System.out.println(driver.findElements(By.tagName("iframe")).size());		
		//driver.switchTo().frame(0);
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		                                                        //or By.cssSelector("iframe[class='demo-frame']"));
		//driver.findElement(By.xpath("//*[@id=draggable]/p")).click();	
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();

	}

}
