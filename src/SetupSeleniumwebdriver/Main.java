package SetupSeleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;

    public void Setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/phamthanhtung/Documents/framework/Setup/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


        driver.findElement(By.name("email")).sendKeys("phamtung4312@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("@Angel09091997");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        Main obj = new Main();
        obj.Setup();

    }
}