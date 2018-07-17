package seleniumwd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class First {
	@Test
	 public void testlogin() throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b8c.07.19\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		driver.findElement(By.className("gb_P")).click();
		String expected = "The world’s leading software development platform · GitHub";
		driver.navigate().to("https://www.github.com");
		String actual= driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		System.out.println("Passed");
		driver.close();
	 }
	 
}
