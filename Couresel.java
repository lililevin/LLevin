package Home_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Couresel {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\llevin\\Desktop\\Web_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.caarewards.ca/sco/");
		
		
		WebElement FeaturedOffers=driver.findElement(By.xpath("//span[@id='monthYear']"));
	
		
		if(driver.findElement(By.xpath("//span[@id='monthYear']")).isDisplayed())
		{
			System.out.println(driver.findElement(By.xpath("//span[@id='monthYear']")).getText());

		}
		else
		{
			System.out.println("No Featured Offers Found");
		}
	
		String xpath="//ul[@class='carousel-online-click ux-row-slider js-flickity slider-nav-small slider-nav-reveal slider-nav-push large-block-grid-5 small-block-grid-2 flickity-enabled is-draggable']//div[@class='flickity-viewport non-featured-slider']/div/child::li";
		String xpathbutton="/html[1]/body[1]/div[12]/div[2]/div[1]/div[12]/div[2]/div[1]/div[1]/div[1]/ul[1]/button[1]";
		String xpathbutton2="/html[1]/body[1]/div[12]/div[2]/div[1]/div[12]/div[2]/div[1]/div[1]/div[1]/ul[1]/button[2]";
		
		
		List <WebElement> CountOffers=driver.findElements(By.xpath(xpath));
		
		if(FeaturedOffers.isDisplayed())
		{
			System.out.println(CountOffers.size() + " " + "Featured Offers");
		}
		else
		{
			System.out.println("Offers not displayed");
		}
		
	
		if(CountOffers.size()>3)
		{
			System.out.println(driver.findElements(By.xpath(xpathbutton)).size() + " " + "Sliding arrows");
		}
		else
		{
			System.out.println("Sliding arrows missing");
		}
		
		
		//Previous Button
			int p=5;
			
			Thread.sleep(1000);
			for (int i=0;i<=p;i++)
			{
				driver.findElement(By.xpath(xpathbutton+"/*")).click();
			}
	
			Assert.assertTrue(true);
			
			for (int i=0;i<=p;i++)
			{
				driver.findElement(By.xpath(xpathbutton2+"/*")).click();
			}
			Assert.assertTrue(true);
		//Next Button
			Thread.sleep(1500);
			for(int x=5;x<CountOffers.size();x++)
			{
				
				//********************************
				if (!(CountOffers.get(x).isDisplayed()))
				{
					x=x-1;
					driver.findElement(By.xpath(xpathbutton2)).click();
					//Thread.sleep(1500);
					CountOffers=driver.findElements(By.xpath(xpath));
					
					continue;
				
					
				}
				else
				{
					Thread.sleep(3000);
					CountOffers.get(x).click();
				}
				
				
				//********************************
				
				//CountOffers.get(x).click();
				String url=driver.getCurrentUrl();
				System.out.println(url);
				//Thread.sleep(100);
				driver.navigate().back();
				Thread.sleep(2000);
			  
			/*
			 * WebElement
			 * listt=driver.findElement(By.xpath(xpath+"//img[contains(@title,'')]"));
			 * String listt1=listt.getAttribute("title"); if(url.contains(listt1)) {
			 * System.out.println("URL Matches to Offer" + url + listt1); } else {
			 * System.out.println("Not a Match" + url + listt1); }
			 */
			 
				//**********************************************
			/*
			 * if(!CountOffers.get(x).isDisplayed()) {
			 * driver.findElement(By.xpath(xpathbutton)); } else {
			 * CountOffers.get(x).click(); }
			 */
				
				CountOffers=driver.findElements(By.xpath(xpath));
					
					//**********************************************
			}
			
		
			
			System.out.println("Test script executed successfully");
			
			driver.quit();
			System.exit(0);
			
			
			
			
			
		
	}

}
