//
//package Dropdown_Radio_Checkbox;
//
//import Initialization.Init;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//
//
//
//public class Dropdownlist_Country extends Init {
//    Init init = new Init();
//    public static void main(String[] args) throws Exception {
//        Setup();
//        driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
//        WebElement countryDropdown = driver.findElement(By.id("country"));
//        java.util.List<WebElement> countryOptions = countryDropdown.findElements(By.tagName("option"));
//
//        String previousCountry = countryOptions.get(0).getText();
//
//        for (int i = 1; i < countryOptions.size(); i++) {
//            String currentCountry = countryOptions.get(i).getText();
//            if (currentCountry.compareTo(previousCountry) <= 0) {
//                // Danh sách không được sắp xếp theo thứ tự tăng dần
//                Assert.fail("Danh sách không được sắp xếp theo thứ tự tăng dần");
//                break;
//            }
//
//            previousCountry = currentCountry;
//        }
//
//        Assert.assertTrue(true, "Danh sách được sắp xếp theo thứ tự tăng dần");
//        TearDown();
//    }
//}
//
