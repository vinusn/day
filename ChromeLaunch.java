package day7;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",("D:\\chromedriver.exe"));
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://google.com");
				
	}

}
