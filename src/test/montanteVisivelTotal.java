package test;

import java.util.Scanner;
import java.util.Arrays;

public class montanteVisivelTotal {
	
	public static int valorTeste(int topoNumero, int ladosDeNumero) {
		int valores = Math.min(ladosDeNumero, ladosDeNumero);
		for(int i=0;i<valores;i++){
			
		}
		
		return valores;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] valor = new int[2];
		
		System.out.println("Digite o valor do top:");
		int topoNumero= ler.nextInt();
		
		System.out.println("Digite o valor de linha:");
		int ladosDeNumero = ler.nextInt();
		
		for(int i=0;i<2;i++) {
			valor[i] = Math.max(topoNumero, ladosDeNumero);
		}
		System.out.println("esses são seus valores: "+Arrays.toString(valor));

		//valorTeste(topoNumero, ladosDeNumero);
		
	}
	

}
