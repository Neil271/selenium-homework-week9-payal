import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Project-4 - ProjectName: com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 */
public class MultiBrowserTest {

    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }

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
        System.out.println(currentUrl);

        //5. Print the page source.
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        //6. Enter the email in the email field.
        WebElement emailId = driver.findElement(By.id("user-name"));
        emailId.sendKeys("abc123@gmail.com");

        //7. Enter the password in the password field.
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("xyz123@");

        //8. Click on the Login Button.
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //9. Print the current URL.
        System.out.println("Get Current Url :" + driver.getCurrentUrl());

        //10. Navigate to baseUrl
        driver.navigate().to(baseUrl);

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.quit();
    }
}
