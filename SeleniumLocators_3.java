package task_16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators_3 {

	public static WebDriver driver = null;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.id("searchInput"));
		search.sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement history = driver.findElement(By.id("toc-History"));
		history.click();

		WebElement title = driver.findElement(By.id("History"));
		System.out.println(title.getText());

	}

}
