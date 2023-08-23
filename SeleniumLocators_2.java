package task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators_2 {

	public static WebDriver driver = null;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();

		String actual = "STORE";
		String title = driver.getTitle();
		if (title.equalsIgnoreCase(actual)) {
			System.out.println("Page landed on correct website");
		} else {
			System.out.println("Page not landed on correct website");
		}

	}
}
