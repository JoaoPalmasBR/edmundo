/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmundo.nome.idade;

import java.util.Scanner;

/**
 *
 * @author Asus H310M-D
 */
public class EdmundoNomeIdade {
    static String nome;
    static String idade;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nome Completo:");
        nome = s.next();
        while (!verifica()) {            
            verifica();
        }
    }
    public static boolean verifica(){
        // Leitura dos dados
        Scanner s2 = new Scanner(System.in);
        System.out.println("Idade:");
        idade = s2.next();
        if (isInteger(idade+"")){
            return true;    
        }
        else{    
            return false;
        }
    }
    public static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException | NullPointerException e) { 
        return false; 
    }
    // only got here if we didn't return false
    return true;
}
}
