package Home_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotlights {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\llevin\\Desktop\\Web_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.caarewards.ca/sco/");
		
		
		driver.findElements(By.xpath("//div[@class='row container divided no-margin-bottom row-padding-max-width']/child::div"));
		List <WebElement> Spotlighs=driver.findElements(By.xpath("//div[@class='row container divided no-margin-bottom row-padding-max-width']/child::div"));
	
		int Count=driver.findElements(By.xpath("//div[@class='row container divided no-margin-bottom row-padding-max-width']/child::div")).size();
		System.out.println(Count + " " + "Spotlights");
		
		for(int i=0;i<Spotlighs.size();i++)
		

		{		
		
			Spotlighs.get(i).click();
			String url=driver.getCurrentUrl();
			System.out.println(url);
			if(url.contains("https://portal.caarewards.ca"))
			{
				System.out.println("Internal link");
			}
			else
			{
				System.out.println("External link");
			}
			Thread.sleep(2000);
			System.out.println(i+ " "  + "Link");
			
			driver.navigate().back();
			Spotlighs=driver.findElements(By.xpath("//div[@class='row container divided no-margin-bottom row-padding-max-width']/child::div"));	

		}
			
		
		
		
		System.out.println("Test script executed successfully");
		
		driver.quit();
		System.exit(0);

		
		
	}

}
