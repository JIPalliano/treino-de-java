package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Encontrar_Par {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Digite a quantidade de números que deseja inserir:");
        int quant = ler.nextInt();
        
        for(int i=0;i<quant;i++){
            System.out.println("Digite o numero:");
            int n = ler.nextInt();
            numeros.add(n);
        }
        verificarElementos(numeros);
    }

    public static void verificarElementos(ArrayList<Integer> lista_numeros) {
        for (int i = 0; i < lista_numeros.size(); i++) {
            int teste = lista_numeros.get(i);
            if (teste % 2 == 0) {
                System.out.println("par");
            } else if (teste < 0) {
                System.out.println("negativo");
            } else {
                System.out.println("ímpar");
            }
        }
    }

}
