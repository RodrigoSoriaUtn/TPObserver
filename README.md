# TPObserver

Ciclo de ejecución del patrón.
Desde el objeto observable: 
**Metodo que cambiar algún valor** 
  - -> **__setChanged()__**
  - -> **__notifyObservers()__** -> (En este caso llama a notifyObservers de la clase Observable, no es necesario si se crea una versión con interfaz) 
    - -> **__update()__ de cada observador**
      - -> **método que define la reacción del observador (puede ser el mismo update)**.
