package com.guru99.testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.pages.HomepageElements;
import com.guru99.testBase.Baseclass;
import com.guru99.utils.CommonMethods;

public class HomePageTest extends CommonMethods  {
	@Test
	public void test_001() {
		
		CommonMethods.verifytitle("Home page");
		CommonMethods.justclick(homepage.Mobile);
		CommonMethods.verifytitle("Mobile");
		CommonMethods.selectname(homepage.sortBy, "Name");
		
		}
	@Test
	public void test_002() {
		CommonMethods.justclick(homepage.Mobile);
		String listPriceDetails=CommonMethods.getText(homepage.listprice);
		CommonMethods.justclick(homepage.Xperia);
		String priceDetails=CommonMethods.getText(homepage.detailprice);
		Assert.assertEquals(listPriceDetails, priceDetails,"Details not matched");
	}
	@Test
	public void test_004() {
		CommonMethods.justclick(homepage.Mobile);
		String parentwindowxperianame=CommonMethods.getText(homepage.childwindowXperia);
		String parentwindowiphonename=CommonMethods.getText(homepage.childwindowIPhone);
		CommonMethods.justclick(homepage.xperiacompare);
		CommonMethods.justclick(homepage.iphonecompare);
		
		CommonMethods.justclick(homepage.compare);
		CommonMethods.windowhandle("Products Comparison List - Magento Commerce");
		String childwindowxperianame=CommonMethods.getText(homepage.childwindowXperia);
		String childwindowiphonename=CommonMethods.getText(homepage.childwindowIPhone);
		System.out.println("childwindowxperianame"+childwindowxperianame);
		Assert.assertEquals(parentwindowxperianame, childwindowxperianame,"xperia mismatched");
		Assert.assertEquals(parentwindowiphonename, childwindowiphonename,"iphone mismatched");
		
		
		
	}

}
