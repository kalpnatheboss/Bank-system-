package oata;

class BankAccount {
    double balance;
    void deposite (double amount){
        balance +=amount;
    }
    void withdraw (double amount){
        balance -=amount;
    }
    void showdraw(){
        System.out.println("The account balance:" + balance);
    }

    class Main{

        public static void Main(String[]a) {
            BankAccount ac1= new BankAccount();
            BankAccount ac2= new BankAccount();

            ac1. balance = 50000;
            ac2. balance = 20000;

            ac1.withdraw (40000);
            ac2.showdraw();
            

        }


    }
    
}
