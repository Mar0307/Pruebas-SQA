package com.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCheckOutUno extends PageObject {

    public static final Target INPUT_NOMBRE =
            Target.the("Txt de ingresar nombre")
                    .located(By.id("first-name"));
    public static final Target INPUT_APELLIDO =
            Target.the("Txt de ingresar apellido")
                    .located(By.id("last-name"));
    public static final Target INPUT_CODIGO_POSTAL =
            Target.the("Txt de ingresar el codigo postal")
                    .located(By.id("postal-code"));

    public static final Target BOTON_CONTINUE =
            Target.the("Boton para completar el proceso de compra ")
                    .located(By.xpath("//input[@id='continue']"));
}
