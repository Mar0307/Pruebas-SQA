package com.saucedemo.tasks;

import com.saucedemo.userinterface.PaginaCarrito;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class ContinuoCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Serenity.takeScreenshot();
        actor.attemptsTo(Scroll.to(PaginaCarrito.BOTON_CHECKOUT));
        Serenity.takeScreenshot();
        actor.attemptsTo(Click.on(PaginaCarrito.BOTON_CHECKOUT));
    }

    public static ContinuoCheckout viendoElCostoTotalDeArticulos(){
        return Tasks.instrumented(ContinuoCheckout.class);
    }
}
