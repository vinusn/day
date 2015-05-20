package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTestingUrls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("SeleniumUser");
		FirefoxDriver driver = new FirefoxDriver(fp);
		driver.get("http://pvrcinemas.com");
		WebElement block = driver.findElement(By.xpath("html/body/div[3]/nav/div/div[1]"));
		List<WebElement>links = block.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{System.out.println(links.get(i).getText());
		links.get(i).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		links = block.findElements(By.tagName("a"));
		}
				
	}

}
