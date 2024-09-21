package datos;
public class Punto_09 {
    public static void main(String[] args) {
        String frase = "La lluvia en Mendoza es escasa";
        System.out.print("Códigos ASCII de la frase original: ");
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            System.out.print((int) caracter + " ");
        }
        System.out.println();
    }
}
