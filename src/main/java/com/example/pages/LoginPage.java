package com.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.name("username")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void clickProfileButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[data-v-bdd6d943]")));
        profileButton.click();
    }

    public boolean displayLogoutButton() {
        WebElement logoutButton = driver.findElement(By.cssSelector("ul.oxd-dropdown-menu a.oxd-userdropdown-link[href='/web/index.php/auth/logout']"));
        logoutButton.isDisplayed();
        return true;
    }
}

