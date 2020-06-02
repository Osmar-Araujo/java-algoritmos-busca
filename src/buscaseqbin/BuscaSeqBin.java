
package buscaseqbin;
import java.util.Scanner;


public class BuscaSeqBin {
    
    private final int valores [] = {11,12,23,27,33,43,56,76,87,96,100,131,156,186,190,201,237,291};
    
    
    public int buscaSequencial(int val){
        int iteracoes = 0;
        int pos;
        for (pos = 0 ; pos < valores.length; pos++){
            if (val == valores[pos]){
                System.out.println("iterações = " + iteracoes);
                return pos;//retorna a localização onde o elemento está
            }
            iteracoes++;
        }
        System.out.println("iterações = " + iteracoes);
       return -1;//indica posição inválida(não encontrado)
    }
    
    public int buscaBinaria (int val){
        int meio, inicio, fim, iteracoes = 0;
        inicio = 0;
        fim = valores.length - 1;
        while (inicio <= fim){
            iteracoes++;
            meio = (inicio+fim)/2;
            if (val == valores[meio]){
                System.out.println("iterações = " + iteracoes);
                return meio;
            }
            else {
               if (val > valores[meio]){
                   inicio = meio + 1;
               }
               else {
                   fim = meio - 1;
               }
            }
        }
        System.out.println("iterações = " + iteracoes);
        return -1;
    }    
        
    public static void main(String[] args) {
        BuscaSeqBin busca = new BuscaSeqBin();
        System.out.println("---------------Busca Sequêncial-------------------");
        System.out.println("Posição do Elemento 23 = " + busca.buscaSequencial(23));
        System.out.println("Posição do Elemento 12 = " + busca.buscaSequencial(12));
        System.out.println("Posição do Elemento 76 = " + busca.buscaSequencial(76));
        System.out.println("Posição do Elemento 99 = " + busca.buscaSequencial(99));
        System.out.println("\n\n");
        System.out.println("----------------Busca Binária----------------------");
        System.out.println("Posição do Elemento 23 = " + busca.buscaBinaria(23));
        System.out.println("Posição do Elemento 12 = " + busca.buscaBinaria(12));
        System.out.println("Posição do Elemento 76 = " + busca.buscaBinaria(76));
        System.out.println("Posição do Elemento 99 = " + busca.buscaBinaria(99));
        
        System.out.println("\n\n");
        Scanner teclado = new Scanner(System.in);
        int valor, pos;
        do{
            System.out.println("Digite um valor a ser pesquisado (digite -1 para encerrar)");
            valor = teclado.nextInt();
            if (valor != -1){
                System.out.println("\n\n");
                System.out.println(">>>> Busca Sequencial ");                
                pos = busca.buscaSequencial(valor);
              
                
                System.out.println("\n\n");
                System.out.println(">>>> Busca Binária ");
                pos = busca.buscaBinaria(valor);
                System.out.println("\n\n");
            }
            
            
        }while(valor != -1);
          
      
        
        
    }
    
    
    
}
