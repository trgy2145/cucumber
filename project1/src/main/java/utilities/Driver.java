package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver == null) {
            // System.setProperty("webdriver.chrome.driver","C:\\Users\\trgy2\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver");
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();



            
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver != null) {
            driver.quit();
            driver=null;
        }
    }
}
