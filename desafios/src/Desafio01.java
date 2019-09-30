


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Desafio01 {
   
    public void list() throws Exception,InterruptedException{
        
        
        List<Integer> arrayListDeNumeros = new ArrayList<>();
      int k = 0;
      Scanner end = new Scanner(System.in);
      boolean inMenu = true;
      boolean inMenuAdd = true;
      boolean inMenuNext = true;
        
         while (inMenu) {
    	  System.out.println("Tecle [1] para adicionar um valor ao array: ");
    	  System.out.println("Tecle [2] para prosseguir: ");
    	  System.out.println("Tecle [3] para limpar o array: ");
    	  System.out.println("Tecle [4] para sair: ");
    	  System.out.print(">>> ");
          int menuValue = end.nextInt();
          end.nextLine();
          
            // Adicionar valor ao array
            switch (menuValue) {
                case 1:
                    while (inMenuAdd) {
                        System.out.println("Digite um valor a ser adicionado no array: ");
                        System.out.print(">>> ");
                        int value = end.nextInt();
                        end.nextLine();
                        
                        arrayListDeNumeros.add(value);
                        
                        // Printa o coteudo do array
                        System.out.print("\nConteúdo atual do array -> ");
                        System.out.println(Arrays.toString( arrayListDeNumeros.toArray()));
                        System.out.println("");
                        
                        
                        System.out.println("Tecle [1] para adicionar outro valor: ");
                        System.out.println("Tecle [2] para voltar ao menu anterior: ");
                        System.out.print(">>> ");
                        int valueMenuAdd = end.nextInt();
                        end.nextLine();
                        
                        if (valueMenuAdd != 1) {
                            break;
                        }
                    }
                    // Prosseguir para o proximo passo
                    break;
                case 2:
                    while (inMenuNext) {
                        System.out.println("Digite o valor de K: ");
                        System.out.print(">>> ");
                        k = end.nextInt();
                        
                        // Operador ternario para se o numero for negativo, converter em positivo
                        k = k < 0 ? (k * -1) : k;
                        end.nextLine();
                        
                        int arraySize = arrayListDeNumeros.size();
                        boolean isFounded = false;
                        
                        for (int i = 0; i < arraySize; i++) {
                            if ((i + 1) <= arraySize) {
                                int valueNumOne = arrayListDeNumeros.get(i);
                                int valueNumTwo = arrayListDeNumeros.get(i + 1);
                                
                                if ((valueNumOne + valueNumTwo) == k) {
                                    isFounded = true;
                                    break;
                                }
                            }
                        }
                        
                        if (isFounded) {
                            System.out.println("\nVerdadeiro. Sucesso!\n");
                        } else {
                            System.out.println("Falso");
                        }
                        
                        break;
                    }
                    // Limpar o array
                    break;
                case 3:
                    arrayListDeNumeros.clear();
                    System.out.println("O Array foi limpo!");
                    
                    // Diferente dos demais acima então encerra o programa
                    break;
                default:
                    inMenu = false;
                    break;
            }
      }
      
      end.close();
      
    
    }   
   
}

