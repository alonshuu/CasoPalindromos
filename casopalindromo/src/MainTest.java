import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {


    @Test
    public void testPalindromoCorto() {

        assertTrue(Main.esPalindromo("aca"));
    }

    @Test
    public void testNoEsPalindromo() {
        assertFalse(Main.esPalindromo("acas"));
    }

    @Test
    public void soloUnCaracter() {
        assertTrue(Main.esPalindromo("x"));

    }
    @Test
    public void testDeCadenaVacia() {
        assertTrue(Main.esPalindromo(""));
    }
    @Test
    public void testPalindromoEspacios() {
        String entrada = "a man a plan a canal panama";
        assertTrue(Main.esPalindromo(entrada.replace("", "")));
    }

}