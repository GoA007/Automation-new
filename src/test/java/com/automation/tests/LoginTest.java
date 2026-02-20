package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;
import com.automation.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validUserCanLogin() {
        String baseUrl = System.getProperty("baseUrl", "https://www.saucedemo.com/");
        String username = System.getProperty("username", "standard_user");
        String password = System.getProperty("password", "secret_sauce");

        ProductsPage productsPage = new LoginPage(driver)
                .open(baseUrl)
                .loginAs(username, password);

        Assert.assertTrue(productsPage.isProductsPageLoaded(), "Products page should be loaded after login.");
        Assert.assertEquals(productsPage.getPageTitleText(), "Products", "Products header should be visible.");
    }
}
