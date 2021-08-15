 package com.guru99.utils;

import com.guru99.testBase.Baseclass;
import com.guru99.testBase.Pageinitializer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonMethods extends Pageinitializer {
	public static void verifytitle(String expectedtitle) {
	String actualtitle=Baseclass.driver.getTitle();
	
		/*
		 * if(actualtitle.contentEquals(expectedtitle)) {
		 * System.out.println("titles matched"); } else {
		 * System.out.println("title dont match"); }
		 */
	Assert.assertEquals(actualtitle,expectedtitle,"titles mismatched");
	}
	
	public static void justclick(WebElement element ) {
		waitfor_clickability(element);
		element.click();
	}
	
	
	public static void entertext(WebElement element,String text) {
		waitfor_visabilityability(element);
		element.sendKeys(text);
		}
	
	
	public static WebDriverWait  get_wait_object() {
		WebDriverWait wait=new WebDriverWait(driver,Constants.EXPLICIT_WAIT_TIME);
		return wait;
	}

	
	public static void waitfor_clickability(WebElement element) {
		get_wait_object().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitfor_visabilityability(WebElement element) {
		get_wait_object().until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public static String getText(WebElement element) {
		String getTextValue=element.getText();
		return getTextValue;
	}
	
	public static String alertget_text() {
		Alert alert=driver.switchTo().alert();
	String alertmsg=alert.getText();
	return alertmsg;
			}
	
	public static void alert_accept() {
		Alert alert=driver.switchTo().alert();
	alert.accept();
			}
	public static void alert_dismiss() {
		Alert alert=driver.switchTo().alert();
	alert.dismiss();
			}
	public static void windowhandle(String title) {
		String parentwindow=driver.getWindowHandle();
		
		Set <String> childwindows=driver.getWindowHandles();
		for(String cw:childwindows) {
			
			String actual_title= driver.switchTo().window(cw).getTitle();
			System.out.println(actual_title);
			if(actual_title.contentEquals(title)) {
				driver.switchTo().window(cw);
				break;
			}
			else {
				driver.switchTo().window(parentwindow);
			}
		}
	}
	
	public static void selectname(WebElement element,String expecteddropdown) {
		
		Select sec=new Select(element);
	List<WebElement> ele=	sec.getOptions();
	for(WebElement values:ele) {
	String dropdowntext=	values.getText();
	if(dropdowntext.contentEquals(expecteddropdown)) {
		values.click();
		break;
	}
	
	}
	}
	/**
	 * This Method will take a screenshot
	 * 
	 * @param filename
	 */
	public static String takescreenshort(String filename) {
		TakesScreenshot srcshot=((TakesScreenshot)driver);
		File srcfile=srcshot.getScreenshotAs(OutputType.FILE);
		String destinationFile = Constants.SCREENSHOT_FILEPATH + 
				filename+ getTimeStemp()   + ".png";
		
		try {
			FileUtils.copyFile(srcfile, new File(destinationFile));
		} catch (IOException e) {
			System.out.println("Cannot take screenshot!");
		}
		return destinationFile;
	}
	public static String getTimeStemp() {
		Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return sdf.format(date.getTime());
	}
	
	public static void waitTime(int time) {
		try {
			Thread.sleep(1000*time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
