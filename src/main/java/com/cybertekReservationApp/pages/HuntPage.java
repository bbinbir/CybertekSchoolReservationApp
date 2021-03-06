package com.cybertekReservationApp.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertekReservationApp.utilities.Driver;

public class HuntPage {
	
	
	public HuntPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
    
	//locator for 'hunt for spot' Text
	@FindBy(xpath="//h1[.='hunt for spot']")
	public WebElement huntforspotText;
	
	//locator for date only
	@FindBy(css="#date")
	public WebElement date;
	
	//locator for first time from drop down
	@FindBy(id="timelineStart")
	public WebElement timeFromButton;
	
	//locator for second time from drop down
	@FindBy(id="timelineFinish")
	public WebElement timeToButton;
	
	//locator for search button
	@FindBy(css=".fa.fa-search")
	public WebElement searchButton;
	
	//locator for book button
	@FindBy(xpath="(//button[@class='button is-transparent is-white'])[5]")
	public WebElement bookButton;
    
	//locator for 'booking confirmation' Text
	@FindBy(xpath="//h1")
	public WebElement bookingConfirmationText;
	
	//locator for confirm button
	@FindBy(xpath="//button")
	public WebElement confirmButton;
	
	//GS->locator for 'free spots' to verify
	@FindBy(xpath="//h1[.='free spots']")
	public WebElement freespotsText;
	
	//njl-> locater for 'date and time information' to verify  under free spots 
	@FindBy(xpath="//h2[@class='subtitle']")
	public WebElement bookingInformationText;
}
