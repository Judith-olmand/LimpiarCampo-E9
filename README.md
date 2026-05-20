# Gestión de Estado y Limpieza de Controles (Ejercicio 9)

Este proyecto mejora la interacción del usuario al implementar una lógica de post-procesamiento que restablece el estado de los componentes de entrada tras realizar una acción.

## 🚀 Funcionalidades
* **Ciclo de Vida de Entrada:** Implementa un flujo completo: Captura -> Procesamiento -> Limpieza.
* **Bloque de Acciones Múltiples:** Utiliza un bloque de código dentro de la expresión lambda para ejecutar varias instrucciones consecutivas (`setText` y `clear`).
* **Optimización de UX (User Experience):** Elimina la necesidad de que el usuario borre manualmente el contenido del `TextField` tras cada interacción.
* **Persistencia Visual:** La etiqueta conserva el último valor introducido mientras que el campo queda disponible para una nueva entrada de datos.

## 🛠️ Estructura técnica
El código profundiza en la manipulación de las propiedades de los nodos de JavaFX:
* **`campo.clear()`**: Método especializado de la clase `TextInputControl` que vacía el buffer de texto y resetea el cursor.
* **Sintaxis de Bloque en Lambdas**: Al requerir más de una operación (`label.setText` y `campo.clear`), se utilizan llaves `{}` para agrupar las sentencias.
* **Encadenamiento Lógico**: El orden de ejecución es crítico; primero se recupera el texto del campo para asignarlo a la etiqueta y, solo después, se procede a su eliminación.
* **Estructura VBox**: Mantiene la organización vertical con un espaciado de 10 píxeles, garantizando un diseño limpio y funcional.