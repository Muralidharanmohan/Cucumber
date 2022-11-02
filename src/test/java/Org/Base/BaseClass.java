package Org.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.w3c.dom.Element;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass<Actions> {
	
	public static WebDriver driver;
	public void browserConfigChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public void openUrl(String url) {
		driver.get(url);
		driver.getTitle();
		driver.getCurrentUrl();
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	} 
	public WebElement locateById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement locateByName(String name) {
		WebElement findElement = driver.findElement(By.id(name));
		return findElement;
	}
	public WebElement locateByXpath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}
	public void inputText(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	public void browserClose() {
		driver.close();
	}
	public void alert(String data) {
		driver.switchTo().alert();
		driver.switchTo().alert().sendKeys(data);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
	}
	public void frames(String index) {
		driver.switchTo().frame(index);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	public void selected(WebElement element) {
		element.isSelected();
		element.isEnabled();
		element.isDisplayed();
		
	}
	public void CssValues(WebElement element,String data) {
		element.getCssValue(data);
		

	}

	

	}
		

	


