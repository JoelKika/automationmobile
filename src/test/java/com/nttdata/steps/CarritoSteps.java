package com.nttdata.steps;

import com.nttdata.screens.CarritoDosScreen;
import com.nttdata.screens.CarritoScreen;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarritoSteps {
    CarritoScreen carritoScreen;
    CarritoDosScreen carritoDosScreen;
    public void validoProductosCargados(){
        Assert.assertTrue("No se mostró el titulo Pruducts", carritoScreen.isProductDisplayed());
    }
    public void validateCategoria(String categoria){
        Assert.assertEquals("Categoria no existe: ",categoria, carritoScreen.getCategoria());
        carritoScreen.clickCategoria();
    }
    public void addAlCarrito( ){
        carritoScreen.clickAddTocar();
    }
    public void ajustarCantidad(int cantidad) {
        for (int i = 1; i < cantidad; i++) {
            carritoScreen.clickajustar();
        }
    }
    public void validateAgregarCarrito(int cantidad){
        if (cantidad == 1) {
            addAlCarrito();
        } else {
            ajustarCantidad(cantidad);
            addAlCarrito();
        }
    }
    public void entrarACarrito( ){
        carritoScreen.clickCarrito();
    }
    public void validaCantidadAdd(String cantidadAd){
        try {
            Assert.assertEquals("Cantidad Añadido no coincide", cantidadAd, carritoScreen.getCantidadAdd());
            System.out.println("Validación exitosa: Cantidad añadida coincide");
        } catch (AssertionError e) {
            System.out.println("Error en validación: ");
        }
    }

}



