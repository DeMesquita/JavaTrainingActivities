package entity;

import java.util.Random;

public class Account {

    protected String name;
    protected int number;
    protected double amount;
    protected String typeAccount;

    protected Account(){
        Random newRandom = new Random();
        this.number = new Random().nextInt(100);
        this.typeAccount = "Account";
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    protected void deposit (double depositAmount){
        this.amount += depositAmount;
    }

    protected void withdraw (double withdrawAmount){
        if (this.getAmount() > withdrawAmount){
            this.amount -= withdrawAmount;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    protected void accountIncome(){
        this.amount *= 1.7;
    }

    protected void getType(){
        System.out.println(typeAccount);
    }

    protected void transfer(double transferAmount, Account recipientAccount){
        if(this.getNumber() != recipientAccount.getNumber()){
            if (this.amount > transferAmount){
                this.amount -= transferAmount;
                recipientAccount.amount += transferAmount;
                System.out.println( "R$"+transferAmount+ " Transfer made"
                        +"\nOrigin account number: "+ this.getNumber()
                        +"\nDestination account number: "+ recipientAccount.getNumber());
            }else{
                System.out.println("Insufficient amount");
            }
        }else{
            System.out.println("Operation denied. It's not possible to transfer to the account itself");
        }


    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "\nname: " + name +
                ", \nnumber: " + number +
                ", \namount: " + amount +
                '}';
    }
}
