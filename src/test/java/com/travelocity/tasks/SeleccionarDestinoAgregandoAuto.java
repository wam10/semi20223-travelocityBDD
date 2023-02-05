package com.travelocity.tasks;

import com.travelocity.userinterfaces.DetalleVuelos;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class SeleccionarDestinoAgregandoAuto {
    public static Performable destinoYDiasAgregandoAuto(String nombreDestino, Integer diasViaje){
        return Task.where("{1} selecciona destino y agregar auto {5}",
                Click.on(DetalleVuelos.BUTTON_DESTINO),
                Enter.theValue(nombreDestino).into(DetalleVuelos.INPUT_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleVuelos.SELECCIONAR_FECHA_REGRESO),
                Click.on(DetalleVuelos.FECHA_REGRESO),
                Click.on(DetalleVuelos.BUTTON_LISTO_FECHA_REGRESO),
                Click.on(DetalleVuelos.INPUT_AGREGAR_AUTO),
                Click.on(DetalleVuelos.BUTTON_BUSCAR_VUELOS)
        );
    }
}
