//Testcase:2 for Login,sorting and logout for standard_user //
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//
public class SecondTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/v1/index.html");
		System.out.println(driver.getCurrentUrl());
		System.setProperty("webdriver.chrome.driver","/Users/suchitapaul/Downloads/chromedriver-mac-arm64/chromedriver");
		
         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         driver.findElement(By.name("password")).sendKeys("secret_sauce");
         driver.findElement(By.className("btn_action")).click();
         //dropdown test/sorting test
         WebElement dropdownList = driver.findElement(By.className("product_sort_container"));
	      Select dropdown = new Select(dropdownList);
	      dropdown.selectByIndex(2);
	      dropdown.selectByIndex(0);
	      //driver.findElement(By.cssSelector("button[style='position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none; opacity: 0; font-size: 8px; cursor: pointer;']")).click();
	      
	      driver.findElement(By.className("bm-burger-button")).click();
	      //WebElement logoutButton = driver.findElement(By.linkText("Logout"));
	      //logoutButton.click();
	      Actions actions = new Actions(driver) ;
	      actions.moveToElement(dropdownList).perform();
	      
	      driver.findElement(By.linkText("Logout")).click();

	    
	}
}