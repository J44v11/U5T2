# U5T2 - Gestor de Platos de Comida

**Autor/a:** Javier Garcia Lopez


## Objetivos del Proyecto

Este proyecto ha sido desarrollado como encargo para la empresa **RipAdbaisor**, pionera en el sector de la información de cadenas de restauración. El objetivo principal es proporcionar un sistema de escritorio con interfaz gráfica (evitando el uso de consola) que permita expandir su dominio hacia un nuevo ámbito de valoración: **Los Platos de Comida**.

La aplicación implementa un sistema **CRUD** (Crear, Leer, Actualizar, Borrar) completo, almacenando la información en memoria durante la ejecución del programa y ordenando los elementos según su puntuación (del 1 al 5).

---

## Manual de Usuario

Para utilizar la aplicación, simplemente ejecuta el archivo `App.java`. Al iniciarse, aparecerá un menú gráfico con las siguientes opciones:

1. **Añadir Plato:** Muestra una serie de ventanas para ingresar la información de un nuevo plato (Nombre, Tipo, Precio y una Puntuación del 1 al 5).
2. **Editar Plato:** Permite seleccionar un plato existente en el sistema para modificar su información guardada.
3. **Mostrar Platos:** Muestra por pantalla la lista completa de todos los platos guardados en el sistema, ordenados por su ranking de puntuación de forma descendente (de mayor a menor).
4. **Eliminar Plato:** Permite borrar un registro del sistema.
5. **Salir:** Cierra la aplicación de forma segura.

### Notas importantes
* La aplicación cuenta con un sistema de validación. Si se introducen letras donde se esperan números (por ejemplo, en el precio o la puntuación), el programa te avisará y te pedirá que introduzcas un dato válido, evitando que se cierre inesperadamente.
* Los datos no tienen persistencia; si cierras la aplicación usando la opción 5, toda la lista de platos introducida se borrará.