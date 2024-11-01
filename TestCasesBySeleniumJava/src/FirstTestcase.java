///Testcase1: for wrong login credential for Standard_user//

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.saucedemo.com/v1/index.html");
		System.out.println(driver.getCurrentUrl());
		System.setProperty("webdriver.chrome.driver","/Users/suchitapaul/Downloads/chromedriver-mac-arm64/chromedriver");
		
         driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
         driver.findElement(By.name("password")).sendKeys("2344");
         driver.findElement(By.className("btn_action")).click();
         System.out.println(driver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText());
         driver.findElement(By.cssSelector("button.error-button")).click();
         driver.quit();
       
	}

}
