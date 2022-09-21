package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import repo.Repository;

import java.util.concurrent.TimeUnit;

public class BaseClass implements Repository {

    public WebDriver driver;

    @BeforeSuite
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("************START METHOD**********");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("************END METHOD**********");
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}
