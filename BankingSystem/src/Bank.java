import java.util.*;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		BankAccount obj1=new BankAccount("XYZ","1AAb");
		obj1.showMenu();


	}
}
      class BankAccount
	  {
		  int balance;
		  int previoustransaction;
		  String customerName;
		  String customerid;
		  
		    BankAccount(String name,String id)
		    {
		    	 customerName=name;
		    	 customerid=id;
		    }
		  
		  void deposit(int amount)
		  {
			    if(amount!=0)
			    {
			    	balance+=amount;
			    	previoustransaction=amount;
			    }
		  }
		     void withdraw(int amount)
		     {
                         if(amount!=0)
				    {
				    	balance-=amount;
				    	previoustransaction=-amount;
				    }
			 }
		        void getPreviousTransaction()
		        {
		        	  if(previoustransaction>0)
		        	  {
		        		  System.out.println("Deposited:" +previoustransaction);
		        	  }
		        	  else  if(previoustransaction < 0)
		        	  {
		        		  System.out.println("Withdrawn:" +Math.abs(previoustransaction));
		        	  }
		        	  else
		        	  {
		        		  System.out.println("No transaction took place");
		        	  }
		          }
		          void showMenu()
		          {
		        	  char options='\0';
		        	  Scanner scanner=new Scanner(System.in);
		        	  System.out.println("Welcome"  + customerName);
		        	  System.out.println("Your id is"+customerid);
		        	  System.out.println("\n");
		        	  System.out.println("A: Check Balance");
		        	  System.out.println("B: Deposit");
		        	  System.out.println("C: Withdraw");
		        	  System.out.println("D: PreviousTransaction");
		        	  System.out.println("E: Exit");
		        	  
		        	  do
		        	  {
		        		  
	  System.out.println("===========================================================================");
	  System.out.println("Enter an option");
		        		  System.out.println("========================================================================"); 
						options=scanner.next().charAt(0);
						 System.out.println("/n");
		        		  
						 
						 switch(options)
						 {
						   case 'A':
							   System.out.println("========================================================================");
							   System.out.println("Balance ="+balance);
							   System.out.println("========================================================================");
								 System.out.println("/n");
								 break;
								
						   case 'B':
							   System.out.println("========================================================================");
							   System.out.println("Enter an amount to deposit");
							   System.out.println("========================================================================");
							   int amount=scanner.nextInt();
							   deposit(amount);
								 System.out.println("/n");
								 break;
								 
						   case 'C':
							   System.out.println("========================================================================");
							   System.out.println("Enter an amount to withdraw");
							   System.out.println("========================================================================");
							   int amount2=scanner.nextInt();
							   withdraw(amount2);
								 System.out.println("/n");
								 break;
								 
						   case 'D':
							   System.out.println("========================================================================");
							   getPreviousTransaction();
							   System.out.println("========================================================================");
							   System.out.println("/n");
							   break;
						   
						   case 'E':
							   System.out.println("**************************************************************************");
							   break;
							   
						  default :
							  System.out.println("Invalid option !!Please try again");
							  break;
							   	
				 }
		        	  }
		        	  
		        	     while(options !='E');
		        	     {
		        	    	 System.out.println("Thankyou for using our services");
		        	     }
		          }
	  }
		        

		        	  
		        	  
		          
		     
		     
	  


