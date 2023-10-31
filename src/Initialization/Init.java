package Initialization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Init   {
    public static WebDriver driver = null;
    public static void Setup()
    {
        System.setProperty("webdriver.chrome.driver",
                "/Users/phamthanhtung/Documents/framework/Setup/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void TearDown () throws Exception
    {
        Thread.sleep(1000);
        driver.quit();
    }
}
