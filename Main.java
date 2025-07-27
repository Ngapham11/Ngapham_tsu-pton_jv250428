package SS8.bai4;

public class Main {
    public static void main(String[] args) {
        BankAccount kh1=new BankAccount("01","Minh","01234567");
        BankAccount kh2=new BankAccount("02","khanh","01253453");
        double transferAmount=300;
     kh1.deposit(1000);
     kh1.withdraw(300);
     kh1.displayBalance();
     kh2.deposit(300);
     kh2.displayBalance();
    }

}
