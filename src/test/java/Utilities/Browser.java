package Utilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Browser {

	 public static WebDriver driver;

	    public static void launchBrowser() {
	        ChromeOptions options = new ChromeOptions();

	        // Run in incognito
	        options.addArguments("--incognito");
	        options.addArguments("--disable-popup-blocking");
	        options.addArguments("--disable-notifications");
	        options.addArguments("--disable-translate");

	        // Disable Chrome password manager
	        Map<String, Object> prefs = new HashMap<>();
	        prefs.put("credentials_enable_service", false);
	        prefs.put("profile.password_manager_enabled", false);
	        options.setExperimentalOption("prefs", prefs);

	        driver = new ChromeDriver(options);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://jpetstore.aspectran.com/");
	    }
}
