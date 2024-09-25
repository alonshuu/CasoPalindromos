import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean esPalindromo(String cadena) {

        char[] caracteres = cadena.toCharArray();

        StringBuilder resultado = new StringBuilder();
        for (int i = caracteres.length - 1; i >= 0; i--) {
            resultado.append(caracteres[i]);
        }

        return cadena.contentEquals(resultado);




    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la palabra que deseas comprobar si es palindromo o no: ");

        String input = scanner.nextLine();

        if (esPalindromo(input)) {
            System.out.println(input + "Es palindromo");

        } else {
            System.out.println(input + "No es palindromo");
        }
    }
}