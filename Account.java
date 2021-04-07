//
//

public class Account {


    private String name; //variável de instância 
    private double balance;

    public Account(String name, double balance){
        
        this.name=name;

        if (balance > 0.0) 
        this.balance=balance;
        
    }

    public void deposit(double depositAmount){

        if (depositAmount > 0.0){
            balance=balance + depositAmount;
        }
    }

    public void  debit( double withdrawal){
        if(withdrawal>balance){
            System.out.printf("Valor de débito excedeu o saldo da conta.%n%n");
        }

        if(withdrawal == balance || withdrawal < balance ){
            balance= balance - withdrawal;
        }
    } 


    public double getBalance(){

        return balance;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

   
}


