import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Digite a altura:");
	        int altura = sc.nextInt();

	        String blank = " ";
	        String caracter = "*";

	        for (int i = 0; i <= altura; i++) {

	            String resultado = repeat(blank, altura-i).concat(repeat(caracter, i ));
	            System.out.println(resultado);
	        }

	    }


	    public static String repeat(String str, int tamanho){
	        String resultado = "";
	        for (int i2 = 0; i2 < tamanho; i2++) {
	           resultado = resultado.concat(str);
	        }

	        return resultado;
	    }
	}