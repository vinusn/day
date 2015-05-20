package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinkTestingHref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("SeleniumUser");
		FirefoxDriver driver = new FirefoxDriver(fp);
		driver.get("http://bing.com");
		WebElement header = driver.findElement(By.id("sc_hdu"));
		
	}
}


