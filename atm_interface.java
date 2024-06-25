import java.util.Scanner;

public class atm_interface {
    private double balance;

    public atm_interface(double initial_balance){
        this.balance=initial_balance;
    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdrawn: "+amount);
        }
        else
        {
            System.out.println("Invalid amount for withdrawal or insufficient balance");
        }
    }

    public void deposit(double amount)
    {
      if (amount>0)
      {
          balance+=amount;
          System.out.println(amount+" deposited successfully");
      }
      else
      {
          System.out.println("Invalid amount for deposit");
      }
    }

    public void check()
    {
        System.out.println("Current Balance "+balance);
    }
    public static void main(String args[]) {
        int choice;
        System.out.print("Enter Initial Balance: ");
        Scanner sc=new Scanner(System.in);
        double initial_bal=sc.nextDouble();

        atm_interface obj=new atm_interface(initial_bal);

        do {
            System.out.print("\nATM Interface\n\n1. Withdraw Amount\n2. Deposit Amount\n3. Ckeck Balance");
            System.out.print("\n\nChoose from above option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    double dep_amt;
                    System.out.print("Enter amount: ");
                    dep_amt = sc.nextInt();
                    obj.withdraw(dep_amt);
                    break;
                case 2:
                    double withdraw_amnt;
                    System.out.print("Enter amount: ");
                    withdraw_amnt = sc.nextInt();
                    obj.deposit(withdraw_amnt);
                    break;
                case 3:
                    obj.check();
                    break;
                case 4:
                    System.out.println("Existing ATM. Thank you!");
                    System.exit(0);
                default:
                    System.out.print("Invalid choice");
            }
        }while(choice!=0);
        //System.out.println(amount);
    }
}
