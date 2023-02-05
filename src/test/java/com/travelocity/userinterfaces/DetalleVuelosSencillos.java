package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleVuelosSencillos {
    public static final Target BUTTON_ORIGEN = Target.the("button de origen").locatedBy("//button[@data-stid='location-field-leg1-origin-menu-trigger']");
    public static final Target INPUT_ORIGEN_SENCILLO  = Target.the("input de origen").locatedBy("//input[@id='location-field-leg1-origin']");
    public static final Target BUTTON_DESTINO_SENCILLO = Target.the("button de destino").locatedBy("//button[@data-stid='location-field-leg1-destination-menu-trigger']");
    public static final Target INPUT_DESTINO_SENCILLO = Target.the("input de destino").locatedBy("//input[@id='location-field-leg1-destination']"); // bien
    public static final Target SELECCIONAR_FECHA_SALIDA = Target.the("seleccionar fecha salida").locatedBy("//button[@id='d1-btn']");
    public static final Target FECHA_SALIDA = Target.the("calendario fecha salida").locatedByFirstMatching("//button[@data-day='28']");
    public static final Target BUTTON_LISTO_FECHA_SALIDA = Target.the("boton listo fechas salida").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target BUTTON_BUSCAR_VUELO_SENCILLO = Target.the("boton buscar vuelos").locatedBy("//button[@data-testid='submit-button']");
    public static final Target INPUT_AGREGAR_HOSPEDAJE = Target.the("input agregar hospedaje").locatedBy("//input[@id='add-hotel-checkbox']");
    public static final Target SELECCIONAR_FECHA_FINAL_HOSPEDAJE_V_SENCILLO = Target.the("seleccionar fecha regreso").locatedBy("//button[@id='d2-btn']");
    public static final Target FECHA_FINAL_HOSPEDAJE_V_SENCILLO  = Target.the("calendario fecha regreso").locatedByFirstMatching("//button[@data-day='28']");
    public static final Target BUTTON_LISTO_FECHA_FINAL_HOSPEDAJE_V_SENCILLO  = Target.the("button listo fecha final hospedaje").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target BUTTON_TIPO_CLASE_VUELO = Target.the("boton seleccionar clase vuelo").locatedBy("//button[@id='preferred-class-input-trigger']");
    public static final Target A_CLASE_EJECUTIVA_SENCILLO  = Target.the("anchor clase ejecutiva").locatedBy("//a[span='Clase ejecutiva']");

    //public static final Target xxx = Target.the("").locatedBy("");

}
