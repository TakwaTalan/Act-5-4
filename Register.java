package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Takwa");
		driver.findElement(By.name("lastName")).sendKeys("Touzni");
		driver.findElement(By.name("phone")).sendKeys("96867286");
		driver.findElement(By.name("userName")).sendKeys("takwa.touzni@talan.com");
		driver.findElement(By.name("address1")).sendKeys("Talan");
		driver.findElement(By.name("city")).sendKeys("Tunis");
		driver.findElement(By.name("state")).sendKeys("Grand Tunis");
		driver.findElement(By.name("postalCode")).sendKeys("2035");
		driver.findElement(By.name("country")).sendKeys("Tunisia");
		driver.findElement(By.name("email")).sendKeys("takwa.touzni@talan.com");
		driver.findElement(By.name("password")).sendKeys("TalanAcademy2022!");
		driver.findElement(By.name("confirmPassword")).sendKeys("TalanAcademy2022!");
		driver.findElement(By.name("submit")).click();
	}
}
