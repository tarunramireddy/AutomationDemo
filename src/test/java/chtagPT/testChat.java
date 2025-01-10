package chtagPT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testChat {
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
}
