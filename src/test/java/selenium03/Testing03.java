package selenium03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2500);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2500);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("button#checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#first-name")).sendKeys("Sadia");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Punni");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1205");
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("input#continue")).click();
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("button#finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		
		
		
		
	}

}
