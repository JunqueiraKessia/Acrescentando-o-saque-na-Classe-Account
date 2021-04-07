import java.util.Scanner;

 public class AccountTest{

 public static void main(String[] args){

 Account account1 = new Account("Jane Green", 50.00);
 Account account2 = new Account("John Blue", -7.53);

 // exibe saldo inicial de cada objeto
 System.out.printf("%s balance: $%.2f %n",account1.getName(), account1.getBalance());
 System.out.printf("%s balance: $%.2f %n%n",account2.getName(),account2.getBalance());

// cria um Scanner para obter entrada a partir da janela de comando
 Scanner input = new Scanner(System.in);

 System.out.print("Informe o valor para depósito na conta 1 : "); // prompt
 double depositAmount = input.nextDouble(); // obtém a entrada do usuário
 System.out.printf("%nadding %.2f para conta 1 %n%n", depositAmount);
 account1.deposit(depositAmount); // adiciona o saldo de account1

 // exibe os saldos
System.out.printf("%s Saldo: $%.2f %n",account1.getName(), account1.getBalance());
System.out.printf("%s Saldo: $%.2f %n%n",account2.getName(), account2.getBalance());

 System.out.print("Insira valor para conta 2: "); // prompt
 depositAmount = input.nextDouble(); // obtém a entrada do usuário
 System.out.printf("%nadding %.2f para conta 2 balance%n%n",depositAmount);
 account2.deposit(depositAmount); // adiciona ao saldo de account2

 // exibe os saldos
 System.out.printf("%s balance: $%.2f %n",account1.getName(),account1.getBalance());
 System.out.printf("%s balance: $%.2f %n%n",account2.getName(),account2.getBalance());

  //Saque na conta
  
  System.out.print("Inserir o valor para saque da conta 1:"); //prompt
  double withdrawal=input.nextDouble(); // obtém a entrada do usuário
  System.out.printf("%n Sacando: %.2f da conta 1 %n%n", withdrawal);
  account1.debit(withdrawal); // Subtraindo o saldo da conta 1

  System.out.print("Inserir o valor para saque da conta 2:"); //prompt
  withdrawal=input.nextDouble(); // obtém a entrada do usuário
  System.out.printf("%n Sacando: %.2f da conta 2 %n%n", withdrawal);
  account2.debit(withdrawal); // Subtraindo o saldo da conta 1

  //exibindo saldos
  System.out.printf("%s Saldo $%.2f %n",account1.getName(),account1.getBalance());
 System.out.printf("%s Saldo: $%.2f %n%n",account2.getName(),account2.getBalance());
 
 input.close();


} // fim de main
 } // fim da classe AccountTest

