# web-automation-selenium
ReizTech Home test for Selenium


**Class: WebDriverGenerator**

This is the main class for setting the Selenium WebDriver to start.

This class has 3 following functions:
- setUp: responsible for setting up the driver to ChromeDriver()
- navigateTo: used for the navigation to the URL
- tearDown: quit the driver


**Class: LoginPage**

In this class, I have created a LoginPage constructor which is used to initialize the browser for further interacting with it.

_public LoginPage(WebDriver driver) 
{
   this.driver = driver;
}_

This class has 5 following functions:
- enterUsername: Enter username in the field
- enterPassword: Enter password in the field
- clickLoginButton: clicks login button
- clickProfileButton: Waits for the profile button to be clickable and then clicks it.
- displayLogoutButton: Checks if the logout button is displayed on the page.


**Class: LoginTests**

This class extends the WebDriverGenerator because it re-uses the WebDriver setup and teardown logic defined in it.
public class LoginTests extends WebDriverGenerator

This class has only 1 function which is a test-case:
_@Test
public void test_successful_login()_

This function checks that:
- When a valid username and password are provided, the user is logged in and a confirmation is displayed to indicate a successful login.
