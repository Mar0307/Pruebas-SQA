package com.saucedemo.questions;

import com.saucedemo.userinterface.PaginaCheckoutCompleto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarMensajeDeAprobacion implements Question<Boolean> {

    public final String mensajeExitoso;

    public VerificarMensajeDeAprobacion(String mensajeExitoso) {
        this.mensajeExitoso = mensajeExitoso;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return PaginaCheckoutCompleto.LABEL_GRACIAS_POR_ORDENAR.resolveFor(actor).getText().equals(mensajeExitoso);
    }

    public static VerificarMensajeDeAprobacion deFinalizarElPago(String mensajeExitoso){
        return new VerificarMensajeDeAprobacion(mensajeExitoso);
    }
}
