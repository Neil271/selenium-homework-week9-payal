import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-5 - ProjectName: com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {
        //BaseUrl
        String baseUrl = "https://courses.ultimateqa.com/";

        // 1. Set up Chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Open URL.
        driver.get(baseUrl);

        //Maximize the browser window
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //4. Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Get current Url :" + currentUrl);

        //5. Print the page source.
        String pageSource = driver.getPageSource();
        System.out.println("Get Page Source :" + pageSource);

        //6. Click on the ‘Sign In’ link
        WebElement signInLink = driver.findElement(By.className("header__nav-sign-in"));
        signInLink.click();

        //7. Print the current URL
        System.out.println("Get Current Url :" + driver.getCurrentUrl());

        //8. Enter the email in the email field.
        WebElement emailId = driver.findElement(By.id("user[email]"));
        emailId.sendKeys("abc123@gmail.com");

        //9. Enter the password in the password field.
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("xyz123@");

        //10. Click on the Login Button.
        WebElement loginButton = driver.findElement(By.className("form__button-group"));
        loginButton.click();

        //11. Navigate to baseUrl.
        driver.navigate().to(baseUrl);

        //12. Navigate forward to the Homepage.
        driver.navigate().forward();
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

        //13. Navigate back to baseUrl.
        driver.navigate().back();
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

        //14. Refresh the page.
        driver.navigate().refresh();

        //15. Close the browser.
        driver.quit();
    }
}
