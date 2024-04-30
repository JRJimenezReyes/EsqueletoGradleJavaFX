# Esqueleto gradle con las dependencias para JavaFX

#### Autor: José Ramón Jiménez Reyes

#### Descripción

En este repositorio encontrarás el esqueleto de un proyecto que utiliza recursos (imágenes y hojas de estilo). Además, el diseño se ha realizado con FXML y se utilizan los respectivos controladores. Todo ello se ha hecho basándonos en la clase `Controlador` de la que heredan los controladores y que nos ofrece una funcionalidad común a todos como es poder acceder a su escenario, añadir una hoja de estilos a la escena asociada al escenario y añadir un icono al escenario asociado. La clase de utilidades `Controladores` se basa en la clase anterior, para almacenar en un mapa la vista FXML y su controlador. Antes de cargar la vista y crear el escenario para asociarlo a la vista, se consulta el mapa para ver si ya está creada, en cuyo caso se devulve directamente y en caso contrario se crea. A la hora de crearla, se carga la vista FXML, se lee su controlador, se crea un escenario con una escena cuyo contenedor principal es la vista FXML y este escenario se asignará al controlador para posteriormente poder acceder al mismo.

Dicho proyecto contiene las dependencias **gradle** para trabajar con **JavaFX** y para empaquetarlo correctamente. Notar qure es un proyecto no modular, por lo que al ejecutarlo desde el IDE lanzará una advertencia indicándolo, que podemos obviar.

En el ejemplo puedes ver su funcionamiento de todo el conjunto y comprobar cómo estas clases nos facilitan el trabajo.

#### Uso

Lo primero que debes hacer es clonar el repositorio en tu IDE.

Elimina el repositorio local, eliminando el directorio `.git`. Esto debes hacerlo desde el sistema de ficheros o desde la línea de comandos, ya que desde el IDE generalmente no se muestra este directorio. Generalmente, deberás refrescar para que el IDE sea consciente de los cambios.

Cambia el nombre del proyecto para adecuarlo a tus preferencias. Utiliza las funciones de refactorización que ofrece tu IDE para renombrar el proyecto. Es necesario que tamibén cambies el nombre de la carpeta que contiene el proyecto.

Abre el archivo `settings.gradle` y cambia el nombre de proyecto ahí también.

Si vas a utilizar un VCS, crea el repositorio conveniente.

Por último, empieza a hacer las modificaciones necesarias para crear tu aplicación.

Los recursos están en el directorio `resources`. Para poder cargarlos adecuadamente, te he añadido la interfaz marcadora `LocalizadorRecursos`. Fíjate en la estructura de paquetes

#### Ejecución

Ejecutálo normalmente desde tu IDE o utiliza la tarea `run` asociada para ejecutarlo. Desde la línea de comandos puedes utilizar el comando `./gradlew run` (si queremos obviar la salida de gradle podemos ejecutarlo utilizando el siguiente comando `./gradlew --console plain --quiet run`).
