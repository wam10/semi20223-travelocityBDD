package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleVuelos {
    public static final Target BUTTON_ORIGEN = Target.the("button de origen").locatedBy("//button[@data-stid='location-field-leg1-origin-menu-trigger']");
    //Dudas del XPath data-stid="location-field-leg1-origin-dialog-trigger"
    public static final Target INPUT_ORIGEN = Target.the("input de origen").locatedBy("//input[@id='location-field-leg1-origin']");
    public static final Target BUTTON_DESTINO = Target.the("button de destino").locatedBy("//button[@data-stid='location-field-leg1-destination-menu-trigger']");
    public static final Target INPUT_DESTINO = Target.the("input de destino").locatedBy("//input[@id='location-field-leg1-destination']");
    public static final Target SELECCIONAR_FECHA_REGRESO = Target.the("seleccionar fecha regreso").locatedBy("//button[@id='d2-btn']");
    public static final Target FECHA_REGRESO = Target.the("calendario fecha regreso").locatedByFirstMatching("//button[@data-day='28']");
    public static final Target BUTTON_LISTO_FECHA_REGRESO = Target.the("button listo fecha regreso").locatedBy("//button[@data-stid='apply-date-picker']");
    public static  final Target INPUT_HOSPEDAJE = Target.the("input de hospedaje").locatedBy("//input[@id='add-hotel-checkbox']");
    public static final Target SELECCIONAR_FECHA_FINAL_HOSPEDAJE = Target.the("seleccionar fecha regreso").locatedBy("//button[@id='d2-btn']");
    public static final Target FECHA_FINAL_HOSPEDAJE = Target.the("calendario fecha regreso").locatedByFirstMatching("//button[@data-day='28']");
    public static final Target BUTTON_LISTO_FECHA_REGRESO_HOSPEDAJE = Target.the("button listo fecha regreso hospedaje").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target BUTTON_BUSCAR_VUELOS = Target.the("boton buscar vuelos").locatedBy("//button[@data-testid='submit-button']");
    public static final Target BUTTON_PASAJEROS = Target.the("pestaña pasajeros").locatedBy("//button[@data-testid='travelers-field']");
    public static final Target BUTTON_AUMENTAR_ADULTOS_CLICK = Target.the("boton incrementar adultos").locatedBy("//span/*[@aria-label='Aumentar el número de adultos']/../..");
    public static final Target BUTTON_LISTO_PERSONAS = Target.the("boton listo personas").locatedBy("//button[@data-testid='guests-done-button']");
    public static final Target INPUT_AGREGAR_AUTO = Target.the("input agregar auto").locatedBy("//input[@id='add-car-checkbox']");
    public static final Target BUTTON_SELECCIONAR_CLASE_VUELO = Target.the("boton seleccionar clase vuelo").locatedBy("//button[@id='preferred-class-input-trigger']");
    public static final Target A_PRIMERA_CLASE = Target.the("anchor primera clase").locatedBy("//a[span='Primera clase']");
    public static final Target A_CLASE_EJECUTIVA = Target.the("ancho clase ejecutiva").locatedBy("//a[span='Clase ejecutiva']");

    //public static final Target xxx = Target.the("").locatedBy("");

}
