package com.guru99.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.testBase.Baseclass;

public class CartPageElements extends Baseclass {
	
	@FindBy(xpath="//a[@title='Xperia']/following::button[1]")
	public WebElement addtocart;
	
	@FindBy(xpath="//input[@type='text'][1]")
	public WebElement inputbox;
	
	@FindBy(xpath="//button[@title='Update']")
	public WebElement update;
	
	@FindBy(xpath="//button[@title='Empty Cart']")
	public WebElement emptycart;
	
	@FindBy(xpath="//div[@class='page-title']//h1")
	public WebElement emptymsg;
	
	@FindBy(xpath="//ul[@class='messages']")
	public WebElement errormsg;
	@FindBy(xpath="//button[@title='Share Wishlist']")
	public WebElement shareWishlist;
	@FindBy(xpath="//*[@id='email_address']")
	public WebElement enterEmailAddress;
	
	@FindBy(xpath="//*[@id='message']")
	public WebElement enterMessage;
	
	public CartPageElements() {
		PageFactory.initElements(driver, this);
	

}}
