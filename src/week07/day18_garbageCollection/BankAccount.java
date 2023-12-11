package week07.day18_garbageCollection;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountName, long accountNumber) {
        this.accountHolder = accountName;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountName='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: $"+balance);
    }


    public void deposit(double amount){

        if(amount < 1){
            System.out.println("Insufficient deposit amount: "+amount);
            return;
        }

        System.out.println("Depositing $"+amount +" to "+accountHolder);
        balance += amount;
    }

    public void withdraw(double amount){

        if(amount > balance){
            System.out.println("Insufficient withdraw amount: "+amount);
            return;
        }


        System.out.println("Withdrawing $"+amount +" from "+accountHolder);
        balance -= amount;
    }

}
