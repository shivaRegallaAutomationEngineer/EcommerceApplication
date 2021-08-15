package com.guru99.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.utils.CommonMethods;

public class CartPageTest extends CommonMethods{
	
	@Test
	public void Testcase_001() {
		CommonMethods.justclick(homepage.Mobile);
		CommonMethods.justclick(cartpage.addtocart);
		CommonMethods.entertext(cartpage.inputbox, "1000");
		CommonMethods.justclick(cartpage.update);
		String errormsg=CommonMethods.getText(cartpage.errormsg);
		String expectederormsg="Some of the products cannot be ordered in requested quantity.";
		Assert.assertEquals(errormsg, expectederormsg,"mismatched");
		CommonMethods.justclick(cartpage.emptycart);
		String emptycartmsg=CommonMethods.getText(cartpage.emptymsg);
		String exptdemptycartmsg="SHOPPING CART IS EMPTY";
		Assert.assertEquals(emptycartmsg, exptdemptycartmsg,"emptycart mismatched");
	}
	
	}
