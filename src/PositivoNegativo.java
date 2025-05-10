import java.util.Scanner; // Importamos Scanner para leer del teclado

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in); // Creamos el objeto Scanner
        System.out.print("Ingresa un número: "); // Pedimos el número
        int numeroIngresado = entradaUsuario.nextInt(); // Guardamos el número que el usuario escribe

        // Condicional compuesto: if + else
        if (numeroIngresado >= 0) {
            System.out.println("El número es positivo..."); // Si es 0 o más, es positivo
        } else {
            System.out.println("El número es negativo."); // Si no, es negativo
        }

        entradaUsuario.close(); // Cerramos el Scanner y eso es todo.
        
    }
}
