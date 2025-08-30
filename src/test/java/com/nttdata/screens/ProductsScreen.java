package com.nttdata.screens;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsScreen extends PageObject {

    @FindBy(xpath = "//android.widget.TextView[@text='PRODUCTS']")
    private WebElement productsTitle;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartCounterTV")
    private WebElement cartCounter;

    public boolean isTitleVisible() {
        return productsTitle.isDisplayed();
    }

    public void clickOnProduct(String productName) {
        getDriver().findElement(AppiumBy.accessibilityId(productName)).click();
    }

    public String getCartCounterText() {
        return cartCounter.getText();
    }
}