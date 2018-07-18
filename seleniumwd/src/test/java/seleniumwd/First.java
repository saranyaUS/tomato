package seleniumwd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class First {
	@Parameters("browser")
	@Test
	 public void testlogin(String value)
	 {
		WebDriver driver= null;
		if(value.equals("chrome1"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b8c.07.19\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (value.equals("chrome2"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b8c.07.19\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("First install driver");
		}
		driver.get("https://www.Google.com");
		driver.findElement(By.className("gb_P")).click();
		String expected = "The world’s leading software development platform · GitHub";
		driver.navigate().to("https://www.github.com");
		String actual= driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		System.out.println("Passed4");
		driver.close();
	 }
	 
}
