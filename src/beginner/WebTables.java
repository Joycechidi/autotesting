package beginner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.espncricinfo.com/series/8037/scorecard/415281");
		WebElement table = driver.findElement(By.id("gp-inning-00"));
		
		//finding rows in table
		List<WebElement>noofrows = table.findElements(By.tagName("tr"));
		System.out.println("no of rows"+ noofrows.size());
		int i = 0;
		
		//finding column count in each row
		for(WebElement eachrow:noofrows)
		{
			List<WebElement>eachcolumn = eachrow.findElements(By.tagName("td"));
			System.out.println("no of columns in"+eachrow+"th row are"+eachcolumn.size());
			//finding cell value
			for(WebElement text:eachcolumn)
			{
				System.out.println(text.getText());
			}
		}
	} 
	
	
}
		//WebDriverWait wt = new WebDriverWait(driver, 5)
	

	


