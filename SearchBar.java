package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\llevin\\Desktop\\Web_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.caarewards.ca/sco/");
		
		
		WebElement NameKeyWord=	driver.findElement(By.xpath("//form[@id='searchformNew']/input[@placeholder='Search by Partner: Name/Keyword']"));
		Thread.sleep(1000);
		
		System.out.println("Test search by keyword");
		
		if(NameKeyWord.isDisplayed())
			{
			NameKeyWord.sendKeys("Sephora");
			NameKeyWord.sendKeys(Keys.ARROW_DOWN);
			NameKeyWord.sendKeys(Keys.ENTER);
			System.out.println("Test passed - User can search by keyword");	
			}
		else
			{
			System.out.println("Search by Partner: Name/Keyword");	
			}
		
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		WebElement SearchByLocation=driver.findElement(By.xpath("//form[@id='searchformNew']/input[@placeholder='Search by Location: City/Postal Code']"));
		System.out.println("Test search by location");
		
		if(SearchByLocation.isDisplayed())
			{
			SearchByLocation.sendKeys("Toronto ON");
			SearchByLocation.sendKeys(Keys.ARROW_DOWN);
			SearchByLocation.sendKeys(Keys.ENTER);
			System.out.println("Test passed - User can search by location");	
			}
		else
			{
			System.out.println("Search by Partner: Name/Keyword");	
			}
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		System.out.println("Test script executed successfully");
		
		driver.quit();
		System.exit(0);
		
		
		
	}

}
