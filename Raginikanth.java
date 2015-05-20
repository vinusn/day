package day7;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Raginikanth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		String str = driver.getPageSource();
		if (str.contains("Rajinikanth"))
			{System.out.println("Element present");
			}
		else
		{System.out.println("Element not present");
			}
	}

}
