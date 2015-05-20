package day7;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Rajinikanthpresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://http://en.wikipedia.org/wiki/Rajinikanth");
		String str = driver.getPageSource();
		if (str.contains("Rajinikanth"))
			{System.out.println("Element present");
			}
		else
		{System.out.println("Element not present");
	}
	}
}
