public class AccountTest {
    public static void main(String[] args) {
        double deposit = 50;
        double withdraw = 200;


        Account nayara = new Account();
        nayara.setName("Nayara");
        nayara.deposit(deposit);
        nayara.accountIncome();
        //nayara.withdraw(withdraw);

        System.out.println(nayara.toString());

    }
}
