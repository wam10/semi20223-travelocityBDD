package com.travelocity.stepdefinitions;

import com.travelocity.tasks.*;
import com.travelocity.userinterfaces.VuelosEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VuelosRedondosStepDefinitions {

    @Dado("{actor} esta en {string}")
    public void viajeOrigen(Actor actor, String origen) {
        actor.attemptsTo(
                SeleccionarOrigenVuelos.para(origen)
        );
    }
    @Cuando("quiera viajar a {string} por {int} dias")
    public void viajeDestinoConDias(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelos.destinoYDias(destino, cantidadDias)
                //WaitUntil.the("x comentario", isVisible()).forNoMoreThan(Duration.ofMillis(20000))
                // Es para que la pagina se queda cargando durante 20s buscando x comentario
        );
    }

    @Entonces("debe obtener alguna opcion de vuelo")
    public void viajeObtenerAlgunaOpcion() {
        Ensure.that(VuelosEncontrados.LISTA_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }
    @Cuando("quiera viajar a {string} por {int} dias agregando hospedaje")
        public void viajeDestinoConDiasYHospedaja(String destino, Integer cantidadDias){
            OnStage.theActorInTheSpotlight().attemptsTo(
                    SeleccionarDestinoVueloConHospedaje.destinoYDiasConHospedaje(destino, cantidadDias)
            );
        }

    @Entonces("debe obtener al menos una opcion de vuelo con hospedaje")
    public void vueloObtenerAlgunaOpcionConHospedaje() {
        Ensure.that(VuelosEncontrados.LISTA_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }
    @Cuando("quieran viajar a {string} por {int} dias con un total de 3 pasajeros")
    public void viajeDestinoPrimeraClaseConDias(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelosVariasPersonas.destinoYDiasVariasPersonas(destino, cantidadDias)
        );
    }
    @Entonces("debe obtener al menos una opcion de vuelo en primera clase para 3 personas")
    public void vueloObtenerAlgunaOpcionPrimeraClasePersonas() {
        Ensure.that(VuelosEncontrados.LISTA_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }
    @Cuando("quiera viajar a {string} por {int} dias agregando un auto")
    public void SeleccionarDestinoAgregrandoAuto(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoAgregandoAuto.destinoYDiasAgregandoAuto(destino, cantidadDias)
        );
    }
    @Entonces("debe obtener una opcion de vuelo con auto")
    public void vueloObtenerAlgunaOpcionConAuto() {
        Ensure.that(VuelosEncontrados.LISTA_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Cuando("quiera viajar a {string} por {int} dias en primera clase")
    public void SeleccionarDestinoPrimeraClase(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoPrimeraClase.destinoYDiasPrimeraClase(destino, cantidadDias)
        );
    }
    @Entonces("debe obtener alguna opcion de vuelo en primera clase")
    public void vueloObtenerAlgunaOpcionPrimeraClase() {
        Ensure.that(VuelosEncontrados.LISTA_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Cuando("quiera viajar a {string} por {int} en clase ejecutiva con opcion de agregar auto y hospedaje")
    public void SeleccionarDestinoClaseEjecutivaAutoYHospedaje(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoAgregandoAutoYHospedaje.destinoYDiasAgregandoAuto(destino, cantidadDias)
        );
    }
    @Entonces("debe obtener alguna opcion de vuelo con auto y hospedaje")
    public void vueloObtenerAlgunaOpcionClaseEjecutiva() {
        Ensure.that(VuelosEncontrados.LISTA_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }
}

