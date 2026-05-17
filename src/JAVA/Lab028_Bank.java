package JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab028_Bank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Bank> accounts=new ArrayList<>();
        System.out.println("Enter account holder name");
        String accholdername=scanner.nextLine();

        System.out.println("Enter intial balance");
        long intialbalance=scanner.nextLong();
        scanner.nextLine();

        Bank b=new Bank(accholdername,intialbalance);



        int choice;


        do {

            System.out.println("==== Welcome To Apna Bank ====");
            System.out.println("Please Enter Yuor Choice");
            System.out.println("1. Check your Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Add Fund");
            System.out.println("4. Exit");

            choice=scanner.nextInt();


            switch (choice)

            {
                case 1:
                    System.out.println(b.getBalance());
                    break;

                case 2:
                    System.out.println("Please Enter amount to withdraw");
                    int amount=scanner.nextInt();
                    System.out.println(amount+" has been debited");

                    b.withdrawAmount(amount);
                    System.out.println("Your current balance is "+b.getBalance());
                    break;

                case 3:
                    System.out.println("Enter amount to add");
                    int amt=scanner.nextInt();
                    System.out.println(amt+" has been credited");
                    b.addFund(amt);
                    System.out.println("Your current balance is "+b.getBalance());
                    break;



            }


        }while (choice!=4);

            scanner.close();





    }


}

class Bank
{
    private String accHolderName;
    private long balance;

    public Bank(String accHolderName, long balance) {
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int withdrawAmount(int withdrawamount)
    {
        if(withdrawamount<balance)
        {
            balance=balance-withdrawamount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
        return withdrawamount;
    }

    public void addFund(int amt)
    {
        balance=balance+amt;
    }


}


