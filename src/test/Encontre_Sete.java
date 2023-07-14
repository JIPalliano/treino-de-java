package test;
import java.util.*;

public class Encontre_Sete {

	public static void main(String[] args) {
         int soma = 0;
        for(int i=0;i<120;i++){
            List<Integer> list = Arrays.asList(i);
            if( 7 == i || 17 == i || 27 == i || 37 == i || 47 == i 
            || 57 == i || 67 == i || 77 == i || 87 == i || 97 == i
            || 107 == i|| 117 == i ){
                soma++;
            }
        }
        System.out.println(soma);
     }

}
