package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCity {
	public SelectCity(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='citySelector']/li[1]")
	
	private WebElement city;
	
	public void selectCity(){
		city.click();
	}

}
