package com.travelocity.stepdefinitions;

import com.travelocity.tasks.*;
import com.travelocity.userinterfaces.VuelosEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VuelosSencillosStepDefinitions {
    @Dado("{actor} actualmente se encuentra en {string}")
    public void lugarDeOrigen(Actor actor, String origen) {
        actor.attemptsTo(
                SeleccionarOrigenVuelosSencillos.para(origen)
        );
    }

    @Cuando("quiera viajar a {string}")
    public void viajeDestino(String destino) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelosSencillos.destino(destino)
        );
    }
    @Entonces("debe obtener al menos una opcion de vuelo")
    public void vueloObtenerAlgunaOpcion() {
        Ensure.that(VuelosEncontrados.LISTA_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }
    @Cuando("quiera viajar a {string} con opcion de agregar hospedaje por 15 dias")
    public void destinoVueloSencilloConHospedaje(String destino) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelosSencillosConHospedaje.destino(destino)
        );
    }
    @Entonces("debo obtener al menos una opcion de vuelo con hospedaje")
    public void vueloSencilloObtenerAlgunaOpcionDeHospedaje() {
        Ensure.that(VuelosEncontrados.LISTA_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }
    @Cuando("quiera viajar a {string} en clase ejecutiva")
    public void destinoVueloSencilloClaseEjecutiva(String destino) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelosSencillosClaseEjecutiva.destino(destino)
        );
    }
    @Entonces("debe obtener al menos una opcion de vuelo en clase ejecutiva")
    public void vueloSencilloObtenerAlgunaOpcionDeVueloEjecutivo() {
        Ensure.that(VuelosEncontrados.LISTA_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }
}
