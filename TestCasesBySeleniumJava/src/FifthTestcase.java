//Testcaes5:Cancel order and then Successful checkout for Standard_user//

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifthTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        driver. navigate(). refresh();
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
        driver.findElement(By.cssSelector("a.btn_action.checkout_button")).click();
        driver.findElement(By.cssSelector("a.cart_cancel_link.btn_secondary")).click();
        driver.findElement(By.cssSelector("a.btn_action.checkout_button")).click();
        driver.findElement(By.cssSelector("input.btn_primary.cart_button")).click();
        System.out.println(driver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText());
        driver.findElement(By.cssSelector("button.error-button")).click();
        driver.findElement(By.id("first-name")).sendKeys("standard");
        driver.findElement(By.id("last-name")).sendKeys("User");
        driver.findElement(By.id("postal-code")).sendKeys("RG1 1NX");
        driver.findElement(By.cssSelector("input.btn_primary.cart_button")).click();
        driver.findElement(By.cssSelector("a.cart_cancel_link.btn_secondary")).click();
        driver.findElement(By.cssSelector("div.shopping_cart_container")).click();
        driver.findElement(By.cssSelector("a.btn_action.checkout_button")).click();
        driver.findElement(By.id("first-name")).sendKeys("standard");
        driver.findElement(By.id("last-name")).sendKeys("User");
        driver.findElement(By.id("postal-code")).sendKeys("RG1 1NX");
        driver.findElement(By.cssSelector("input.btn_primary.cart_button")).click();
        driver.findElement(By.cssSelector("a.btn_action.cart_button")).click();
        System.out.println(driver.findElement(By.cssSelector("h2.complete-header")).getText());
	}

}
