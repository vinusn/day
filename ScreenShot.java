package day7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty7.server.AbstractHttpConnection.Output;
import org.apache.commons.io.FileUtils;


public class ScreenShot {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bbc.com");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\qdge\\Desktop\\\\murthy12\\bbc1.png"));
		

	}

}
