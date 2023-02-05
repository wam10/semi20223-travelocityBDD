package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuTravelocity {
    public static final Target A_VUELOS = Target.the("menu de vuelos").locatedBy("//span[text()='Vuelos']/..");
    public static final Target A_HOSPEDAJE = Target.the("menu de hospedaje").locatedBy("//a[span='Hospedaje']");
}
