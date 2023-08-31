package MAVENPROJECT.MAVENPROJECT;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://wai.vlabs.stackroute.in/guacamole/#/client/aS0wNTIzMDFmYjEzZDc4YmY2YwBjAG51dmVsaW5r?hostname=172.31.2.148&protocol=rdp&port=3389&username=stkroute&password=U3RhY2sxMjM0JA%3D%3D&id=i-052301fb13d78bf6c");
  }
}
