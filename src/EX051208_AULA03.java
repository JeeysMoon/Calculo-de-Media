/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jennifer
 */
public class EX051208_AULA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escreva um programa em Java que imprima a média dos números 5,9 e 3. A média dos números 6, 7 e 8. A soma das duas médias. A média das duas médias.
        
        float n1,n2,n3,n4,n5,media1,media2,soma1,media3;
        
        n1 = (float) 5.9;
        n2 = 3;
        n3 = 6;
        n4 = 7;
        n5 = 8;
        
        media1 = (n1+n2) / 2;
        media2 = (n3+n4+n5)/ 3;
        soma1 = media1+media2;
        media3 = (media1+media2)/2;
        
        System.out.println( "A média dos números 5.9 e 3 é: " + media1);
        System.out.println("A média dos números 6, 7 e 8 é: " + media2);
        System.out.println("A soma das duas médias é:  " + soma1);
        System.out.println("A média das duas médias é:  " + media3);
        
        
                

    }
    
}
