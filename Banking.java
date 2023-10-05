package com.practice;

import java.util.Scanner;

public class Banking {
    int AccountNo;
    String Name;
    int Balance;
    Scanner sc=new Scanner (System.in);

    void CreatAccount(){
        System.out.println("Enter The Account No.  Name  and Balance");
        AccountNo=sc.nextInt();
        sc.nextLine();
        Name=sc.nextLine();
        Balance=sc.nextInt();
    }
    void Display(){
        System.out.println("Account no.:" +AccountNo+"  "+  "Name Of Account holder :"+Name+"  "+   "Available balance :"+Balance);
    }
    void CheckBalance(){
        System.out.println("Available Balance :"+Balance);
    }
    void Withdrawl(int amount){
        Balance=Balance-amount;
        System.out.println("Successfully Withdrawl...");

    }
    void Deposite(int amount){
       Balance=Balance+amount;
       System.out.println("Successfully deposited....");
    }
    void transfer(int amount){
        if(amount<Balance){
       Balance=Balance-amount;
        }else{
            System.out.println("can't transfer...");
            
        }
        System.out.println("Successfull Transfered...");
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        int cnt=0;
        int acc,amt;
        Banking obj[]=new Banking[10];
        int count=0;
        for(int i=0;i<10;i++)
            obj[i]=new Banking();
            while(true){
                System.out.println("Enter your Choice:");
                System.out.println("1:creat Account  2:Deposite   3:Withdrawl  4:Transfer   5:Check Balance  6:Display  7:Exit");
                ch=sc.nextInt();
                switch(ch){
                    case  1:
                    if(count>9)
                    System.out.println("You can't creat more than 10 Accounts");
                    
                    else{
                    obj[count].CreatAccount();
                        count++;

                    }
                    break;
                    case 2:
                    System.out.println("Enter the Account number:");
                    acc=sc.nextInt();
                    for(Banking x:obj){
                       if(x.AccountNo==acc){
                        System.out.println("Enter the deposite Amount..");
                        amt=sc.nextInt();
                        obj[cnt].Deposite(amt);
                        break;

                       }
                       cnt++;
                    }
                    if(cnt==10){
                        System.out.println("you enter invalid Acount number...");
                    }
                    break;
                    case 3:
                    System.out.println("withdrawl");
                       System.out.println("Enter the Account number:");
                    acc=sc.nextInt();
                    for(Banking x:obj){
                       if(x.AccountNo==acc){
                        System.out.println("Enter the withdrawl Amount..");
                        amt=sc.nextInt();
                        obj[cnt].Withdrawl(amt);
                        break;

                       }
                       cnt++;
                    }
                    if(cnt==10){
                        System.out.println("you enter invalid Acount number...");
                    }
                    
                    

                    break;
                    case 4:
                    System.out.println("Transfer");
                      
                       System.out.println("Enter the Account number:");
                    acc=sc.nextInt();
                    for(Banking x:obj){
                       if(x.AccountNo==acc){
                        System.out.println("Enter the Transfer Amount..");
                        amt=sc.nextInt();
                        obj[cnt].transfer(amt);
                        break;

                       }
                       cnt++;
                    }
                    if(cnt==10){
                        System.out.println("you enter invalid Acount number...");
                    }
                    break;
                    case 5:
                    cnt=0;
                    System.out.println("Enter the Account number..");
                    acc=sc.nextInt();
                    for(Banking x:obj){
                        if(x.AccountNo==acc){
                            obj[cnt].CheckBalance();
                            break;
                        }
                        cnt++;
                    }
                    if(cnt==10){
                        System.out.println("you entered invalid account no:");
                    }
                    break;
                    case 6:
                    cnt=0;
                    System.out.println("Enter the Account number...");
                    acc=sc.nextInt();
                    for(Banking x:obj){
                        if(x.AccountNo==acc){
                            obj[cnt].Display();
                            break;
                        }
                        cnt++;
                    }
                    if(cnt==10){
                        System.out.println("you Entered invalid Account number...");
                    }
                    break;
                    case 7:
                    System.out.println("Exit");
                    break;
                    default:
                    System.out.println("invalid input");
                }
                if(ch==7){
                    break;
                }
            }

        
    }

}
