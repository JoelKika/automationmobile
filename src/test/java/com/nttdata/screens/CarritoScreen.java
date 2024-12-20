package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarritoScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblProduct;
    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(lblProduct));
        return lblProduct.isEnabled();
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Backpack\"]")
    private WebElement selecCategoria;
    public String getCategoria(){
        waitFor(ExpectedConditions.visibilityOf(selecCategoria));
        return selecCategoria.getText();
    }
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement irAcategoria;
    public void clickCategoria(){
        irAcategoria.click();
    }
        @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement validarcantidad;
    public int getCantidad() {
        waitFor(ExpectedConditions.visibilityOf(validarcantidad));
        return Integer.parseInt(validarcantidad.getText().trim());
    }
    @AndroidFindBy(xpath ="//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement clicAddTocar;
    public void clickAddTocar(){
        clicAddTocar.click();
    }
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement ajustarCantidad;
    public void clickajustar(){
        ajustarCantidad.click();
    }
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/cartTV\"]")
    private WebElement verificarcarrito;

    public void clickCarrito(){
        verificarcarrito.click();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement checkCantidadAdd;
    public String getCantidadAdd(){
        waitFor(ExpectedConditions.visibilityOf(checkCantidadAdd));
        return checkCantidadAdd.getText();
    }

}
