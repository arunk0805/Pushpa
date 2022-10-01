package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage extends BaseClass {

	public WikiPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "searchInput")
	private WebElement searchText;

	@FindBy(id = "searchButton")
	private WebElement searchButton;

	@FindBy(xpath = "//i[text()='Pushpa: The Rise'][1]")
	private WebElement expected;

	@FindBy(xpath = "//li[text()='17 December 2021']")
	private WebElement releaseDate;

	@FindBy(xpath = "//td[text()='India']")
	private WebElement country;

	public WebElement getSearchText() {
		return searchText;
	}

	public WebElement getSearchButton() {
		return searchButton;
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

	public void wikiPageInfo(String movieName) {

		sendKeys(getSearchText(), movieName);
		click(getSearchButton());
		getText(getExpected());
		System.out.println(getText(getReleaseDate()));
		System.out.println(getText(getCountry()));

	}

}
