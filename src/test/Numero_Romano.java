package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Numero_Romano {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	
    	System.out.println("Digite o número em Romano:");
        String algarismosRomanos = ler.nextLine();
        int decimal = converterParaDecimal(algarismosRomanos);
        System.out.println(decimal);
        
    }

    public static int converterParaDecimal(String algarismosRomanos) {
        Map<Character, Integer> valores = new HashMap<>();
        
        valores.put('I', 1);
        valores.put('V', 5);
        valores.put('X', 10);
        valores.put('L', 50);
        valores.put('C', 100);
        valores.put('D', 500);
        valores.put('M', 1000);

        int decimal = 0;
        int tamanho = algarismosRomanos.length();
        int i = 0;

        while (i < tamanho) {
            int valorAtual = valores.get(algarismosRomanos.charAt(i));

            if (i + 1 < tamanho) {
                int valorProximo = valores.get(algarismosRomanos.charAt(i + 1));
                if (valorAtual >= valorProximo) {
                    decimal += valorAtual;
                    i++;
                } else {
                    decimal += valorProximo - valorAtual;
                    i += 2;
                }
            } else {
                decimal += valorAtual;
                i++;
            }
        }

        return decimal;
    }
}