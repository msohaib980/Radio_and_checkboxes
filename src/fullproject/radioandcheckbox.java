package fullproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class radioandcheckbox {
	static WebDriver driver;
	static String url ;
 
  @BeforeClass
  public void beforeClass() {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		url = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
  }
  
  @Test
  public void f() {
	  
		
		
		WebElement bmRadioButoon = driver.findElement(By.id("bmwradio"));
		bmRadioButoon.click();
		WebElement benzRadioButton = driver.findElement(By.id("benzradio"));
		benzRadioButton.click();
		System.out.println(bmRadioButoon.isSelected());
		
  }
  
  @Test
  public void other() {
	  
	  WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
	  bmwCheckBox.click();
	  WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
	  benzCheckBox.click();
	  System.out.println("Bmw checkbox is selected " + bmwCheckBox.isSelected());

	  
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
		
		
		Thread.sleep(3000);
		driver.quit();
  }

}
