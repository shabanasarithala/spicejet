package practice.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement_ex1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		Thread.sleep( 5000);
	WebElement Login = driver.findElement(By.id( "ctl00_HyperLinkLogin"));
	Thread.sleep( 5000);
		WebElement spiceclub = driver.findElement(By.xpath("//*[text()='SpiceClub Members']"));
		Thread.sleep( 5000);
		//WebElement signup = driver.findElement(By.xpath("//*[text()='Sign up']" ));
		Thread.sleep( 5000);
		Actions action = new Actions(driver);
		action.moveToElement(Login).moveToElement( spiceclub).build().perform();
		WebElement signup = driver.findElement(By.xpath("//*[text()='Sign up']" ));
		signup.click();
		 

	}

}
