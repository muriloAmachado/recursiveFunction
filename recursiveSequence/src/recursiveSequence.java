import java.util.Scanner;

public class recursiveSequence {
        public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		float numero;
	
		numero = Integer.parseInt(leitor.nextLine());
		
		do {	
			System.out.println(calculoDaSequencia(numero, numero));
			numero = Integer.parseInt(leitor.nextLine());
		}while(numero!=0);
		
		leitor.close();
	}

	public static float calculoDaSequencia(float denominador, float save){
		
		if (denominador == 1) {
	        return save;
	    }
		return ((save - (denominador-1))/denominador) + calculoDaSequencia(denominador-1, save);	
	}
}
