package FindLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    WebDriver driver;

    public void launchBrower() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/phamthanhtung/Documents/framework/Setup/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://anhtester.com/");
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.findElement(By.id("btn-login")).click();
        driver.findElement(By.name("email")).sendKeys("phamtung4312@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("@Angel09091997");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        Locators obj = new Locators();
        obj.launchBrower();

    }
}