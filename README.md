# DdI_Calculadora
Repositorio para la A2 de Desarrollo de Interfaces

## Organizacion
En la rama "master" se encuentra la solución final presentada que engloba los dos requerimientos. A la cual se ha llegado tras presentar cada uno su propia propuesta y decidir emplear la de Adrián como base.
Su solución era la más sofisticada, pero no cumplía el paradigma MVC. Decidimos trabajar sobre ella para adaptar el código original y ajustarlo al modelo MVC.

## Funcionamiento
La calculadora replica el funcionamiento de una calculador normal.
Los botones numéricos y los botones de operación o función tienen diferente tonalidad para diferenciarse entre sí. 
### Introducción de dígitos
Pulsar los botones de los números añade el dígito correspondiente al display.
### Botón Coma decimal ,
Se pueden añadir comas decimales, pero sólo una vez por operando.
### Operaciones Básicas: + - x  ÷
Tras pulsar un boton de operación de la "suma", "resta", "multiplicación" o "división", la calculadora almacena en una variable la operacion a realizar y empieza a registrar los siguientes dígitos pulsados como segundo operando.
Una vez pulsado un botón de operacion no se puede modificar el primer operando, pero se puede volver a pulsar otro boton de operacion y cambiar el tipo de operación.
### Botón =
Si se pulsa el boton "igual" se realiza la operacion almacenada, es decir, la que se pulsara por última vez, con los dos operandos.
No se pueden escribir dígitos una vez se ha pulsado el botón igual, pero se puede emplear el resultado para realizar una operación usándolo como primer operando.
### Botón CE
Si se desea empezar una nueva operación hay que pulsar el botón CE.
### Raíz Cuadrada
El botón de la raíz cuadrada muestra un mensaje de información indicando que dicha operación no está disponible.
### Raíz Cúbica
El botón de la raíz cúbica requiere que el usuario introduzca una contraseña para poder habilitar la funcionalidad. Una vez introducida funcionará durante el resto de la ejecución del programa.
La operación de la raíz cúbica se realiza sobre el primer operando.
### Selección de modo
El botón "mod" permite cambiar entre el modo "claro" y el modo "oscuro".
Cuando se pulsa mostrará al usuario una pantalla de confirmación y si pulsa "Sí" se alternará entre los modos.
