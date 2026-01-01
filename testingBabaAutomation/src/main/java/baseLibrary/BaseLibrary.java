package baseLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseLibrary {
	
	public static WebDriver driver ;
	
	@Test
	public void launchUrl()
	{
		 driver = new ChromeDriver();
		 driver.get("https://testingbaba.com/old");
	}

}
