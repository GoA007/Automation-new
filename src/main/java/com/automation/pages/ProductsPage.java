package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    private final By title = By.cssSelector("span.title");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitleText() {
        return getText(title);
    }

    public boolean isProductsPageLoaded() {
        return isVisible(title);
    }
}
