package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
public class ChromeTesting {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/";

        // Set up Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open the URL
        driver.get(baseUrl);

        // Print the title of the page
        System.out.println("Title of the page is : " + driver.getTitle());

        // Print the current URL
        System.out.println("Current URL is : " + driver.getCurrentUrl());


        // Print the page source.
        System.out.println("Page source is : " + driver.getPageSource());

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

        // click on the 'Log In' button
        WebElement signUpButton = driver.findElement(By.className("button"));
        signUpButton.click();

        // Navigate to baseUrl
        driver.navigate().to(baseUrl);

        // Navigate forward to the Homepage
        driver.navigate().forward();

        // Navigate back to baseUrl
        driver.navigate().back();

        // Refreth the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }

}
