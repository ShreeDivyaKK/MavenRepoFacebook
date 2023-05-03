package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleScriptTest
{
	@Test
	public void testscript()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("swapnaajuu@yahoo.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
