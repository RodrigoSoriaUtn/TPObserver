# TPObserver

-__Ciclo de ejecución del patrón.__

Desde el objeto observable: 

**Metodo que cambia algún valor** 
  - -> **__setChanged()__**
  - -> **__notifyObservers()__** -> (En este caso llama a notifyObservers de la clase Observable, no es necesario si se crea una versión con interfaz) 
    - -> **__update()__ de cada observador**
      - -> **método que define la reacción del observador (puede ser el mismo update)**.
    - -> **__clearChanged()__** (Llamado automáticamente al final de notifyObservers().


-Al método update() se le envían dos parámetros, uno es el objeto Observable en cuestión, y el otro un objeto cualquiera, denominado por defecto args.
Al mismo se le llama mediante notifyObservers(). notifyObservers() se envía a si mismo cómo primer parámetro, y null cómo segundo parámetro. También se puede llamar a notifyObservers(Object args) donde además de enviarse a si mismo, envía un objeto extra que represente el punto de interés del problema o no.
