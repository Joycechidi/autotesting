package beginner;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestParallel {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String nodeURL;
		String baseUrl = null;
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.BINARY, new File("C://Users//Dandon//Desktop//Software Testing//chromedriver.exe").getAbsolutePath());
		                                        
		                                     //node machine
		driver = new RemoteWebDriver(new URL("http://172.30.2.86:5566/wd/hub"), capabilities);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		driver.get(baseUrl + "/");

	}

}
