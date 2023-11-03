package Dropdown_Radio_Checkbox;

import org.openqa.selenium.By;
import Initialization.*;
import org.openqa.selenium.WebElement;

public class Handle_RadioButton extends Init {
    Init init = new Init();

    public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://formstone.it/components/checkbox/demo/");
        Thread.sleep(1000);
        WebElement radiobutton = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[4]/div[1]/div[1]"));

        if (radiobutton.isSelected() == false) {
            System.out.println("chua duoc chon");
            driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[4]/div[1]/div[1]")).click();
            System.out.println("moi duoc chon");
        }
        else {
            System.out.println("duoc chon");
        }
        TearDown();

    }
}
