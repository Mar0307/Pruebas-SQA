package com.saucedemo.tasks;

import com.saucedemo.userinterface.PaginaCheckOutDos;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class FinalizarProceso implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Serenity.takeScreenshot();
        actor.attemptsTo(Scroll.to(PaginaCheckOutDos.BOTON_FINALIZAR));
        Serenity.takeScreenshot();
        actor.attemptsTo(Click.on(PaginaCheckOutDos.BOTON_FINALIZAR));
    }

    public static  FinalizarProceso deLaCompraSauseDemo(){
        return Tasks.instrumented(FinalizarProceso.class);
    }
}
