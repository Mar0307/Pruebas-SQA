package com.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInventario extends PageObject {

    public static final Target BUTTON_AGREGAR_CARRITO =
            Target.the("Botones generales para agregar al carrito")
                    .locatedBy("(//div[@class='inventory_item_price']/following::button)[{0}]");

    public static final Target BOTON_CARRITO =
            Target.the("Boton para acceder al carrito")
                    .located(By.id("shopping_cart_container"));
}
