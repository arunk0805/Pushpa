package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdmbPage extends BaseClass {
	
	public IdmbPage() {
	
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="suggestion-search")
	private WebElement search;
	
	@FindBy(xpath="//button[@id='suggestion-search-button']")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	@FindBy(xpath="//a[contains(text(),'Pushpa')]")
	private WebElement pushpa;

	public WebElement getPushpa() {
		return pushpa;
	}

	@FindBy(xpath="//a[text()='Pushpa: The Rise - Part 1']")
	private WebElement movieName;
	
	@FindBy(xpath="//h1[contains(text(),'The Rise')]")
	private WebElement expected;
	
	@FindBy(xpath="//a[text()='December 17, 2021 (United States)']")
	private WebElement releaseDate;
	
	@FindBy(xpath="//a[text()='India']")
	private WebElement country;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getMovieName() {
		return movieName;
	}

	public WebElement getExpected() {
		return expected;
	}

	public WebElement getReleaseDate() {
		return releaseDate;
	}

	public WebElement getCountry() {
		return country;
	}
	
	public void imdbPageInfo(String movieName) {

		sendKeys(getSearch(), movieName);
		click(getSearchButton());
		click(getPushpa());
		getText(getExpected());
		System.out.println(getText(getReleaseDate()));
		System.out.println(getText(getCountry()));

	}

}

	  
	
	


