package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ucuncutest {
    @Test(groups = "smoke")
    public  void UC() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("www.google.com");
        Assert.assertFalse(driver.getCurrentUrl().equals("www.google.com"));
        System.out.println("ucuncu test yazildi");
    }
}
