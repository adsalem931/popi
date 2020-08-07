import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TestSample  {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/adsal/Downloads/chromedriver.exe");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("https://www.facebook.com/login.php");
        
        //hellow change









        //Close the browser
        driver.quit();
    }
}


