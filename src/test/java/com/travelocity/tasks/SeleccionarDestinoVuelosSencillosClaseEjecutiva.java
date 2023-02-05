package com.travelocity.tasks;


import com.travelocity.userinterfaces.DetalleVuelosSencillos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarDestinoVuelosSencillosClaseEjecutiva implements Task{
    private String destino;
    public SeleccionarDestinoVuelosSencillosClaseEjecutiva(String destino){
        this.destino = destino;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleVuelosSencillos.BUTTON_TIPO_CLASE_VUELO),
                Click.on(DetalleVuelosSencillos.A_CLASE_EJECUTIVA_SENCILLO),
                Click.on(DetalleVuelosSencillos.BUTTON_DESTINO_SENCILLO ),
                Enter.theValue(this.destino).into(DetalleVuelosSencillos.INPUT_DESTINO_SENCILLO ).thenHit(Keys.ENTER),
                Click.on(DetalleVuelosSencillos.SELECCIONAR_FECHA_SALIDA),
                Click.on(DetalleVuelosSencillos.FECHA_SALIDA),
                Click.on(DetalleVuelosSencillos.BUTTON_LISTO_FECHA_SALIDA),
                Click.on(DetalleVuelosSencillos.BUTTON_BUSCAR_VUELO_SENCILLO)
        );
    }

    public static Performable destino(String lugarDestino){
        return instrumented(SeleccionarDestinoVuelosSencillosClaseEjecutiva.class, lugarDestino);
    }
}
