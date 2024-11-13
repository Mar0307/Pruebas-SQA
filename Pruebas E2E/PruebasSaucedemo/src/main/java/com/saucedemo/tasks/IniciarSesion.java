package com.saucedemo.tasks;

import com.saucedemo.models.InicioSesionModel;
import com.saucedemo.userinterface.PaginaLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class IniciarSesion implements Task {

    private final InicioSesionModel inicioSesionModel;

    public IniciarSesion(InicioSesionModel inicioSesionModel) {
        this.inicioSesionModel = inicioSesionModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Enter.theValue(inicioSesionModel.getUsuario()).into(PaginaLogin.INPUT_NOMBRE_USUARIO));
        actor.wasAbleTo(Enter.theValue(inicioSesionModel.getContrasena()).into(PaginaLogin.INPUT_CONTRASENA));
        actor.wasAbleTo(Click.on(PaginaLogin.BTN_INICIAR_SESION));
    }

    public static IniciarSesion enSaucedemo(InicioSesionModel inicioSesionModel){
        return Tasks.instrumented(IniciarSesion.class, inicioSesionModel);
    }
}
