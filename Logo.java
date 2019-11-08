package Home_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Logo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\llevin\\Desktop\\Web_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.caarewards.ca/sco/");
		
	
		//HOME PAGE 
		
		//NAVIGATION BAR TESTING LINKS
		
		WebElement MenuBar=driver.findElement(By.id("site-navigation"));
		

		
		WebElement LOGO=MenuBar.findElement(By.xpath("//li[@id='rewards-label-large-screen']//a//img"));
		Actions a=new Actions(driver);
		if (LOGO.isDisplayed() && LOGO.isEnabled())
		{
			a.moveToElement(LOGO).build().perform();
			a.click().build().perform();
			System.out.println("Logo exists and Enabled");
		}
		else
		{
			System.out.println("LOGO MISSING");
		}
			
		
		 // close the web browser
			driver.quit();
	
		    System.out.println("Test script executed successfully.");
		    System.exit(0);

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
