package com.guru99.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.testBase.Baseclass;

public class CheckoutPageElements extends Baseclass{
	@FindBy(xpath="(//a[text()='My Account'])[2]")
	public WebElement myaccountlink;
	@FindBy(xpath="//input[@title='Email Address']")
	public WebElement Emailadress ;
	@FindBy(xpath="//input[@title='Password']")
	public WebElement Password;
	@FindBy(xpath="//button[@title='Login']")
	public WebElement Loginbutton;
	@FindBy(xpath="(//*[text()='My Wishlist'])[2]")
	public WebElement MyWishlist;
	@FindBy(xpath="//span[text()='Add to Cart']")
	public WebElement Addtocart ;
	@FindBy(xpath="//select[@id='country']")
	public WebElement countryinest;
	
	@FindBy(xpath="//select[@id='region_id']")
	public WebElement Stateinest;
	@FindBy(xpath="//input[@id='postcode']")
	public WebElement postcode;
	@FindBy(xpath="(//span[text()='Estimate'])")
	public WebElement Estimate;
	@FindBy(xpath="//span[@class='price']//following::label[@for='s_method_flatrate_flatrate']")
	public WebElement Shippingcostflatrate;
	@FindBy(xpath="//span[text()='Update Total']")
	public WebElement Updatetotal;
	@FindBy(xpath="(//button[@title='Proceed to Checkout'])[2]")
	public WebElement Checkoutbutton ;
	@FindBy(xpath="//input[@id='billing:street1']")
	public WebElement Adress;
	@FindBy(xpath="//input[@id='billing:city']")
	public WebElement City ;
	@FindBy(xpath="//select[@id='billing:region_id']")
	public WebElement State;
	@FindBy(xpath="//input[@id='billing:postcode']")
	public WebElement Zip;
	@FindBy(xpath="//input[@id='billing:telephone']")
	public WebElement Phone;
	@FindBy(xpath="//button[@onclick='billing.save()']")
	public WebElement Continueinbillingadd;
	@FindBy(xpath="(//button[@title='Continue'])[2]")
	public WebElement Continueinshippingadd ;
	@FindBy(xpath="(//span[text()='Continue'])[3]")
	public WebElement Continueinshippingmethod;
	@FindBy(xpath="(//label[text()='Check / Money order '])")
	public WebElement Paymentradiobutton;
	@FindBy(xpath="//label[text()='Check / Money order ']//following::span[text()='Continue']")
	public WebElement Continueinpaymentmethod ;
	@FindBy(xpath="//button[@title='Place Order']")
	public WebElement Placeorder;
	@FindBy(xpath="//h2[text()='Thank you for your purchase!']")
	
	public WebElement Textgerated;
@FindBy(xpath="//label[@for=\"s_method_flatrate_flatrate\"]")
public WebElement flatrate;
@FindBy(xpath="//table[@id='shopping-cart-totals-table']//tbody//tr[2]//td[2]//span")
public WebElement priceValue;
@FindBy(xpath="(//div[@class='page-title']//following::p//a)[1]")
public WebElement orderid;


	public CheckoutPageElements() {
		PageFactory.initElements(driver, this);
		
	}
	
			

}
