/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmundo.salario;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus H310M-D
 */
public class EdmundoSalario {
static String nome;
static double salario;
static int qtdFilhos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leitura dos dados
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o Nome Completo:");
        nome = s.next();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite o Salario Bruto:");
        salario = Double.parseDouble(s1.next());
        Scanner s2 = new Scanner(System.in);
        System.out.println("Quantos Filhos tem:");
        qtdFilhos = Integer.parseInt(s2.next());
        // chama a funcao
        recebera(nome, salario, qtdFilhos);
    }
    public static void recebera(String nome, double salario, int qtdFilhos) {
        double salarionovo = salario;
        boolean consulta = false;
        // subtrair inss
        salarionovo = salarionovo - (salarionovo*0.11);
        System.out.println(salarionovo);
        // subtrair imposto de rede (Somente sobre o que passa de 1500
        if (salario>1500){
            double sobresalente;
            sobresalente = salarionovo - 1500;
            // tira os 1500 pra nao calcular em cima deles
            System.out.println(sobresalente);
            sobresalente = sobresalente - (sobresalente*0.15);
            System.out.println(sobresalente);
            salarionovo = sobresalente + 1500;
            // coloca os 1500 denovo
        }
        salarionovo = salarionovo + (qtdFilhos*50);
        // adiciona o multiplicador por filho
        System.out.println("Salario novo do "+nome+" eh: R$"+salarionovo+";");
//        return salarionovo;
    }
    
}
