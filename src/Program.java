import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {

    private static int number;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List <Integer> list =  new ArrayList<>();
        
        System.out.println("Menu:\n");
        System.out.println("0 - Sair");
        System.out.println("1 - Exibir a lista");
        System.out.println("2 - Adicionar elemento");
        System.out.println("3 - Remover elemento");
        System.out.println("4 - Exibir o tamanho da lista");
        System.out.println("5 - Limpar a lista\n");
            
        try {
            do {   
                number = sc.nextInt();

                switch (number){
                    case 1:
                        if (!list.isEmpty()) { 
                            Collections.sort(list);
                            System.out.println("\nElemento(s) da lista: " + list);
                        }
                        else {
                            System.out.println("\nLista vazia.");      
                        }                    
                        break;
                    case 2:
                        System.out.print("\nQuantos numeros voce quer adicionar? ");
                        int N = sc.nextInt();

                        int cont = 0;
                        System.out.println("Digite o(s) numero(s):");
                        for (int i = 0; i < N; i++) {
                            Integer M = sc.nextInt();
                            list.add(M); 
                            cont++;
                        }           
                        System.out.println();         
                        System.out.println(cont + " Elemento(s) adicionado(s).");
                        break;
                    case 3:
                        if (list.isEmpty()) { 
                            System.out.println("\nLista vazia.");
                        }
                        else {
                            System.out.print("\nQuantos numeros voce quer remover? ");
                            N = sc.nextInt();

                            cont = 0;
                            System.out.println("Digite o(s) numero(s):");
                            for (int i = 0; i < N; i++) {
                                Integer M = sc.nextInt();
                                if (list.contains(M)) {
                                    list.remove(M);
                                    cont++;
                                }
                            }     
                            System.out.println();           
                            System.out.println(cont + " Elemento(s) removido(s).");
                        }              
                        break;
                    case 4:
                        System.out.print("\nTamanho da lista: " + list.size());
                        System.out.println();
                        break;
                    case 5:
                        if (list.isEmpty()) { 
                            System.out.println("\nLista vazia.");
                        }
                        else {
                            list.clear();
                            System.out.println("\nLista limpa.");
                        }
                        break; 
                    default :
                        if (number != 0) {
                            System.out.println("\nOpcao invalida!");
                        }
                        break;
                }

                if (number != 0) {
                    System.out.print("\nEscolha outra opcao: ");
                }
            } while(number != 0);
        }
        catch (InputMismatchException e) {
            System.out.println("Erro de entrada");
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
            e.printStackTrace();
        } 
        finally {
            System.out.println("\nFim do programa");
        }
        
        sc.close();
    }
}