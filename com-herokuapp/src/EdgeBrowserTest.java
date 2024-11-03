import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

/**
 * Project-3 - ProjectName: com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 */
public class EdgeBrowserTest {
    public static void main(String[] args) {
        //BaseUrl
        String baseUrl = "http://the-internet.herokuapp.com/login";

        //1. Set up Chrome browser.
        WebDriver driver = new EdgeDriver();

        //2. Open URL.
        driver.get(baseUrl);

        //Maximise the Browser window
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //4. Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url " + currentUrl);

        //5. Print the page source.
        System.out.println("The page source :" + driver.getPageSource());

        //6. Enter the email in the email field.
        WebElement emailId = driver.findElement(By.id("username"));
        emailId.sendKeys("abc123@gmail.com");

        //7. Enter the password in the password field.
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("xyz123@");

        //8. Click on the Login Button.
        WebElement loginButton = driver.findElement(By.className("radius"));
        loginButton.click();

        //9. Print the current URL.
        System.out.println("Get current url : " + driver.getCurrentUrl());

        //10. Refresh the page.
        driver.navigate().refresh();

        //11. Close the browser.
        driver.quit();
    }
}
