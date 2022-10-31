package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart {
	
	public AddCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#app > div.application--wrap > main > div > div.bg-white.view > div:nth-child(2) > div > div > div.col-md-9 > div.cat-items > div.row.row-flexed > div:nth-child(3) > a > div > div.cat-item--img")
	private WebElement obj;
	
	@FindBy(css="#app > div.application--wrap > main > div > div.bg-white.view > div:nth-child(2) > div > div > div.col-md-9 > div.cat-items > div.row.row-flexed > div:nth-child(3) > a > div > div.pa-3 > div.rm-quickview__container")
	private WebElement selected;
	
	@FindBy(css="#app > div.dialog__content.dialog__content__active > div > div.dialog-content > div > div.col-md-6.rm-product__details > div > div.rm-buttons > div > button")
	private WebElement added;
	
	@FindBy(css="#app > div.dialog__content.dialog__content__active > div > div.dialog-content > div > div.col-md-6.rm-product__details > div > div.rm-buttons > div > a")
	private WebElement view;
	
	
	
	
	public void selectAction(WebDriver driver) {
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		act.moveToElement(obj).perform();
		selected.click();
	}
	public void addedAction() {
		added.click();
	}
	public void viewAction(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		view.click();
		
	}

}
