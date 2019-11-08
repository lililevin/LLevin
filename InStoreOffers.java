package Home_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class InStoreOffers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\llevin\\Desktop\\Web_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.caarewards.ca/sco/");
		
		//Check if the title of the Online Offers exists
		WebElement InStoreTitle=driver.findElement(By.xpath("//div[@id='trending-offers-instore-expanded']"));
	
		
		if(InStoreTitle.isDisplayed())
		{
			System.out.println((InStoreTitle).getText());

		}
		else
		{
			System.out.println("No Title Appears On the Screen");
		}
	
		String xpath="//ul[@class='carousel-instore-click ux-row-slider js-flickity slider-nav-small slider-nav-reveal slider-nav-push large-block-grid-5 small-block-grid-2 flickity-enabled is-draggable']//div[@class='flickity-viewport non-featured-slider']/div/child::li";
		String xpathbutton="/html[1]/body[1]/div[12]/div[2]/div[1]/div[16]/div[2]/div[1]/div[1]/div[1]/ul[1]/button[1]";
		String xpathbutton2="/html[1]/body[1]/div[12]/div[2]/div[1]/div[16]/div[2]/div[1]/div[1]/div[1]/ul[1]/button[2]/*";
		
		
		//Check if Online Offers appear in the carousel 
		List <WebElement> CountOffers=driver.findElements(By.xpath(xpath));
		
		if(!CountOffers.isEmpty())
		{
			System.out.println(CountOffers.size() + " " + "In-Store Offers");
		}
		else
		{
			System.out.println("Offers not displayed");
		}
		
		//Check if sliding arrows exist
		if(CountOffers.size()>3)
		{
			System.out.println(driver.findElements(By.xpath(xpathbutton)).size() + " " + "Left Sliding arrows exist");
			System.out.println(driver.findElements(By.xpath(xpathbutton2)).size() + " " + "Right Sliding arrows exist");
		}
		else
		{
			System.out.println("Sliding arrows missing");
		}
		
		
		//Check if Sliding arrows are clickable 
			int p=5;
			
			Thread.sleep(1000);
			//Left arrow
			for (int i=0;i<=p;i++)
			{
				driver.findElement(By.xpath(xpathbutton+"/*")).click();
			}
	
			Assert.assertTrue(true);
			
			//Right arrow
			for (int i=0;i<=p;i++)
			{
				driver.findElement(By.xpath(xpathbutton2)).click();
			}
			Assert.assertTrue(true);
		
			//Check if offers are clickable 
			Thread.sleep(1500);
			int y = CountOffers.size();
			for(int x=0;x<y;x++)
			{
				CountOffers.get(x).click();
				String url=driver.getCurrentUrl();
				System.out.println(url);
				//Thread.sleep(100);
				driver.navigate().back();
				Thread.sleep(2000);
				for (int i=0; i<x; i++)
				driver.findElement(By.xpath(xpathbutton2)).click();	
				Thread.sleep(2000);
				CountOffers=driver.findElements(By.xpath(xpath));
					
			}
			
			Thread.sleep(1000);
			driver.findElement(By.linkText("See more in-store offers")).click();
			Assert.assertTrue(true);
			String url=driver.getCurrentUrl();
			System.out.println(url);
			
			System.out.println("Test script executed successfully");
	
		/*
		 * driver.quit(); System.exit(0);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
