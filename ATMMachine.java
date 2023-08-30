import java.util.*;
public class ATMMachine
{
    public static void main(String[] args)
    {
        ATM obj = new ATM(1000, 1906);
        obj.options();
    }
}

class ATM
{
    Scanner sc = new Scanner(System.in);
    
    float balance;
    int pin;

    ATM(float balance, int pin)
    {
        System.out.println("Welcome to your ATM Interface!");
        this.balance = balance;
        this.pin = pin;
    }

    public void options()
    {
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int op = sc.nextInt();

        switch(op)
        {
            case 1: checkBalance();
                    break;
            case 2: withdraw();
                    break;
            case 3: deposit();
                    break;
            case 4: System.out.println("Thanks for your visit!"); 
                    System.exit(0);
                    break;
            default: System.out.println("Invalid Choice! \n"); 
                     options(); 
        }
    }

    public void checkBalance()
    {
        System.out.println("Current Balance: " + balance);
        options();
    }

    public void withdraw()
    {
        System.out.print("Enter Amount to be withdrawn: ");
        float amount = sc.nextFloat();

        if(balance > amount)
        {
            balance = balance - amount;
            System.out.println("Money Withdrawn Successfully!");
            options();
        }
        else
        {
            System.out.println("Insufficient Balance! Try depositing first.");
            options();
        }
    }

    public void deposit()
    {
        System.out.print("Enter Amount to be deposited: ");
        float amount = sc.nextFloat();

        balance = balance + amount;
        System.out.println("Money Deposited Successfully!");
        options();
    }
}