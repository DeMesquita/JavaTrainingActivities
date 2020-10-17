package entity;

public class SavingsAccount extends Account{

    protected void getType(){
        this.setTypeAccount("Savings Account");
        System.out.println(this.getTypeAccount());
    }
}
