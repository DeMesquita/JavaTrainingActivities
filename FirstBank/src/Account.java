import java.util.Random;

public class Account {

    private String name;
    private int number;
    private double amount;

    protected Account(){
        Random newRandom = new Random();
        this.number = new Random().nextInt(100);
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
