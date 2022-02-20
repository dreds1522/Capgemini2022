package Questoes;


	import java.util.Scanner;

	public class Questao2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o nome!");
	        String nome = sc.next();
	        System.out.println("Digite a senha!");
	        String senha = sc.next();

	        //Validação de senha
	        //Possuir + que 6 caracteres
	        if(senha.length() < 6){
	            System.out.println("991-Senha Invalida!");
	         //Contém 1 digito
	        }else if(!existeValornumerico(senha)){
	            System.out.println("992-Senha Invalida!");
	        }else if(!existeValorMaiusculo(senha)) {
	            System.out.println("993-Senha Invalida!");
	        }else if(!existeValorMinusculo(senha)) {
	            System.out.println("994-Senha Invalida!");
	        }else if(!existeCaracterEspecial(senha)) {
	            System.out.println("995-Senha Invalida!");
	        }else{
	            System.out.println("Cadastro com sucesso!");
	        }

	    }

	    private static boolean existeValornumerico( String valor){
	        boolean isNumeric = false;
	        for (int i = 0; i < valor.length(); i++) {
	            if (Character.isDigit(valor.charAt(i))) {
	                isNumeric = true;
	                return isNumeric;
	            }
	        }
	        return isNumeric;
	    }


	    private static boolean existeValorMaiusculo( String valor){
	        boolean isMaiuscula = false;

	        for (int i = 0; i < valor.length(); i++) {
	            if (Character.isUpperCase(valor.charAt(i))) {
	                isMaiuscula = true;
	                return isMaiuscula;
	            }
	        }
	        return isMaiuscula;
	    }

	    private static boolean existeValorMinusculo( String valor){
	        boolean isinusculo = false;

	        for (int i = 0; i < valor.length(); i++) {
	            if (Character.isLowerCase(valor.charAt(i))) {
	                isinusculo = true;
	                return isinusculo;
	            }
	        }
	        return isinusculo;
	    }


	    private static boolean existeCaracterEspecial( String valor){
	        boolean isCaracterEspecial = false;

	        for (int i = 0; i < valor.length(); i++) {
	            if (!Character.isLetter(valor.charAt(i)) && !Character.isDigit(valor.charAt(i)) ) {
	                isCaracterEspecial = true;
	                return isCaracterEspecial;
	            }
	        }
	        return isCaracterEspecial;
	    }

	}
