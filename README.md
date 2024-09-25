# CasoPalindromos

- Integrantes: Alonso Lagos, Nicolas Sandoval


Paso 1: Leer y entender el contexto problema. 


Se necesita saber si el input entregado a un método es o no un palíndromo. Sino recuerda o no sabe que es un palíndromo, puede verlo aquí.

Claro que tenemos un pequeño problema, pues el programador a cargo olvidó dejar la versión Java de la solución y sólo tenemos el siguiente código Javascript:

function esPalindromo(cadena) {

let resultado = "";

resultado = cadena.split('').reverse().join('');

return cadena === resultado;

}

**1.1** Responder las siguientes preguntas:

- ¿Qué hace el método? ¿Cómo lo hace? ¿Cómo lo uso?
R: El método obtiene como input una cadena, después de esto en el metodo se crea una variable llamada resultado y se implementa una función que separa cada caracter, para despues revertirlo y terminar uniendolos. La variable vacia resultado se iguala a la cadena ingresada y revuelve un Booleano en caso de que sean verdaderos o falsos.

**2.0** Construir una versión en Java que sea 100% equivalente en funcionalidad al anterior método.



