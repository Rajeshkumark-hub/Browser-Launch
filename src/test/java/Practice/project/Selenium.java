package Practice.project;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	
	static WebDriverManager driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//ChromeOptions A = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.38.0");
		driver.manage().window().fullscreen();
		//Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		//Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().fullscreen();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.quit();
		
	}
}
