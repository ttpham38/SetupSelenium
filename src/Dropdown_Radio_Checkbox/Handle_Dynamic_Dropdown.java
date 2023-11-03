
import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dynamic_Dropdown extends Init {
    Init init = new Init();
    public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        WebElement selectCountry = driver.findElement(By.xpath("//span[contains(text(),'Select a Country')]"));
        selectCountry.click();
        TearDown();
        WebElement inputCountry = driver.findElement(By.xpath("//div[@class='chosen-container chosen-container-single chosen-with-drop chosen-container-active chosen-drop-up']//div[@class='chosen-search']"));
        inputCountry.sendKeys("VietNam");

        // khai bao doi tuong thuoc lop Action de handle truc tiep Keyboard cua ban phim may tinh
        Actions actions = new Actions(driver);
        // Ham build de xay dung hanh dong cho Action . ham perform de xac nhan xay dung do
        actions.sendKeys(Keys.ENTER).build().perform();
        TearDown();
    }
}
