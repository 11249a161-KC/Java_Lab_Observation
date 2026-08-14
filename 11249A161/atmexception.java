class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}

class ATM
{
    private double balance;

    public ATM(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if (amount > balance)
        {
            throw new InsufficientBalanceException(
                "Transaction Failed: Requested Amount (Rs" + amount + ") exceeds current balance (Rs" + balance + ")"
            );
        }
        balance -= amount;
        System.out.println("Withdrawl successful! Remaining balance Rs" + balance);
    }
    public double getBalance()
    {
        return balance;
    }
}

public class atmexception 
{
    public static void main(String[] args) {
        ATM userATM = new ATM(20000);

        try
        {
            System.out.println("Attempting to withdraw 10000");
            userATM.withdraw(10000);
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            System.err.println("\nAttempting to withdraw 15000");
            userATM.withdraw(15000);
        }
        catch(InsufficientBalanceException e)
        {
            System.err.println(e.getMessage());
        }
    }    
}
