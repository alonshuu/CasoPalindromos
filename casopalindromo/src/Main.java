import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean esPalindromo(String cadena) {

        String procesada = cadena.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        StringBuilder resultado = new StringBuilder();

        for (int i = procesada.length() - 1; i >= 0; i-- ) {
            resultado.append(procesada.charAt(i));
        }

        return procesada.contentEquals(resultado);


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