package day7;

import org.openqa.selenium.safari.SafariDriver;

public class SafariLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafariDriver driver = new SafariDriver();
		driver.get("http://google.com");

		driver.close();
	}

}
