package Dropdown_Radio_Checkbox;

import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Handle_Static_Dropdown extends Init {
    Init init = new Init();
    public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        WebElement element = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
        // Khai bao doi tuong kieu Select cho element
        Select selectSimple = new Select(element);
         /*-----chon Bhutan theo Text -----*/

        selectSimple.selectByVisibleText("Bhutan");

        /*-----Neu lay theo Index thi bat dau tu vi tri 0 -----*/

        /*-----chon gia tr vi tri 100 -----*/
        selectSimple.selectByIndex(100);

        /*-----chon theo value-----*/

        selectSimple.selectByValue("ASM");

        selectSimple.selectByValue("VNM");

        selectSimple.selectByValue("URY");

        selectSimple.selectByValue("GBR");

        /*-----Dem so luong phan tu trong dropdown list-----*/
        System.out.println(selectSimple.getOptions().size());
        /*-----Xem coi thang nao duoc chon dau tien-----*/
        System.out.println(selectSimple.getFirstSelectedOption().getText());
        /*-----lay danh sach tat ca trong dropdown list -----*/
        List<WebElement> getallOption = selectSimple.getOptions();
        for (int i = 0 ; i < getallOption.size(); i++){
            System.out.println(getallOption.get(i).getText());
        }

        /*-----lay danh sach tat ca trong dropdown list -----*/
        WebElement dropdownElement = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));

        // Tạo một đối tượng Select
        Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();
        // Kiểm tra xem các mục có được sắp xếp theo thứ tự alphabet không
        boolean isSorted = true;
        String previousOption = "";
        for (WebElement option : options) {
            String currentOption = option.getText();
            if (previousOption.compareTo(currentOption) > 0) {
                isSorted = false;
                break;
            }
            previousOption = currentOption;
        }
        String previousOption1 = "Albania";
        String previousOption2 = "Ål";
        if (previousOption1.compareTo(previousOption2) > 0) {
            isSorted = false;
        }

        if (isSorted) {
            System.out.println("Danh sách được sắp xếp theo thứ tự tăng dần.");
        } else {
            System.out.println("Danh sách không sắp xếp theo thứ tự tăng dần.");
        }

        System.out.println("Done");
        TearDown();
    }
}
