package com.travelocity.tasks;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterfaces.DetalleVuelos;
import com.travelocity.userinterfaces.MenuTravelocity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class SeleccionarDestinoVuelosVariasPersonas {
    public static Performable destinoYDiasVariasPersonas(String nombreDestino, Integer diasViaje){
        return Task.where("{1} selecciona destino y agregar hospedaje {6}",
                Click.on(DetalleVuelos.BUTTON_PASAJEROS),
                Click.on(DetalleVuelos.BUTTON_AUMENTAR_ADULTOS_CLICK),
                Click.on(DetalleVuelos.BUTTON_AUMENTAR_ADULTOS_CLICK),
                Click.on(DetalleVuelos.BUTTON_LISTO_PERSONAS),
                Click.on(DetalleVuelos.BUTTON_SELECCIONAR_CLASE_VUELO),
                Click.on(DetalleVuelos.A_PRIMERA_CLASE),
                Click.on(DetalleVuelos.BUTTON_DESTINO),
                Enter.theValue(nombreDestino).into(DetalleVuelos.INPUT_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleVuelos.SELECCIONAR_FECHA_REGRESO),
                Click.on(DetalleVuelos.FECHA_REGRESO),
                Click.on(DetalleVuelos.BUTTON_LISTO_FECHA_REGRESO),
                Click.on(DetalleVuelos.BUTTON_BUSCAR_VUELOS)
        );
    }
}
