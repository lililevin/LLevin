package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticBanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\llevin\\Desktop\\Web_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.caarewards.ca/sco/");
		
		
		WebElement StaticBanner= driver.findElement(By.xpath("//div[@role='banner']"));
		if(StaticBanner.isDisplayed()) 
		{
			System.out.println("Static Banner Displayed on home page");
		}
		else 
		{
			System.out.println("Static Banner NOT Displayed on home page");
		}
		
		System.out.println("Test script executed successfully");
		
		driver.quit();
		System.exit(0);
		
}
}