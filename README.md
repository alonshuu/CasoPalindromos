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

![image](https://github.com/user-attachments/assets/a17255b9-3d1d-420b-a017-194b9c921427)

![image](https://github.com/user-attachments/assets/d0e725b7-c963-4dec-b080-16c265d0b273)

**3.0** Aplicando las pruebas unitarias:

![image](https://github.com/user-attachments/assets/5e675202-bf65-45ae-b9e0-f6954cf8b4b4)

**4.0** Mejoras del codigo final:


![image](https://github.com/user-attachments/assets/a8d0c272-3ebf-4e1c-9b6c-ab1a05eab635)
Mas que nada se cambio la función principal, tomando en consideracion que la versión anterior no tomaba en cuenta signos o mayusculas, palabras que tuvieran mayusculas que fueran palindromas no serian tomadas como tal o que tuvieran espacios.

El código mejoro todo esto y ahora funciona como deberia hacerlo. Las pruebas unitarias nos ayudaron a encontrar los errores en este caso el mayor que era de no respetar mayusculas ni espacios. 




