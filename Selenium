package Practice.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	
	static WebDriverManager driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions A = new ChromeOptions();
		WebDriver driver = new ChromeDriver(A);
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.38.0");
		driver.manage().window().fullscreen();
		//driver.close();
	}
	
}
