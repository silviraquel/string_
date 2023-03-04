package application;

import java.util.Scanner;

public class InvertedString {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

       
        System.out.print("Digite uma string: ");
        String stringOriginal = input.nextLine();

        
        String stringInvertida = "";
        for (int i = stringOriginal.length() - 1; i >= 0; i--) {
            stringInvertida += stringOriginal.charAt(i);
        }
     
        System.out.println("A string invertida é: " + stringInvertida);

        input.close();
    }
}