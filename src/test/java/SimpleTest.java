
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleTest {

	WebDriver driver;
	@BeforeTest
  public void f() {
		
		 driver=new ChromeDriver();
	  driver.get("https://bing.com");
  }
  @Test
  public void f1() {
	  String txt=driver.getTitle();
	  System.out.println(txt);
	Assert.assertEquals(txt, "Search");
  }
  @AfterTest
  public void f2() {
	  driver.quit();
  }
}
