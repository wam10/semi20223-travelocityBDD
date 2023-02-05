# language: es
Característica: Vuelos redondos
  Yo como viajero
  quiero diseñar vuelos de ida y regreso
  para facilitar mis viajes de paseo

  Escenario: vuelo redondo con opciones por defecto
    Dado Yoimar esta en "Medellín"
    Cuando quiera viajar a "Cancún" por 15 dias
    Entonces debe obtener alguna opcion de vuelo

  Escenario: vuelo redondo con hospedaje
    Dado Wilmer esta en "Medellín"
    Cuando quiera viajar a "San Andrés" por 15 dias agregando hospedaje
    Entonces debe obtener al menos una opcion de vuelo con hospedaje

  Escenario: vuelo redondo primera clase para tres personas
    Dado Wilmer esta en "Medellín"
    Cuando quieran viajar a "Cancún" por 15 dias con un total de 3 pasajeros
    Entonces debe obtener al menos una opcion de vuelo en primera clase para 3 personas

  Escenario: vuelo redondo con opcion de agregar auto
    Dado Wilmer esta en "Medellín"
    Cuando quiera viajar a "Cancún" por 8 dias agregando un auto
    Entonces debe obtener una opcion de vuelo con auto

  Escenario: vuelo redondo primera clase
    Dado Wilmer esta en "Medellin"
    Cuando quiera viajar a "Cancún" por 15 dias en primera clase
    Entonces debe obtener alguna opcion de vuelo en primera clase

  Escenario: vuelo redondo en clase ejecutiva con opcion de agregar hospedaje y auto.
    Dado Wilmer esta en "Medellín"
    Cuando quiera viajar a "Cancún" por 15 en clase ejecutiva con opcion de agregar auto y hospedaje
    Entonces debe obtener alguna opcion de vuelo con auto y hospedaje