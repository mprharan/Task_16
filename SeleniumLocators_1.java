package task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators_1 {

	public static WebDriver driver = null;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();
	}

}
