package com.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCheckoutCompleto {

    public static final Target LABEL_GRACIAS_POR_ORDENAR =
            Target.the("Label de etiqueta de finalizacion del proceso")
                    .located(By.xpath("//h2"));
}
