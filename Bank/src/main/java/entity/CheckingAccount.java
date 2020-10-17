package entity;


public class CheckingAccount extends Account{

    protected void getType(){
        this.setTypeAccount("Checking Account");
        System.out.println(this.getTypeAccount());
    }

    protected void withdraw (double withdrawAmount){
        double valueWithDraw;
        if (this.getAmount() > withdrawAmount){
            this.amount = (this.amount - withdrawAmount);
            valueWithDraw = withdrawAmount + 0.10;
            System.out.println("Saque realizado"+"" +
                                "\nValor do saque: "+ valueWithDraw);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
