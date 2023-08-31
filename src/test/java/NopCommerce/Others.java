package NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Others {
	WebDriver driver;
	public Others(WebDriver driver){
		this.driver=driver;
	}
	By electronics=By.linkText("Electronics");
	By others=By.linkText("Others");

	public WebElement electronics() {
		return driver.findElement(electronics);
	}
	
	public WebElement show_others() {
		return driver.findElement(others);
	}
	
}
