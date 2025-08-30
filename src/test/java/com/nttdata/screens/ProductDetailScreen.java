package com.nttdata.screens;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailScreen extends PageObject {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement addToCartButton;

    public void clickAddToCart() {
        addToCartButton.click();
    }
}
