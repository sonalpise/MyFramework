package MyLearningFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.util.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public static List List;
	public  static WebDriver driver;
	public static By By;
	public static Select Select;
	
	protected static void init(String appURL) {
		_setupWDManager();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		_openAppURL(appURL);
	} // init

	private static void _setupWDManager() {
		WebDriverManager.chromedriver().setup();
		LoggerClass.log("I", "Webdriver initiated");
	} // _setupWDManager
	
	private static void _openAppURL(String appURL) {
		driver.get(appURL);
		LoggerClass.log("I", "Opened page " + appURL);
	} // _openAppURL
	
	private static void _closeAppURL() {
		driver.quit();
		LoggerClass.log("I", "URL Closed");
	} // _closeAppURL
	
	
	protected static void end() {
		_closeAppURL();
		driver.quit();
		LoggerClass.log("I", "Webdriver shut down");
	} // end
	
	
	
} //BaseClass
