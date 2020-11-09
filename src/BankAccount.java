public class BankAccount {
    private AccountOwner accountOwner;
    private double balance;
    private long accountNumber;

    public BankAccount(AccountOwner accountOwner, double balance){
        this.balance = balance;
        this.accountOwner = accountOwner;
    }

    public int deposit(double amount){
        if(amount <= 0){
            return 2;
        }
        else{
            balance += amount;
            return 1;
        }
    }

    public int withdraw(double amount){
        if(amount <= 0){
            return 2;
        }
        else if (amount > balance){
            return 3;
        }else{
            balance -=amount;
            return 1;
        }
    }

    public int transfer(long account, double amount){
        if(amount <= 0){
            return 2;
        }
        else if (amount > balance){
            return 3;
        }
        else{
            balance -= amount;
            return 1;
        }
    }

    public String getMaskedAccountNumber(){
        String num = Long.toString(accountNumber);
        num = num.substring(Math.max(0,num.length()-4), num.length());
        return "****" + String.format("%04d", Integer.parseInt(num));
    }

    public java.lang.String getFormattedBalance(){
        return "$" + String.format("%,.2f", balance);
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public AccountOwner getAccountOwner(){
        return accountOwner;
    }

    public double getBalance(){
        return balance;
    }
}
