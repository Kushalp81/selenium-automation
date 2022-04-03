package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class MyFirstWebDriversScript1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("kushalp81");
		
		driver.findElement(By.id("password")).sendKeys("Kushal11");
		driver.findElement(By.id("login")).click();
		
		//new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		new Select(driver.findElement(By.id("location"))).selectByIndex(4);
		new Select(driver.findElement(By.id("hotels"))).selectByIndex(3);
		new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);
		
		WebElement date = driver.findElement(By.id ("datepick_in"));
		 date.click();
		 date.clear();
		 date.sendKeys("05/05/2022");
		 
		 WebElement dat = driver.findElement(By.id ("datepick_out"));
		 dat.click();
		 dat.clear();
		 dat.sendKeys("20/05/2022");
		 
		new Select(driver.findElement(By.id("adult_room"))).selectByIndex(1);
		new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);
		
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Kushal");
		driver.findElement(By.id("last_name")).sendKeys("P");
		driver.findElement(By.id("address")).sendKeys("pune");
		driver.findElement(By.id("cc_num")).sendKeys("1231234564567897");
		
		new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("VISA");
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("December");
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("700");
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		driver.findElement(By.id("book_now")).click();
		
		driver.findElement(By.id("my_itinerary")).click();
		//driver.quit();
		
	}
	
}
		