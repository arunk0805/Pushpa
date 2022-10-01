package org.base;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// 1
	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	// 2
	public void url(String url) {
		driver.get(url);
	}

	// 3
	public static String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	// 4
	public String getAttribute(WebElement element, String AttributeName) {
		String attribute = element.getAttribute(AttributeName);
		return attribute;

	}

	// 5
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// 6
	public static void sendKeys(WebElement element, String text) {
		element.sendKeys(text);

	}

	// 7
	public static void click(WebElement element) {

		element.click();

	}

	// 8
	public String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String title() {
		String title = driver.getTitle();
		return title;

	}

	// 9
	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	// 10
	public static void quite() {
		driver.quit();

	}

	// 11
	public void close() {

		driver.close();

	}

	// 12
	public static WebElement locatorById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	// 13
	public static WebElement locatorByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;

	}

	// 14
	public static WebElement locatorByXpath(String Xpath) {
		WebElement element = driver.findElement(By.xpath(Xpath));
		return element;

	}

	// 15
	public WebElement locatorByClassName(String classname) {
		WebElement element = driver.findElement(By.className(classname));
		return element;

	}

	// 16
	public WebElement locatorByTagName(WebElement element, String name) {
		WebElement element2 = driver.findElement(By.tagName(name));
		return element2;
	}

	// 17
	public void keyPress(int keycode) throws Exception {

		Robot robot = new Robot();
		robot.keyPress(keycode);

	}

	// 18
	public void keyRelease(int keycode) throws Exception {
		Robot robot = new Robot();
		robot.keyRelease(keycode);

	}

	// 19
	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	// 20
	public static void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	// 21
	public void selectOptionByAttributeValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);

	}

	// 22
	public static void alertClickOk() {
		Alert al = driver.switchTo().alert();
		al.accept();

	}

	// 23
	public void alertClickCancel() {
		Alert al = driver.switchTo().alert();
		al.dismiss();

	}

	// 24
	public String alertGetText() {
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		return text;

	}

	// 25
	public void alertSendKeys(String data) {
		Alert al = driver.switchTo().alert();
		al.sendKeys("data");

	}

	// 26
	public void javaScrpInsertValue(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value," + text + ")", element);

	}

	// 27
	public void javaScrpclick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click", element);
	}

	// 28
	public WebDriver launch() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	// 29
	public void child(String name) {
		driver.switchTo().window(name);
	}

	// 30
	public WebDriver frameindex(int index) {
		WebDriver frame = driver.switchTo().frame(index);
		return frame;
	}

	// 31
	public WebDriver frameId(String name) {
		WebDriver frame = driver.switchTo().frame(name);
		return frame;
	}

	// 32
	public void navigateUrl(String url) {
		driver.navigate().to(url);
	}

	// 33
	public void navigateUrlForward() {
		driver.navigate().forward();
	}

	// 34
	public void navigateUrlback() {
		driver.navigate().back();
	}

	// 35
	public void navigateUrlRefresh() {
		driver.navigate().refresh();

	}

	// 36
	public WebDriver frameWebElement(WebElement element) {
		WebDriver frame = driver.switchTo().frame(element);
		return frame;
	}

	// 37
	public String parentWindowId() {
		String handle = driver.getWindowHandle();
		return handle;
	}

	// 38
	public Set<String> allWindowId() {
		Set<String> handles = driver.getWindowHandles();
		return handles;
	}

	// 39
	public WebElement getFirstSelectedOPtion(WebElement element) {
		Select select = new Select(element);
		WebElement option = select.getFirstSelectedOption();
		return option;
	}

	// 40
	public void deselectOPtionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// 41
	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// 42
	public void deselectOPtionByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	// 43
	public void deselectOPtionByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);

	}

	// 44
	public boolean isMultipleOptionSelected(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 45
	public void scrollDownJs(Object scrollDown) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	}

	// 46
	public void scrollUpJs(Object scrollUp) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	}

	// 47
	public File screenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	// 48
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	// 49
	public void actionsClass(WebElement element, String text, CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyDown(element, key).sendKeys(element, text).keyUp(element, key).perform();
	}

	// 50
	public void enterSendKey(WebElement element, String text) {
		element.sendKeys(text, Keys.ENTER);
	}

	// 51
	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// 52
	public void mouseOverAction(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	// 53
	public void dragAndDrop(WebElement s, WebElement d) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
	}

	// 54
	public void copyFile(File s, File d) throws IOException {
		FileUtils.copyFile(s, d);
	}

	// 55
	public void clear(WebElement element) {
		element.clear();
	}

	// 56
	public void sleep(long millis) throws InterruptedException {
		Thread.sleep(millis);

	}

	// 57
	public boolean equals(WebElement element, Object obj) {
		boolean equals = element.equals(obj);
		return equals;
	}

}
