import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:/QA/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        WebElement date = driver.findElement(By.id("date"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);

        name.sendKeys("Jacob Vorstenbosch");
        date.sendKeys("04/04/2020");


        driver.quit();
    }
}
