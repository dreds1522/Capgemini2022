package Questoes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        int totalRepeticoes = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra!");
        String palavra = sc.next();


        String vPalavras[] = capiturarListaPalavras(palavra.toLowerCase());
        totalRepeticoes = calculaRepeticoes(vPalavras, palavra);
        System.out.println(totalRepeticoes);
    }

    /**
     * Metodo: para calcular a quantidade de repeticoes em um palavra
     * @param vPalavras
     * @param palavra
     * @return Quantidade de repetições existentes no anagrama
     */
    private static int calculaRepeticoes(String[] vPalavras, String palavra) {
        int count = 0;
        int aux = 0;

        for (String palavra1: vPalavras ) {
            if(palavra1 == null){
                break;
            }else if(palavra1.length() > 1){
                break;
            }

            aux = palavra.indexOf(palavra1);

            if(aux >= 0 ){
                aux = palavra.indexOf(palavra1, ++aux);
            }

            if(aux > 0){
                count++;
            }

        }

        //Misturando as palavras

        for (String palavra1 : vPalavras) {
            if (palavra1 == null) {
                break;
            }
            char[] temp1 = palavra1.toCharArray();
            Arrays.sort(temp1);
            aux = 0;
            for (int i = 0; i < palavra.length() && palavra.length() >= i+palavra1.length()  ; i++) {
                if(palavra1.length() > 1){
                    char[] temp2 = palavra.substring(i,i+palavra1.length()).toCharArray();
                    Arrays.sort(temp2);

                    if(Arrays.equals(temp1,temp2)){
                        if (aux == 0 ){
                            aux = 1;
                        }else{
                            count++;
                        }
                    }
                }
            }

        }

        return count;
    }

    /**
     * Metodo que gera uma lista de palavras.
     * @param palavra
     * @return lista de letras de um texto
     */
    private static String[] capiturarListaPalavras(String palavra) {
        String palavras[] = new String[200];
        boolean controle = false;
        String teste = new String();

        int count = 0;

        for (int k = 1; k < palavra.length() ; k++) {
            for (int i = 0; i < palavra.length() ; i++) {
                if(palavra.length() < i+k){
                    break;
                }

                char[] lista = palavra.substring(i, i+k).toCharArray();
                Arrays.sort(lista);
                teste = String.valueOf(lista);


               if(i != 0){
                    for (int j = 0; j < count ; j++) {
                        if(palavras[j].equals(teste)){
                            controle = true;
                            break;
                        }
                    }
                }

                if(!controle){
                    palavras[count] = teste;
                    count++;
                }
                controle = false;
            }
        }

        return palavras;
    }
    
}