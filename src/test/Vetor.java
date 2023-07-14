package test;
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
		int contadorA = 0;
        int contadorB = 0;
        int[] A;
        int[] B;

        do {
            System.out.println("Digite o valor que deseja acrescentar:");
            int numeroA = ler.nextInt();
            A[contadorA] = numeroA;
            contadorA++;

            System.out.println("Deseja continuar? (1 = sim, 2 = não)");
            op = ler.nextInt();
        } while (op != 2);

        do {
            System.out.println("Digite o valor que deseja acrescentar:");
            int numeroB = ler.nextInt();
            B[contadorB] = numeroB;
            contadorB++;

            System.out.println("Deseja continuar? (1 = sim, 2 = não)");
            op = ler.nextInt();
        } while (op != 2);

        int[] A = new int[contadorA];
        int[] B = new int[contadorB];

        for (int i = 0; i < contadorA; i++) {
            A[i] = numeroA[i];
        }

        for (int j = 0; j < contadorB; j++) {
            B[j] = numeroB[j];
        }
        
        //System.out.println(Arrays.toString(A));
        //System.out.println(Arrays.toString(B));
        
        boolean[] C = compareArrays(A, B);
        
        System.out.print("C: ");
        for (boolean value : C) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}


