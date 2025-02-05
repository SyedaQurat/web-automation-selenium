package com.example.tests;

import com.example.base.WebDriverGenerator;
import com.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends WebDriverGenerator {

    @Test
    public void test_successful_login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Page is loaded.");

        loginPage.enterUsername("Admin");
        System.out.println("Username entered successfully.");

        loginPage.enterPassword("admin123");
        System.out.println("Password entered successfully.");

        loginPage.clickLoginButton();
        System.out.println("Login button is clicked.");

        loginPage.clickProfileButton();
        System.out.println("Profile test executed");

        boolean isLogoutButtonDisplay = loginPage.displayLogoutButton();
        Assert.assertTrue(isLogoutButtonDisplay, "Logout link is displayed");

        System.out.println("Login test executed");
    }
}
