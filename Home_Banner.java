package Home_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Banner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\llevin\\Desktop\\Web_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.caarewards.ca/sco/");
		
		
		
		//HBcount = Home Banner Count
		int HBcount = driver.findElements(By.xpath("//div[@class='flickity-slider']/child::div")).size();
		System.out.println(HBcount + " " + "Slides");
		List <WebElement> HBList = driver.findElements(By.xpath("//div[@class='flickity-slider']/child::div"));
		
		
		//Left and Right buttons
		int LRbutton = driver.findElements(By.xpath("//div[@class='flickity-viewport undefined']/following-sibling::button")).size();
		System.out.println(LRbutton + " " + "Buttons");
		driver.findElement(By.xpath("//button[@class='flickity-prev-next-button previous']"));
		driver.findElement(By.xpath("//button[@class='flickity-prev-next-button next']"));
		
	
		
		
		//Dots that indicate how much banners exist on the page
		int Dots = driver.findElements(By.xpath("//ol[@class='flickity-page-dots']/child::li")).size();
		
		if (HBcount==Dots)
		{
			System.out.println("Home Banner Count equals to the Dots count");
		}
		else
		{
			System.out.println("Test of comparing count of Slides to Dots failed");
		}
		
		Thread.sleep(3000);
		
		//Previous Button
		System.out.println("Previous Button");
		for (int i=0;i<HBList.size();i++)
		{
			driver.findElement(By.xpath("//button[@class='flickity-prev-next-button previous']")).click();
			System.out.println(i + " " + "click");
		}
		
		Thread.sleep(3000);
		
		//Next Button
		System.out.println("Next Button");
		for (int x=0;x<HBList.size();x++)
		{
			driver.findElement(By.xpath("//button[@class='flickity-prev-next-button next']")).click();
			System.out.println(x + " " + "click");
		}

		System.out.println("Test script executed successfully");
		
		driver.quit();
		System.exit(0);

	}

}
