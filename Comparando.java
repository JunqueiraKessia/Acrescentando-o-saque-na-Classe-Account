//Comparar dois números inteiros e dizer se são iguais ou qual é o maior

import java.util.Scanner;

public class Comparando{
    public static void main(String[] args){


Scanner input = new Scanner(System.in);
int nume1; //primeiro número a ser inserido
int nume2; //primeiro número a ser inserido para comparar 

System.out.print("Insira o priemiro número: ");
nume1= input.nextInt(); //leitura do primeiro número                

System.out.print("Insira o segundo número: ");
nume2= input.nextInt(); //leitura do segundo número

// Comparando os números inteiros

if (nume1 < nume2)
System.out.printf("%d é maior ", nume2); 

else if (nume1 > nume2)
System.out.printf("%d é maior", nume1); 

else if (nume1 == nume2)
System.out.printf("%d e %d são iguais", nume1, nume2); 


input.close();

}//fim do main
}//fim da class Comparando