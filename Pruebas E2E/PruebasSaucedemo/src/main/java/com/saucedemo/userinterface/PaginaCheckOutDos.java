package com.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCheckOutDos {

    public static final Target BOTON_FINALIZAR =
            Target.the("Boton para finalizar proceso de compra")
                    .located(By.xpath("//button[@id='finish']"));
}
