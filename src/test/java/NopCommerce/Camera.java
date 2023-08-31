package NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Camera{
	WebDriver driver;

	public Camera(WebDriver driver){
		this.driver=driver;
	}

	By electronics=By.linkText("Electronics");
	By cameraandPhoto=By.linkText("Camera & photo");
	By sortby=By.xpath("//*[@id=\"products-orderby\"]");
	By Leicadigitalcamera=By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]");
	By displayproducts=By.xpath("//*[@id=\'products-pagesize\']");
	By List=By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div[1]/a[2]");
	By productinfo=By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2");
	By numberofproducts=By.xpath("//*[@id=\'product_enteredQuantity_16\']");
	
	public WebElement electronics() {
		return driver.findElement(electronics);
	}

	public WebElement show_camera() {
		return driver.findElement(cameraandPhoto);
	}
	public WebElement sort_by() {
		return driver.findElement(sortby);
	}
	public WebElement display_products_perpage(){
		return driver.findElement(displayproducts);
	}
	public WebElement display_asList() {
		return driver.findElement(List);
	}
	public WebElement add_to_cart() {
		return driver.findElement(Leicadigitalcamera);
	}
	public WebElement click_product() {
		return driver.findElement(productinfo);
	}
	public WebElement numberOfProducts() {
		return driver.findElement(numberofproducts);
	}

}







