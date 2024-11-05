package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Click on the ‘Sign In’ link
 * 7. Print the current URL
 * 8. Enter the email in the email field.
 * 9. Enter the password in the password field.
 * 10. Click on the Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to the Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
public class MultiBrowserTesting {
    static String browser = "Firefox";
    static String baseUrl = "https://courses.ultimateqa.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }


        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        // Click on the ‘Sign In’ link
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();

        // Print the current URL
        System.out.println("Current URL after sign in: " + driver.getCurrentUrl());

        // Enter the email in the email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("priyanshp904@gmail.com");

        // Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("12345678");

        // Click on the Login button
        WebElement signUpButton = driver.findElement(By.className("button"));
        signUpButton.click();


        // Navigate to baseUrl
        driver.navigate().to(baseUrl);

        // Navigate forward to the Homepage
        driver.navigate().forward();

        // Navigate back to baseUrl
        driver.navigate().back();

        // Refresh the page
        driver.navigate().refresh();

        // Close the browser
         driver.quit();


    }

}
