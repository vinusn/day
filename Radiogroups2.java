package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Radiogroups2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("SeleniumUser");
		FirefoxDriver driver = new FirefoxDriver(fp);
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		WebElement block = driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
		List<WebElement>radio = block.findElements(By.name("group1"));
		for (int i=0; i<radio.size();i++)
		{radio.get(i).click();
		for (int j=0;j<radio.size();j++)
		{System.out.println(radio.get(j).getAttribute("Value")+"--"+radio.get(j).getAttribute("Checked"));
		}
		System.out.println("###############");
		}
		
		}
	
	}


