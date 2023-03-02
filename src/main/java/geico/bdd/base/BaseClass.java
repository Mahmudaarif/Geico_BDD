package geico.bdd.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import geico.bdd.objects.HomePage;
import geico.bdd.objects.LogInPage;
import geico.bdd.utils.Constant;
import geico.bdd.utils.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import static geico.bdd.utils.IConstant.*;

public class BaseClass {

	public static WebDriver driver;
	ReadProperties envVar = new ReadProperties();
	public static HomePage homePage;
	public static LogInPage logInPage;

	// protected AboutYouPage aboutYouPage;
	// public JavascriptExecutor js;

	public void setUpDriver(String browserName) {
		// initDriver(envVar.getProperty(BROWSER));
		String url = envVar.getProperty(URL);
		long pageLoadWait = envVar.getNumProperty(PAGELOAD_WAIT);
		long implicitWait = envVar.getNumProperty(IMPLECIT_WAIT);
		initDriver(browserName);
		initClasses(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
	}

	public void initClasses(WebDriver driver) {
		homePage = new HomePage(driver);
		logInPage = new LogInPage(driver);
	}

	public void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		default:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}

	}

	public void tearUp() {
		driver.quit();
	}

	@SuppressWarnings("unused")
	private String getString(Constant constant) {
		return constant.name();
	}

}
