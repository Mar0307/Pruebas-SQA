package com.saucedemo.tasks;

import com.saucedemo.userinterface.PaginaCheckOutUno;
import com.saucedemo.utils.LogicaUtils;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompletarCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Serenity.takeScreenshot();
        actor.attemptsTo(Enter.theValue(LogicaUtils.getCadenaAleatoria(12,"texto")).into(PaginaCheckOutUno.INPUT_NOMBRE));
        actor.attemptsTo(Enter.theValue(LogicaUtils.getCadenaAleatoria(12,"texto")).into(PaginaCheckOutUno.INPUT_APELLIDO));
        actor.attemptsTo(Enter.theValue(LogicaUtils.getCadenaAleatoria(6,"numerico")).into(PaginaCheckOutUno.INPUT_CODIGO_POSTAL));
        Serenity.takeScreenshot();
        actor.attemptsTo(Click.on(PaginaCheckOutUno.BOTON_CONTINUE));
    }

    public static CompletarCheckout conInformacionUsuario(){
        return Tasks.instrumented(CompletarCheckout.class);
    }
}
