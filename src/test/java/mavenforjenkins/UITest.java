package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest 
{

	@Test
	public void startBrowser()
	{
		System.out.println("Execution after setting ChromeDriver path in System setProperty method");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hemantsaroj\\Downloads\\mavenjenkins-master\\mavenjenkins-master\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");
		driver.quit();
	}
	
	
}
