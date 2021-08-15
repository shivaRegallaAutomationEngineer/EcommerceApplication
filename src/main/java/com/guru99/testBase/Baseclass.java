package com.guru99.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.guru99.utils.Configsreader;
import com.guru99.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	@BeforeMethod
	public WebDriver setUp() {
		 
		  Configsreader.readproperties(Constants.CONFIGS_FILE_PATH);
		   switch (Configsreader.getproperty("browsername")) {
		          case "chrome":
					//System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
		    	  WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
				case "firefox":
				WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					break;
				default:
					throw new RuntimeException("Browser is not supported");
					
				}

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME ,TimeUnit.SECONDS);
				driver.get(Configsreader.getproperty("url"));
				// initialize all page objects as part of setup
				
Pageinitializer.initialise();
				return driver;

			}
	@AfterMethod
	public void teardown() {
		if(driver!=null) {
			driver.quit();
		}
	}
		
	
	
}
