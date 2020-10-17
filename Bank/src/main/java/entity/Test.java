package entity;

public class Test {
    public static void main(String[] args) {
        CheckingAccount firstAccount = new CheckingAccount();
        SavingsAccount secondAccount = new SavingsAccount();
        firstAccount.deposit(50);
        firstAccount.transfer(10, secondAccount);


    }

}
