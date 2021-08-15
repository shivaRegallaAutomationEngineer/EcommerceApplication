package com.guru99.testBase;

import com.guru99.pages.CartPageElements;
import com.guru99.pages.CheckoutPageElements;
import com.guru99.pages.HomepageElements;
import com.guru99.pages.RegistrationPageElements;

public class Pageinitializer extends Baseclass {
	public static HomepageElements homepage;
	public static CartPageElements cartpage;
	public static RegistrationPageElements regispage;
	public static CheckoutPageElements checkoutpage;
	public static void initialise() {
		homepage=new HomepageElements();
		cartpage=new CartPageElements();
		regispage=new RegistrationPageElements();
		checkoutpage=new CheckoutPageElements();
	}

}
