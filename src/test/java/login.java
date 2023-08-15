import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class login {
	WebDriver driver;
	@BeforeTest
  public void f() {
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(co);
	  driver.get("https://google.com");
  }
  @Test
  public void f1() {
	  String txt=driver.getTitle();
	  System.out.println(txt);
	Assert.assertEquals(txt, "Google");
  }
  @AfterTest
  public void f2() {
	  driver.quit();
  }

}
