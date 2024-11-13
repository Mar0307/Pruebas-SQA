package com.saucedemo.interactions;

import com.saucedemo.userinterface.PaginaInventario;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarCarrito implements Interaction {

    private final int numeroArticulos;

    public AgregarCarrito(int numeroArticulos) {
        this.numeroArticulos = numeroArticulos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int contador = 1;

        for(int i=1; i <=numeroArticulos; i++ ){
            actor.attemptsTo(Click.on(PaginaInventario.BUTTON_AGREGAR_CARRITO.of(String.valueOf(contador))));
            contador++;
        }
        Serenity.takeScreenshot();
        actor.attemptsTo(Click.on(PaginaInventario.BOTON_CARRITO));
    }

    public static AgregarCarrito losProductosAleatorios(int numeroArticulos){
        return Tasks.instrumented(AgregarCarrito.class, numeroArticulos);
    }
}
