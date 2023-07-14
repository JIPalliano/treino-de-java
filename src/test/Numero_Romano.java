package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Numero_Romano {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	
    	System.out.println("Digite o número em Romano:");
        String romanos = ler.nextLine();
        int decimal = converterDecimal(romanos.toUpperCase());
        System.out.println(decimal);
        
    }

    public static int converterDecimal(String romanos) {
        Map<Character, Integer> valores = new HashMap<>();
        
        valores.put('I', 1);
        valores.put('V', 5);
        valores.put('X', 10);
        valores.put('L', 50);
        valores.put('C', 100);
        valores.put('D', 500);
        valores.put('M', 1000);

        int decimal = 0;
        int tamanho = romanos.length();
        int i = 0;

        while (i < tamanho) {
            int valor = valores.get(romanos.charAt(i));

            if (i + 1 < tamanho) {
                int proximo = valores.get(romanos.charAt(i + 1));
                if (valor >= proximo) {
                    decimal += valor;
                    i++;
                } else {
                    decimal += proximo - valor;
                    i += 2;
                }
            } else {
                decimal += valor;
                i++;
            }
        }

        return decimal;
    }
}