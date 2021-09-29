package com.guru99.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.guru99.testBase.Baseclass;

public class Dynamicwebtables extends Baseclass {
	@Test
	public void Test001() {
		int rows= driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		int coloms=driver.findElements(By.xpath("//table[@class='dataTable']//th")).size();
		
			for(int j=1;j<=coloms;j++) {
			String data=	driver.findElement(By.xpath("//table[@class='dataTable']td["+j+"]")).getText();
			System.out.println(data);
			}
			
		
	}

}
