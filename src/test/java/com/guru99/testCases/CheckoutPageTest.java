package com.guru99.testCases;

import org.testng.annotations.Test;

import com.guru99.utils.CommonMethods;





public class CheckoutPageTest extends CommonMethods{
	@Test
	public void Testcase_006() {
		//this testcase is worked by anusha
		CommonMethods.justclick(checkoutpage.myaccountlink);
		CommonMethods.entertext(checkoutpage.Emailadress, "shiva21@gmail.com");
		CommonMethods.entertext(checkoutpage.Password, "pranitha");
		CommonMethods.justclick(checkoutpage.Loginbutton);
		 CommonMethods.justclick(homepage.TV);
    	 CommonMethods.justclick(homepage.lgtvwishlist);
    	 
		CommonMethods.justclick(checkoutpage.MyWishlist);
		CommonMethods.justclick(checkoutpage.Addtocart);
		
		CommonMethods.selectname(checkoutpage.countryinest, "United states");
		CommonMethods.selectname(checkoutpage.Stateinest, "New York");
		CommonMethods.entertext(checkoutpage.postcode, "542896");
		
		
		CommonMethods.justclick(checkoutpage.Estimate);
		CommonMethods.justclick(checkoutpage.Shippingcostflatrate);
		CommonMethods.justclick(checkoutpage.Updatetotal);
		
		CommonMethods.justclick(checkoutpage.Checkoutbutton);
		
	}

}
