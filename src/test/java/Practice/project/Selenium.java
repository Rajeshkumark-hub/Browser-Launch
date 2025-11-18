package Practice.project;

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
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.38.0");
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
}
