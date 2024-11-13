package com.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin extends PageObject {

    public static final Target INPUT_NOMBRE_USUARIO =
            Target.the("Txt de nombre de usuario")
                    .located(By.id("user-name"));

    public static final Target INPUT_CONTRASENA =
            Target.the("Txt de Contraseña")
                    .located(By.id("password"));

    public static final Target BTN_INICIAR_SESION =
            Target.the("Btn de Iniciar Sesion")
                    .located(By.id("login-button"));
}
