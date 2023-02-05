package com.travelocity.tasks;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterfaces.DetalleVuelos;
import com.travelocity.userinterfaces.DetalleVuelosSencillos;
import com.travelocity.userinterfaces.MenuTravelocity;
import com.travelocity.userinterfaces.MenuViaje;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

public class SeleccionarOrigenVuelosSencillos {
    public static Performable para(String origenName){
        return Task.where("{1} abre el menu de viajes y selecciona origen {2}",
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(MenuTravelocity.A_VUELOS),
                Click.on(MenuViaje.A_VUELO_SENCILLO),
                Click.on(DetalleVuelosSencillos.BUTTON_ORIGEN),
                Enter.keyValues(origenName).into(DetalleVuelosSencillos.INPUT_ORIGEN_SENCILLO ).thenHit(Keys.ENTER)
                );
    }
}
