import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMAutomation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("\"https://opensource-demo.orangehrmlive.com\"");

        // Finding elements using Selenium and wrapping them using created classes
        WebElement usernameElement = driver.findElement(By.className("oxd-input"));
        WebElement passwordElement = driver.findElement(By.className("oxd-input oxd-input--active"));
        WebElement loginButtonElement = driver.findElement(By.id("submit"));

        InputField usernameInput = new InputField(usernameElement);
        InputField passwordInput = new InputField(passwordElement);
        Button loginButton = new Button(loginButtonElement);

        // Polymorphism: Using a common method to perform actions on different types of elements
        usernameInput.performAction(); // Enters text into the username field
        passwordInput.performAction(); // Enters text into the password field
        loginButton.performAction(); // Clicks the login button

        // Close the browser
        driver.quit();
    }
}



