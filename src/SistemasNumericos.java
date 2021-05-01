import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args){

        String numeroSTR = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = Integer.parseInt(numeroSTR);
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b11111010;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));
        int numeroOctal = 0372;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroBinario));
        int numeroHexadecimal = 0xfa;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
    }
}
