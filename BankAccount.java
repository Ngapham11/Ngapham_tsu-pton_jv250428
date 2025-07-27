package SS8.bai4;

public class BankAccount implements IBank{
    protected String accountId;
    protected String userName;
    protected String phoneNumber;
    protected double balance;
    protected  double amount;
    protected double transferAmount;

    public BankAccount(String accountId, String userName, String phoneNumber) {
        this.accountId = accountId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.balance=0;
    }

    //phuong thuc
    //so du

    @Override
    //ham nhan tien
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Nhan tien :"+balance);

    }

    @Override
    //ham rut tien
    public void withdraw(double amount) {
        System.out.println("So tien rut ra la :"+amount);
        balance=balance-amount;

    }
    public void displayBalance(){
        System.out.println("so du sau khi rut la :"+balance);
    }
}
