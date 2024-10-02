
import java.util.Scanner;
public class Lab6_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        BankAccount[] sd = new BankAccount[5];
        for(int i =0 ;i<1;i++){
            sd [i] = new BankAccount();
        }
       
    } 

}
class BankAccount{
    int accountNumber;
    String Name="";
    int balance;
    public BankAccount(){

        Scanner st = new Scanner(System.in);
        System.out.println("Enter AccountNumber");
        accountNumber = st.nextInt();
        System.out.println("Enter Name");
        Name = st.next();
        balance = 0;
        deposit(balance);
        st.close();
      
    }
    public void deposit(int balance){
       
        Scanner sp = new Scanner(System.in);
        System.out.println("Enter Deposit");
        int deposits = sp.nextInt();
        balance = balance + deposits;
        withdraw(balance);
        sp.close();
       
    }
    public void withdraw(int balance){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter Withdraw");
        int withdraws = sr.nextInt();
        balance = balance - withdraws;
        check_balance(balance);
        sr.close();
        
    }
    public void check_balance(int balance){
        System.out.println("Balance = "+balance);
    }

}