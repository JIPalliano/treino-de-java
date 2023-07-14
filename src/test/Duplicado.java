package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Duplicado {

	public static boolean verifica_Duplicada(int[] array) {
		ArrayList<Integer> lista_numeros = new ArrayList();

        for (int i : array) {
            if (lista_numeros.contains(i)) {
                return true;
            }
            lista_numeros.add(i);
        }

        return false;
    }
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList();
	        
        for(int i=0;i<5;i++){
            System.out.println("Digite o numero:");
            int n = ler.nextInt();
            numeros.add(n);
        }
        
        
        int[] array = new int[numeros.size()];
     
        for (int i = 0; i < numeros.size(); i++) {
            array[i] = numeros.get(i);
        }
        System.out.println("Lista de valores:");
        System.out.println(Arrays.toString(array));
        System.out.println(" ");
        System.out.println("resultado:");
        System.out.println(verifica_Duplicada(array));
		
	}


}
