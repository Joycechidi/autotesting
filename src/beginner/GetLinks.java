package beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		//Count of the link in the Entire page // find them with the anchor [a] tags.
		//System.out.print("Links in the page: ");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		
		//To find the count of links in the footer section of page
		WebElement footer = driver.findElement(By.xpath("//*[@id='glbfooter']"));
		
		//System.out.println("Links in the footer section: ");
		//System.out.println(footer.findElements(By.tagName("a")).size());
		
		//To find the link for a particular row or column
		WebElement column = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		//System.out.println("Links in the second column: ");
		//System.out.println(column.findElements(By.tagName("a")).size());
		
		String BeforeClicking = null;
		String AfterClicking;
		
		//To get the text of all the links found use a loop
		for(int i=0; i<column.findElements(By.tagName("a")).size(); i++)
			{
			//to find print the title of links in the 2nd column of the footer section
			//System.out.println(column.findElements(By.tagName("a")).get(0).getText());
			
			if(column.findElements(By.tagName("a")).get(i).getText().contains("Site Map"))
			{
				BeforeClicking = driver.getTitle();
				column.findElements(By.tagName("a")).get(i).click();
				break;
			}
		AfterClicking = driver.getTitle();
		if(BeforeClicking != AfterClicking)
		{
			if(driver.getPageSource().contains("View our sitemap"))
			//boolean abc = driver.findElement(By.xpath("//*[@id='help']/div[1]/h3")).isDisplayed();
					//if(abc==true)
						System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
			
			
			}
	}
}

	
	
   
			

		







		
		
		
		

	


