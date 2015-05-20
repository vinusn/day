package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("murthy9999");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("murthy@1");
		driver.findElement(By.id("signIn")).click();
	}

}
