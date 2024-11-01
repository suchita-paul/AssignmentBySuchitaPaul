///Testcaes 3 :Add product to the cart reset the app and then logout for Standard_user
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThirdTestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","/Users/suchitapaul/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();
        List<WebElement> products =  driver.findElements(By.cssSelector(".inventory_item"));
        WebElement firstProd = products.stream().filter(product->product.findElement(By.cssSelector("div.inventory_item_name")).getText().equals("Sauce Labs Bike Light")).findFirst().orElse(null);
        firstProd.findElement(By.cssSelector("button.btn_primary.btn_inventory")).click();
        driver.get("https://www.saucedemo.com/v1/inventory-item.html?id=5");
        driver.findElement(By.cssSelector("button.btn_primary.btn_inventory")).click();
        driver.findElement(By.cssSelector("button.inventory_details_back_button")).click();
        driver. navigate(). refresh();
        driver.findElement(By.className("bm-burger-button")).click();
        WebElement dropdownList = driver.findElement(By.className("product_sort_container"));
        Actions actions = new Actions(driver) ;
	    actions.moveToElement(dropdownList).perform();
	    driver.findElement(By.cssSelector("a#reset_sidebar_link.bm-item.menu-item")).click();
	    driver.findElement(By.linkText("Logout")).click();
        
        }



        }


	

