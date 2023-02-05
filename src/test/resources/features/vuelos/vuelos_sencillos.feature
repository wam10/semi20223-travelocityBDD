# language: es
Característica: Vuelos sencillos
  Yo como viajero
  quiero diseñar vuelos de ida o regreso
  para facilitar mis viajes.

  Escenario: vuelo sencillo con opciones por defecto
    Dado Wilmer actualmente se encuentra en "Cancún"
    Cuando quiera viajar a "Medellín"
    Entonces debe obtener al menos una opcion de vuelo


  Escenario: vuelo sencillo con opcion de hospedaje
    Dado Wilmer actualmente se encuentra en "Medellín"
    Cuando quiera viajar a "Cancún" con opcion de agregar hospedaje por 15 dias
    Entonces debe obtener al menos una opcion de vuelo con hospedaje


  Escenario: vuelo sencillo clase ejecutiva
    Dado Wilmer actualmente se encuentra en "Medellín"
    Cuando quiera viajar a "Cancún" en clase ejecutiva
    Entonces debe obtener al menos una opcion de vuelo en clase ejecutiva




