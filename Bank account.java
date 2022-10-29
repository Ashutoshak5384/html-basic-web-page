/* Bank Account Program */
import java.util.Scanner;
class Account
{
     String name;
     int acno;
    char type;
    float balance;
    void initialize()
     {
         name="Amit";
         acno=1001;
         type='S';
         balance=1200;
     }
  void deposit(float amt)
    {
         balance=balance+amt;
         System.out.println("Rs. "+amt+" is deposited successfully.");
     }
   void withdraw(float amt)
     {
          if((balance-amt)<1000)
            {
                 System.out.println("Insufficient Balance");
             }
           else
              {
                  balance=balance-amt;
                  System.out.println("Rs. "+amt+" is withdrawn successfully.");
               }
       }
   void show()
     {
         System.out.println("Name :"+name);
         System.out.println("Balance :"+balance); 
     }
}
class BankAccount
{
   public static void main(String args[])
    {
        Account ac=new Account();
       int opt;
       float amt;
       Scanner sc=new Scanner(System.in);
       ac.initialize();
        do
         {
              System.out.println("*******MENU*****");
              System.out.println("1. Deposit\n2. Withdraw\n3. Show\n4. Exit\n");
              System.out.println("Enter your option:");
              opt=sc.nextInt();
              switch(opt)
              {
                  case 1:    System.out.println("Enter the amount:");
                                   amt=sc.nextFloat();
                                   ac.deposit(amt);
                                   break;
                case 2:     System.out.println("Enter the amount:");
                                   amt=sc.nextFloat();
                                   ac.withdraw(amt);
                                   break;
                case 3:
                                 ac.show();
                                  break;
                 default:
                                System.exit(1);
               }
           }while(opt!=4);
            
      }
}
