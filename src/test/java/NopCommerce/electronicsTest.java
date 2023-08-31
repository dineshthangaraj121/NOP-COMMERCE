package NopCommerce;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class electronicsTest {
	WebDriver driver;
	Camera camera;
	Cellphones cellphone;
	Others others;

	@BeforeTest
	public void homepage() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com");
	}


	@SuppressWarnings("deprecation")
	@Test(priority=0)
	public void camera_and_photo() {
		camera=new Camera(driver);
		camera.electronics().click();
		camera.show_camera().click();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		WebElement sortby=camera.sort_by();
		Select select1=new Select(sortby);
		select1.selectByIndex(1);
		
		WebElement display=camera.display_products_perpage();
		Select select2=new Select(display);
		select2.selectByVisibleText("6");
		
		camera.display_asList().click();
		camera.add_to_cart().click();
		//System.out.println("The product has been added to your shopping cart\n");
		camera.click_product();
		camera.click_product();
		WebElement productscount=camera.numberOfProducts();
		productscount.sendKeys("4");
		
	}

	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void cell_phones() {
		cellphone=new Cellphones(driver);
		cellphone.electronics().click();
		cellphone.show_cellphones().click();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);

	}
	@Test(priority=2)
	public void others() {
		others=new Others(driver);
		others.electronics().click();
		others.show_others().click();
	}
}


