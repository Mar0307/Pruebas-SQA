package com.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCarrito extends PageObject {

    public static final Target BOTON_CHECKOUT =
            Target.the("Boton de aceptacion del precio total y continuar con el pago")
                    .located(By.id("checkout"));
}
