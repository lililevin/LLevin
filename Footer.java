package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Footer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\llevin\\Desktop\\Web_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.caarewards.ca/sco/");
		
		//Verify that footer exists 
		driver.findElement(By.xpath("//div[contains(@class,'footer footer-1 dark')]"));
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'footer footer-1 dark')]")).isDisplayed());
		System.out.println("footer exists");
		
		//Verify that logo displayed
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'footer-icon')]//img")).isDisplayed());
		System.out.println("logo displayed");
		
		//Verify that text title displayed
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'footer-icon-title')]")).isDisplayed());
		System.out.println("Title displayed");
		
		//Verify that text displayed
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Use our app to find discounts and CAA Dollars® ava')]")).isDisplayed());
		System.out.println("Text displayed");
		
		//Verify that link to download app is working
		WebElement DApp= driver.findElement(By.linkText("Download the mobile app"));
		DApp.click();
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
