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
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement  productouno;
    @AndroidFindBy(xpath =  "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Backpack\"]")
    private WebElement productodos;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bike Light\"]")
    private WebElement productotres;
    public String getCategoria(String cat){
        switch(cat){
            case "Sauce Labs Bolt T-Shirt":
                waitFor(ExpectedConditions.visibilityOf(productouno));
                return productouno.getText();
            case "Sauce Labs Backpack":
                waitFor(ExpectedConditions.visibilityOf(productodos));
                return productodos.getText();
            case "Sauce Labs Bike Light":
                waitFor(ExpectedConditions.visibilityOf(productotres));
                return productotres.getText();
        }
        return "";
    }
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement irAcategoria;
    public void clickCategoria(){
        waitFor(ExpectedConditions.visibilityOf(irAcategoria));
        irAcategoria.click();
    }
    @AndroidFindBy(xpath ="//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement clicAddTocar;
    public void clickAddTocar(){
        waitFor(ExpectedConditions.visibilityOf(clicAddTocar));
        clicAddTocar.click();
    }
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement ajustarCantidad;
    public void clickajustar(){
        waitFor(ExpectedConditions.visibilityOf(ajustarCantidad));
        ajustarCantidad.click();
    }
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/cartTV\"]")
    private WebElement verificarcarrito;
    public void clickCarrito(){
        waitFor(ExpectedConditions.visibilityOf(checkCantidadAdd));
        verificarcarrito.click();
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement checkCantidadAdd;
    public String getCantidadAdd(){
        System.out.println(checkCantidadAdd.getText());
        waitFor(ExpectedConditions.visibilityOf(checkCantidadAdd));
        return checkCantidadAdd.getText();
    }
}
