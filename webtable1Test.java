import org.junit.jupiter.api.Test;
import org.open.selenium.chrome.ChromeDriver;
import org.open.selenium.WebDriver;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

    class webtable1Test {
        String Webdriver driver;
        @Test
        public void WebTable(){
            System.setProperty("webdriver.chrome.driver " , "drivers/chromeDriver");
            driver = new chromeDriver();
            driver.get("https://demoqa.com/webtables");

            WebElement searchBox = driver.findElement(By.id("searchBox"));
            boolean isEnabled = searchBox.isEnabled();
            if(isEnabled){
            searchBox.click();
            System.out.println("searchBox button is clicked.");

        }
    }

}



