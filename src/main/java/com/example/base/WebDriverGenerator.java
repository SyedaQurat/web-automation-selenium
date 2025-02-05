package com.example.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverGenerator {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }
    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}