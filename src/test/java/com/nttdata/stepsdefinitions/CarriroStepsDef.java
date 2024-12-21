package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CarriroStepsDef {
    @Steps
    CarritoSteps carritoSteps;
    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {

    }
    @Given("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria() {
        carritoSteps.validoProductosCargados();
    }
    @When("agrego {int} del siguiente producto {string}")
    public void agrego_del_siguiente_producto(int cantidad, String categoria) {
        carritoSteps.validateCategoria(categoria);
        carritoSteps.validateAgregarCarrito(cantidad);
    }
    @Then("valido el carrito de compra actualice correctamente {int}")
    public void valido_el_carrito_de_compra_actualice_correctamente(int cantidad) {
        carritoSteps.entrarACarrito(cantidad);
    }
}
