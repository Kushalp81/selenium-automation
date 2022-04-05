package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest 
{
	public static WebDriver driver;
  @Test
  public void test1() 
  {
	  WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("kushalp81");
		
		driver.findElement(By.id("password")).sendKeys("kushal0081");
		driver.findElement(By.id("login")).click();
		
		//new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		new Select(driver.findElement(By.id("location"))).selectByIndex(4);
		new Select(driver.findElement(By.id("hotels"))).selectByIndex(3);
		new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);
		
		WebElement date = driver.findElement(By.id ("datepick_in"));
		 date.click();
		 date.clear();
		 date.sendKeys("02/05/2022");
		 
		 WebElement dat = driver.findElement(By.id ("datepick_out"));
		 dat.click();
		 dat.clear();
		 dat.sendKeys("10/05/2022");
		 
		new Select(driver.findElement(By.id("adult_room"))).selectByIndex(2);
		new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);
		
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("kushal");
		driver.findElement(By.id("last_name")).sendKeys("B");
		driver.findElement(By.id("address")).sendKeys("pune");
		driver.findElement(By.id("cc_num")).sendKeys("1234567812345678");
		
		new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("VISA");
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("December");
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("786");
		driver.manage().timeouts().implicitlyWait(1000000,TimeUnit.SECONDS);
		driver.findElement(By.id("book_now")).click();
		
		driver.findElement(By.id("my_itinerary")).click();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://adactinhotelapp.com");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
