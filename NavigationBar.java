package Home_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\llevin\\Desktop\\Web_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.caarewards.ca/sco/");
		
		driver.findElements(By.xpath("//ul[@id='site-navigation']/child::li"));
		
		List <WebElement> NavTabs=driver.findElements(By.xpath("//ul[@id='site-navigation']/child::li"));
		
		System.out.println(NavTabs.size());
		
		for (int i=0;i<NavTabs.size();i++)
		{
			System.out.println(NavTabs.get(i).getText());
		}
		
		System.out.println("Test script executed successfully");
		
		
	
		
		for (int x=1;x<NavTabs.size();x++)
		{
			
			driver.findElements(By.xpath("//ul[@id='site-navigation']/child::li")).get(x).click();
			Thread.sleep(1500);
			driver.navigate().back();
			Thread.sleep(1500);
			System.out.println(x + " " + driver.findElements(By.xpath("//ul[@id='site-navigation']/child::li")).get(x).getText());
			
		}
			
			
		 // close the web browser
			driver.quit();
	
		    System.out.println("Test script executed successfully.");
		    System.exit(0);

		
		
	}

}
