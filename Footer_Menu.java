package Home_Page;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Footer_Menu {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\llevin\\Desktop\\Web_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.caarewards.ca/sco/");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(TimeoutException.class)
				.ignoring(StaleElementReferenceException.class);
		
		
		WebElement footer=driver.findElement(By.xpath("/html[1]/body[1]/div[12]/footer[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]"));
	
		List <WebElement> section1=footer.findElements(By.tagName("a"));
		System.out.println(section1.size());
		
		for(int i=0;i<section1.size();i++)
		{

			//Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[12]/footer[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]"));
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[12]/footer[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]"))).build().perform();
			Thread.sleep(500);
			
			wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("/html[1]/body[1]/div[12]/footer[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/child::li"))));
			if (wait.until(ExpectedConditions.visibilityOfAllElements(section1.get(i))).contains(section1))
			{
				wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("/html[1]/body[1]/div[12]/footer[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/child::li"))));
			}
			else
			{
			driver.findElements(By.xpath("/html[1]/body[1]/div[12]/footer[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/child::li"));
			//section1=footer.findElements(By.tagName("a"));
			a.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[12]/footer[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]"))).build().perform();
			Thread.sleep(500);
			//driver.findElement(By.xpath("/html[1]/body[1]/div[12]/footer[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]"));
			section1.size();
			//wait.until(ExpectedConditions.visibilityOfAllElements(section1.get(i)));
			section1.get(i).click();
			}
			driver.navigate().back();
			Thread.sleep(1000);
			
		}
		
		
		///html[1]/body[1]/div[12]/footer[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
