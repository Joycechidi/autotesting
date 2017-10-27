package beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.partialLinkText("One Way")).click();
		driver.switchTo().alert().accept();
		 //For ok, yes, done.
		/*driver.switchTo().alert().dismiss(); //For reject and no
		driver.switchTo().alert().getText();*/
		//driver.findElement(By.xpath("//*[@type='button']")).click();

	}

}
