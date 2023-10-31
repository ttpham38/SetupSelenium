package Basic_Functions_Of_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;

    public void launchBrower() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/phamthanhtung/Documents/framework/Setup/chromedriver-mac-arm64chromedriver");
        driver = new ChromeDriver();
        driver.get("https://nhasachphuongnam.com/");
        // maximum size  the window
        driver.manage().window().maximize();
        boolean buttonlogin = driver.findElement(By.xpath("//i[@class='ty-icon-user']")).isEnabled();
        if ( buttonlogin == true ){
            driver.findElement(By.xpath("//i[@class='ty-icon-user']")).click();
        }
        else System.out.println("khong click duoc dau ban oi !!");

        driver.findElement(By.xpath("//a[@class='cm-dialog-opener cm-dialog-auto-size account']")).click();
        driver.findElement(By.id("login_popup2194")).sendKeys("phamtung4312@gmail.com");
        driver.findElement(By.id("psw_popup2194")).sendKeys("@Angel09091997");
        driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
        driver.findElement(By.name("login")).submit();
        //System.out.println(driver.getTitle());
        //Thread.sleep(5000);
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        Main obj = new Main();
        obj.launchBrower();

    }
}