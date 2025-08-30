package com.nttdata.steps;

import com.nttdata.screens.ProductDetailScreen;
import com.nttdata.screens.ProductsScreen;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class SauceLabsActions {

    ProductsScreen productsScreen;
    ProductDetailScreen productDetailScreen;

    @Step("Valida que la galería de productos se muestra correctamente")
    public void galeriaDeProductosEsVisible() {
        assertThat(productsScreen.isTitleVisible()).isTrue();
    }

    @Step("Agrega {0} unidades del producto {1}")
    public void agregarProductosAlCarrito(int unidades, String producto) {
        productsScreen.clickOnProduct(producto);
        for (int i = 0; i < unidades; i++) {
            productDetailScreen.clickAddToCart();
        }
    }

    @Step("Valida que el contador del carrito muestra {0}")
    public void elContadorDelCarritoMuestra(String unidadesEsperadas) {
        String unidadesActuales = productsScreen.getCartCounterText();
        assertThat(unidadesActuales).isEqualTo(unidadesEsperadas);
    }
}