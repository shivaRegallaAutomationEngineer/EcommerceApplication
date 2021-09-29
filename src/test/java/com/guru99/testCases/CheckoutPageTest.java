package com.guru99.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.utils.CommonMethods;
public class CheckoutPageTest extends CommonMethods{
	@Test
	public void Testcase_006() {

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
		String flatvalue=CommonMethods.getText(checkoutpage.flatrate);
		System.out.println(flatvalue);
		Assert.assertEquals(flatvalue, "Fixed - $5.00","values are not matching");
		
		
		
		CommonMethods.justclick(checkoutpage.Shippingcostflatrate);
		CommonMethods.justclick(checkoutpage.Updatetotal);
		String priceValue=CommonMethods.getText(checkoutpage.priceValue);
		//System.out.println(priceValue);
		String expectedPriceValue="$5.00";
		Assert.assertEquals(priceValue, expectedPriceValue,"values are not matching");
		CommonMethods.justclick(checkoutpage.Checkoutbutton);
//		CommonMethods.entertext(checkoutpage.Adress);
//		CommonMethods.justclick(checkoutpage.City);
//		CommonMethods.justclick(checkoutpage.State);
//		CommonMethods.justclick(checkoutpage.Zip);
//		CommonMethods.justclick(checkoutpage.Phone);
		CommonMethods.justclick(checkoutpage.Continueinbillingadd);
		
		CommonMethods.justclick(checkoutpage.Continueinshippingmethod);
		CommonMethods.justclick(checkoutpage.Paymentradiobutton);
		CommonMethods.justclick(checkoutpage.Continueinpaymentmethod);
		CommonMethods.justclick(checkoutpage.Placeorder);
String actualtext=		CommonMethods.getText(checkoutpage.Textgerated);
		
		Assert.assertEquals(actualtext, "THANK YOU FOR YOUR PURCHASE!");
		String ordid=CommonMethods.getText(checkoutpage.orderid);
		
		System.out.println("my order id "+ordid);
	}

}
