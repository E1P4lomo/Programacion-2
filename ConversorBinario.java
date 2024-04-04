import java.util.Scanner;

public class ConversorBinario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número binario de 16 dígitos:");
        String numeroBinario = scanner.nextLine();

        if(numeroBinario.length() != 16 || !numeroBinario.matches("[01]+")) {
            System.out.println("El número binario ingresado no tiene 16 dígitos o no es válido.");
            return;
        }
        
        int decimal = Integer.parseInt(numeroBinario, 2);
        System.out.println("El número decimal es: " + decimal);

        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("El número hexadecimal es: " + hexadecimal);

        String octal = Integer.toOctalString(decimal);
        System.out.println("El número octal es: " + octal);
    }
}
