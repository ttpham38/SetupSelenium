package Test;

import Initialization.Init;
import org.openqa.selenium.By;
public class TestFB extends Init {
    public static void main(String[] args) throws Exception{
        Setup();
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("xxxxxxxxxxx@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("xxxxxxxxxxx");
        driver.findElement(By.name("login")).click();
        TearDown();

        Setup();
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("xxxxxxxxxxx@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("xxxxxxxxxxx");
        driver.findElement(By.name("login")).click();
        TearDown();
    }


}
