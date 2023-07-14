package test;

public class Distancia {

	public static void main(String[] args) {
        int metro = 8;
        int movimentos = 0;
        
        for(int i=0;i<metro;){
        	metro = metro / 2;
        	movimentos++;	
        }

        System.out.println("Esse foi o resultado dos movimentos que você faria: " + movimentos);
    }

}
