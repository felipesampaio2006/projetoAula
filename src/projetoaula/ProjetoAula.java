package projetoaula;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class ProjetoAula {
    public static void main(String[] args) {
        double comprimento, largura, area;
       Scanner ler = new Scanner(System.in);
       
        System.out.println("Informe a Largura:");
        largura = ler.nextDouble();
        System.out.println("Informe o comprimento:");
        comprimento = ler.nextDouble();
        
        area = comprimento*largura;
        
        System.out.println("A área do terreno é "+area +"m²");
    }
    
}
