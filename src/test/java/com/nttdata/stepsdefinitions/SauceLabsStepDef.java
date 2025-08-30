package com.nttdata.stepdefinitions;

import com.nttdata.steps.SauceLabsActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SauceLabsStepDef {

    @Steps
    SauceLabsActions sauceLabsActions;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {
        // Serenity abre la app automáticamente. No se necesita código.
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductos() {
        sauceLabsActions.galeriaDeProductosEsVisible();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUnidadesDelSiguienteProducto(int unidades, String producto) {
        sauceLabsActions.agregarProductosAlCarrito(unidades, producto);
    }

    @Then("valido el carrito de compra actualice a {string}")
    public void validoElCarritoDeCompraActualiceCorrectamente(String unidadesEsperadas) {
        sauceLabsActions.elContadorDelCarritoMuestra(unidadesEsperadas);
    }
}