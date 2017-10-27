package beginner;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabTest {
	@Before

	public void setup() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("version", "5");
		dc.setCapability("platform", "XP");
		
		WebDriver driver = new RemoteWebDriver(
				new URL("https://Joycechidi:b67909de-afef-4a8c-96e2-d83e6ab29e72@ondemand.saucelabs.com:80/wd/hub"), dc);
	
		//https://saucelabid:Accesskey@ondemand.saucelabs.com:80/wd/hub
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
