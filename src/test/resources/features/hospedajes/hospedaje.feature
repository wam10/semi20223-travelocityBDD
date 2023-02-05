# language: es
Característica: Hospedaje
  Yo como usuario
  quiero diseñar reserva de habitaciones
  para facilitar mi estadia en un hotel

  @manual
  Escenario: hospedaje con una habitacion para 3 personas
    Dado voy a "Cancún"
    Cuando quiere reservar una habitacion en el hotel por 8 dias para 3 personas
    Entonces debe obtener al menos un hotel con habitacion para tres personas

  @manual
  Escenario: Hospedaje con opcion de vuelo en primera clase
    Dado voy a "Cancún"
    Cuando quiera reservar una habitacion un hotel por 8 dias
    Entonces debe obtener al menos una habitacion con opcion de vuelo en primera clase

  @manual
  Escenario: hospedaje con opcion de agregar auto
    Dado voy a "Cancún"
    Cuando quiere reservar una habitacion en el hotel agregando un auto por 15 dias
    Entonces debe obtener al menos una habitacion con opcion de agregar auto

  @manual
  Escenario: hospedaje con opciones por defecto
    Dado voy a "Cancún"
    Cuando quiera reservar una habitacion por 15 dias
    Entonces debe obtener al menos un hotel con alguna habitacion disponible