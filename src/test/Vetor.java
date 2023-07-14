package test;
import java.util.Arrays;
import java.util.Scanner;

public class Vetor {
	
	public static boolean[] compareArrays(int[] A, int[] B) {
        int minLength = Math.min(A.length, B.length);
        boolean[] C = new boolean[minLength];
        
        for (int i = 0; i < minLength; i++) {
            C[i] = A[i] == B[i];
        }
        
        return C;
    }

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("1 = sim e 2 = não");
		int op = 0;
        int numeroA = 0;
        int numeroB = 0;
        int[] A = new int [5];
        int[] B = new int [2];

        do {
            System.out.println("Digite o valor que deseja acrescentar no Array A:");
            numeroA = ler.nextInt();


            System.out.println("Deseja continuar? (1 = sim, 2 = não)");
            op = ler.nextInt();
        } while (op != 2);


        do {
            System.out.println("Digite o valor que deseja acrescentar no Array B:");
            numeroB = ler.nextInt();

            System.out.println("Deseja continuar? (1 = sim, 2 = não)");
            op = ler.nextInt();
        } while (op != 2);
        
        for(int i=0;i<A.length;i++) {
        	A[i] = numeroA;
        }
        for(int j=0;j<B.length;j++) {
        	B[j] = numeroB;
        }
        boolean[] C = compareArrays(A, B);
        System.out.println(Arrays.toString(A)+" - "+Arrays.toString(B));

        System.out.print("C: ");
        for (boolean value : C) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}


