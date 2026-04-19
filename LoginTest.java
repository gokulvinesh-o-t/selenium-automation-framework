package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage page = new LoginPage(driver);
        page.login("tomsmith", "SuperSecretPassword!");
        System.out.println("Login executed successfully");
    }
}