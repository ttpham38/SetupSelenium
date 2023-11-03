package Dropdown_Radio_Checkbox;
import org.openqa.selenium.By;
import Initialization.*;

public class Handle_Checkbox extends Init {
    Init init = new Init();
    public static void main(String[] args) throws Exception {
        Setup();

        /*----------  1 Checkbox ----------*/
        driver.navigate().to("https://demos.telerik.com/kendo-ui/checkbox/index");
        //Kiểm tra check box đã được check hay chưa
        Boolean isSelected = driver.findElement(By.xpath("//input[@id='eq6']")).isSelected();
        Thread.sleep(2000);

//Nếu chưa được check thì click vào ô check box đó
        if(isSelected == false)
        {
            System.out.println("chua duoc chon");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='eq6']")).click();
            Thread.sleep(1000);

//            WebElement msgDisplayed = driver.findElement(By.id("vehicle1"));
//            if (msgDisplayed.isSelected() == true ){
//                System.out.println("da duoc chon");
//                System.out.println(msgDisplayed.getText());
//            }
        }
        else {
            System.out.println("da duoc chon");
        }
        /*----------  Multi Checkbox ----------*/

        TearDown();
    }
}
