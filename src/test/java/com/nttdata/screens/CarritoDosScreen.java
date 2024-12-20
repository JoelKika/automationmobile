package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarritoDosScreen extends PageObject {
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bike Light\"]")
    private WebElement bikeLight;
    public String getbikeLight(){
        waitFor(ExpectedConditions.visibilityOf(bikeLight));
        return bikeLight.getText();
    }
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement irABikeLight;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
    private WebElement lblProduct;
    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(lblProduct));
        return lblProduct.isEnabled();
    }

}
