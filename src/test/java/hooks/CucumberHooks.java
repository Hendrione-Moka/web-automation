package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.PageObject;

public class CucumberHooks extends PageObject {

  @Before
  public void beforeTest() {
    System.out.println("setup webdriver");
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    options.addArguments("--incognito");
    driver = new ChromeDriver(options);
    //implicit wait
    getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    getDriver().manage().window().maximize();
  }

  @After
  public void afterTest() {
    getDriver().quit();
  }

}
