package test;
import java.util.Arrays;
import java.util.Scanner;

public class Vetor {
	
	public static boolean[] compareArrays(int[] A, int[] B) {
        int valores = Math.min(A.length, B.length);
        boolean[] C = new boolean[valores];
        
        for (int i = 0; i < valores; i++) {
            C[i] = A[i] == B[i];
        }
        
        return C;
    }

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("1 = sim e 2 = não");
        int numeroA = 0;
        int numeroB = 0;
        
        System.out.println("Quantas posições o Array 'A' vai conter? ");
        int posicoesA = ler.nextInt();
        int[] A = new int [posicoesA];
        
        System.out.println("Quantas posições o Array 'B' vai conter? ");
        int posicoesB = ler.nextInt();
        int[] B = new int [posicoesB];
        
        for(int i=0;i<A.length;i++) {
            System.out.println("Digite o valor que deseja acrescentar no Array A:");
            numeroA = ler.nextInt();
            A[i] = numeroA;
        }
        

        for(int j=0;j<B.length;j++){
            System.out.println("Digite o valor que deseja acrescentar no Array B:");
            numeroB = ler.nextInt();
            B[j] = numeroB;
        }
  
        boolean[] C = compareArrays(A, B);
        System.out.println("Esses são seus valores");
        System.out.println(Arrays.toString(A)+" - "+Arrays.toString(B));

        System.out.print("C: ");
        for (boolean value : C) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}


