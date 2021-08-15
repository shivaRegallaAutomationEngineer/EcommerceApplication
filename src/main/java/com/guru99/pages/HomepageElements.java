package com.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.testBase.Baseclass;

public class HomepageElements extends Baseclass {
	@FindBy(xpath="//a[@href='http://live.demoguru99.com/index.php/mobile.html']")
	public WebElement Mobile;
	@FindBy(xpath="(//select[@title='Sort By'])[1]")
	public WebElement sortBy;
	@FindBy(xpath="//img[@alt='Xperia']")
	public WebElement Xperia;
	@FindBy(xpath="//img[@id='product-collection-image-2']")
	public WebElement IPhone;
	@FindBy (xpath="//span[@class='price']")
	public WebElement detailprice;
	@FindBy (xpath="//a[@title='Xperia']//following::span[1]")
	public WebElement listprice;
	@FindBy (xpath="//a[@title='Xperia']/following::li[text()][1]")
	public WebElement xperiacompare;
	@FindBy (xpath="//a[@title='IPhone']/following::li[text()][1]")
	public WebElement iphonecompare;
	@FindBy (xpath="//button[@title='Compare']")
	public WebElement compare;
	@FindBy (xpath="//*[@class='product-name']//a[@title='Sony Xperia']")
	public WebElement childwindowXperia;
	@FindBy (xpath="//*[@class='product-name']//a[@title='IPhone']")
	public WebElement childwindowIPhone;
	@FindBy (xpath="//a[text()='TV']")
	public WebElement TV;
	@FindBy (xpath="//a[@title='LG LCD']//following::a[text()='Add to Wishlist'][1]")
	public WebElement lgtvwishlist;
	
	
	public HomepageElements() {
		PageFactory.initElements(driver, this);
	
	}
	
	
	

}
