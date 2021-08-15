package com.guru99.testCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.guru99.utils.CommonMethods;
@Listeners(com.guru99.testBase.Listener.class)
public class RegistrationPageTest extends CommonMethods{
     @Test
     public void testcase_005() {
    	 CommonMethods.justclick(regispage.myaccountlink);
    	 CommonMethods.justclick(regispage.creataccunt);
    	 CommonMethods.entertext(regispage.firstname, "anusha");
    	 
    	 CommonMethods.entertext(regispage.lastname, "shiva");
    	 CommonMethods.entertext(regispage.emailAddress, "shiva21@gmail.com");
    	 CommonMethods.entertext(regispage.password, "pranitha");
    	 CommonMethods.entertext(regispage.confirmpassword, "pranitha");
    	 CommonMethods.justclick(regispage.register);
    	SoftAssert sa= new SoftAssert();
    	 sa.assertEquals(CommonMethods.getText(regispage.welcomeMessageOnRegister), "Thank you for registering with Main Website Store.");
    	 CommonMethods.justclick(homepage.TV);
    	 CommonMethods.justclick(homepage.lgtvwishlist);
    	 CommonMethods.justclick(cartpage.shareWishlist);
    	 CommonMethods.entertext(cartpage.enterEmailAddress, "shiva1@gmail.com");
    	 CommonMethods.entertext(cartpage.enterMessage, "hi anusha");
    	 CommonMethods.justclick(cartpage.shareWishlist);
    	 sa.assertEquals(CommonMethods.getText(regispage.welcomeMessageOnRegister), "Your Wishlist has been shared.");
    	 CommonMethods.waitTime(5);
    	 sa.assertAll();
     }
}
