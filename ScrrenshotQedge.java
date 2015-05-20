package day7;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrrenshotQedge {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		List<WebElement>links = driver.findElements(By.linkText("Qedge"));
		if(links.size()==0)
		{File srcFile = ((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\qdge\\Desktop\\\\murthy12\\google.png"));
		}
		else
		{driver.findElement(By.linkText("Qedge")).click();
		
	
		}
			
				
		
	}

}
