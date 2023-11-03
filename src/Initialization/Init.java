package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Init   {
    public static WebDriver driver = null;
    public static void Setup()
    {
        System.setProperty("webdriver.chrome.driver",
                "/Users/phamthanhtung/Documents/framework/Setup/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static void TearDown () throws Exception
    {
        Thread.sleep(1000);
        driver.quit();
    }
}
