package beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Dandon//Desktop//Software Testing//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://fantasycricket.dream11.com/");
		WebDriverWait wt = new WebDriverWait(driver, 5);
		
		//this exception handling will help you take screenshots of errors.
		try
		{
		
		
		
		driver.findElement(By.xpath("//*[@id='m_rtxtEmail1']")).sendKeys("aa");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='m_frmRegister']/div[1]/ul")));
		driver.findElement(By.xpath("//*[@id='m_frmRegister']/div[1]/ul/li[1]/p")).click();
		
	}
	catch(Exception e)
	{
		//taking screenshot
	}
		
	

   }

}
