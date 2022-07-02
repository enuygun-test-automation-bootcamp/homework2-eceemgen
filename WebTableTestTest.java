import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class import org.junit.jupiter.api.Test;
        import org.opendemoqa.selenium.WebDriver;
        import org.opendemoqa.selenium.chrome.ChromeDriver;

        import java.util.ArrayList;


class WebTableTestTest {
    String Webdriver driver;
    @Test
    public void WebTable(){
        System.setProperty("webdriver.chrome driver " , "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");

        WebElement searchBox = driver.findElement(By.id("searchBox"));
        searchBox.click();
        ArrayList<String> tabs = new ArrayList<>(driver , getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        try{
            thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.close();
    }
}
