package day7;

import java.util.List;

import javax.lang.model.util.Elements;

import net.sf.cglib.core.Block;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class RadioButtons {

	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("SeleniumUser");
		FirefoxDriver driver = new FirefoxDriver(fp);
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		WebElement block = driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
	List<WebElement>radio = block.findElements(By.name("group1"));
	for(int i=0; i<radio.size(); i++)
	{System.out.println(radio.get(i).getAttribute("Value")+"--"+radio.get(i).getAttribute("Checked"));
	}
	}
}
