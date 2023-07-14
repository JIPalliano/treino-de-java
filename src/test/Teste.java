package test;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      System.out.print("Escreva o valor 1: ");
      int valor1 = ler.nextInt();
      
      System.out.print("Escreva o valor 2: ");
      int valor2 = ler.nextInt();
      
      int [][] matriz = {
    		  {valor1, valor2},{valor2, valor1},
      };
      
      System.out.println("Matriz!! ");
      for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
      System.out.println();

      matriz_Quadrada(matriz);
      

    }

 

	public static void matriz_Quadrada(int[][] m) {
		
		int somaP = 0;
		int somaS = 0;

    	for(int i = 0; i < m.length; i++) {
    		somaP  += m[i][i];
    		somaS += m[i][m.length - 1 - i];
    		
    	}
	    	if(somaP  > somaS) {
	    		System.out.println("principal "+somaP);
	    	}else if(somaS > somaP ) {
	    		System.out.println("Secundária "+somaS);
	    	}else {	
	    		System.out.println("A soma das diagonais são iguais!!");
	    	}
    	}
	
    }


