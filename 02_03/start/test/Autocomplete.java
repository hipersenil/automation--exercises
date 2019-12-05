import okhttp3.Interceptor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\test\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
        autocomplete.sendKeys("7131 166th Street, Tinley Park, IL, USA");
        Thread.sleep(2000);
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        driver.quit();
    }
}
