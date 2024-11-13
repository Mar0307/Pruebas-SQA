package com.saucedemo.stepdefinitions;

import com.saucedemo.models.InicioSesionModel;
import com.saucedemo.questions.VerificarMensajeDeAprobacion;
import com.saucedemo.tasks.*;
import com.saucedemo.interactions.AgregarCarrito;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinition {

    private final InicioSesionModel inicioSesionModel =  InicioSesionModel.getInstancia();

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Margarita");
    }

    @Dado("que inicio sesion en la pagina Saucedemo con los datos de sesion")
    public void queInicioSesionEnLaPaginaSaucedemoConLosDatosDeSesion(DataTable dataTable) {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.enElNavegador());
        inicioSesionModel.dataUsuario(dataTable.asLists().get(0));
        theActorInTheSpotlight().wasAbleTo(IniciarSesion.enSaucedemo(inicioSesionModel));
    }

    @Cuando("^agrego (.*) articulos al inventario para acceder al carrito de compras$")
    public void agregarArticulosInventrio(int numeroArticulos){
        theActorInTheSpotlight().attemptsTo(AgregarCarrito.losProductosAleatorios(numeroArticulos));
    }

    @Cuando("^continuo el checkout para visualizar y completar el formulario de compra$")
    public void agregarArticulosInventrio(){
        theActorInTheSpotlight().attemptsTo(ContinuoCheckout.viendoElCostoTotalDeArticulos());
        theActorInTheSpotlight().attemptsTo(CompletarCheckout.conInformacionUsuario());
    }

    @Entonces("se visualiza el costo total finalizando la compra")
    public void verCostoTotalYFinalizoCompra(){
        theActorInTheSpotlight().attemptsTo(FinalizarProceso.deLaCompraSauseDemo());
    }

    @Entonces("^se debe verificar el mensaje: (.*)$")
    public void verificarMensaje(String mensajeExitoso){
        theActorInTheSpotlight().should(seeThat(VerificarMensajeDeAprobacion.deFinalizarElPago(mensajeExitoso)));

    }
}