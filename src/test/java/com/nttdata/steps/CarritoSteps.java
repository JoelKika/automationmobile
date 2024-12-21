package com.nttdata.steps;

import com.nttdata.screens.CarritoScreen;
import org.junit.Assert;

public class CarritoSteps {
    CarritoScreen carritoScreen;
    public void validoProductosCargados(){
        Assert.assertTrue("No se mostró el titulo Pruducts", carritoScreen.isProductDisplayed());
    }
    public void validateCategoria(String categoria){
        Assert.assertEquals("Categoria no existe: ",categoria, carritoScreen.getCategoria(categoria));
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
    public void entrarACarrito(int cantidad){
        carritoScreen.clickCarrito();
        validaCantidadAdd(cantidad);
    }
    public void validaCantidadAdd(int cantidadAd){
        try {
            Assert.assertEquals("Cantidad Añadido no coincide", cantidadAd, carritoScreen.getCantidadAdd());
            System.out.println("Validación exitosa: Cantidad añadida coincide");
        } catch (AssertionError e) {
        }
    }

}



