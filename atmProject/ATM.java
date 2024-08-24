import java.util.*;

class Atmmachine{

        float balance;
        int pin=1234;
        public void checkpin(){
            System.out.println("Enter your pin");
            Scanner sc= new Scanner(System.in);
            int enterpin=sc.nextInt();
            if(enterpin==pin)
            {
                menu();
            }
            else{
                System.out.println("enter a valid pin");
                menu();
            }


        }

        public void menu()
        {
            System.out.println("Enter your choice \n" +
                    "1. Check A/C balance \n" +
                    "2.Withdraw Money \n" +
                    "3.Deposite Money \n" +
                    "4.Exit \n");
            Scanner sc= new Scanner(System.in);
            int inputChoice=sc.nextInt();
            if(inputChoice==1)
            {
                checkBalance();
            }
            else if(inputChoice==2)
            {
                withdraw();
            }
            else if(inputChoice==3)
            {
                deposite();
            }
            else if(inputChoice==4)
            {
                return;
            }
            else{
                System.out.println("enter a valid choice");
            }
        }

        public void checkBalance()
        {

            if(balance==0)
            {
                System.out.println("Out of money");
                menu();
            }
            else{
                System.out.println("Your balance is "+ balance);
                menu();
            }
        }

        public void withdraw()
        {
            System.out.println("enter an amount to withdraw");
            Scanner sc= new Scanner(System.in);
            int draw=sc.nextInt();
            if(balance<draw)
            {
                System.out.println("insufficient balance");
                menu();
            }
            else {
                System.out.println("withdrawing your money....");
                balance-=draw;
                System.out.println("done , remaining balance is "+balance);
                menu();
            }


        }

        public void deposite(){

            System.out.println("enter an amount to deposite");
            Scanner sc=new Scanner(System.in);
            int depo=sc.nextInt();
            balance+=depo;
            System.out.println("done , new balance is "+ balance);
            menu();

        }



}



public class ATM {


    public static void main(String []args)
    {

        Atmmachine test=new Atmmachine();
        test.checkpin();
    }
}
