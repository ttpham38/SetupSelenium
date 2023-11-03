package Test;

import Initialization.Init;
import org.openqa.selenium.By;
public class TestFB extends Init {
    public static void main(String[] args) throws Exception{
        Setup();
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("phamtung4312@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("@Angel09091997");
        driver.findElement(By.name("login")).click();
        TearDown();

        Setup();
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("phamtung4312@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("@Angel091997");
        driver.findElement(By.name("login")).click();
        TearDown();
    }


}
