package com.travelocity.tasks;


import com.travelocity.userinterfaces.DetalleVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarDestinoVuelos implements Task{
    private String destino;
    private Integer diasViaje;
    public SeleccionarDestinoVuelos(String destino, Integer diasViaje){
        this.destino = destino;
        this.diasViaje = diasViaje;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleVuelos.BUTTON_DESTINO),
                Enter.theValue(this.destino).into(DetalleVuelos.INPUT_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleVuelos.SELECCIONAR_FECHA_REGRESO),
                Click.on(DetalleVuelos.FECHA_REGRESO),
                Click.on(DetalleVuelos.BUTTON_LISTO_FECHA_REGRESO),
                Click.on(DetalleVuelos.BUTTON_BUSCAR_VUELOS)
        );
    }

    public static Performable destinoYDias(String destino, Integer diasViaje){
        return instrumented(SeleccionarDestinoVuelos.class, destino, diasViaje);
    }
}
