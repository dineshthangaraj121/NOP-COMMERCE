package NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cellphones {
	WebDriver driver;
	Cellphones(WebDriver driver){
		this.driver=driver;
	}

	By electronics=By.linkText("Electronics");
	By cellphone=By.linkText("Cell phones");

	public WebElement electronics() {
		return driver.findElement(electronics);
	}
	
	public WebElement show_cellphones() {
		return driver.findElement(cellphone);
	}

}
