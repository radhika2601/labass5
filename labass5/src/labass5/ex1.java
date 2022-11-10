package labass5;
import java.util.Scanner;
class bankdetails
{
	private String accno;
	private String name;
	private long balance;
	Scanner sc = new Scanner(System.in);   
    public void openAccount() 
    {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();   
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }   
    public void showAccount() 
    {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Balance: " + balance);  
    }  
   
    public void deposit() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
    
    public void withdrawal() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) 
        {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else 
        {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed!!" );  
        }  
    }  
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
 }  
public class ex1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);   
	        System.out.print("How many number? ");  
	        int n = sc.nextInt();  
	        bankdetails C[] = new bankdetails[n];  
	        for (int i = 0; i < C.length; i++) 
	        {  
	            C[i] = new bankdetails();  
	            C[i].openAccount();  
	        }   
	        int ch;  
	        do {  
	            System.out.println("\n ***Banking System Application***");  
	            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	                switch (ch) {  
	           case 1:  
	             for (int i = 0; i < C.length; i++) {  
	         C[i].showAccount();  
	             }  
	            break; 
	         case 2:  
	        	 System.out.print("Enter account no. you want to search: ");  
		         String ac_no = sc.next();  
		          boolean found = false;  
		          for (int i = 0; i < C.length; i++) {  
		               found = C[i].search(ac_no);  
		               if (found){  
		                break;  
		                   }  
		                        }  
		        if (!found) {  
		          System.out.println("Account doesn't exist");  
		         }  
		         break;  
		           case 3:  
		          System.out.print("Enter Account no. : ");  
		           ac_no = sc.next();  
		            found = false;  
		              for (int i = 0; i < C.length; i++) {  
		              found = C[i].search(ac_no);  
		                     if (found) {  
		               C[i].deposit();  
		                break;  
		                 }  }  
			            if (!found) {  
				             System.out.println(" Account doesn't exist!!");  
				                        }  
				                break;  
				          case 4:  
				       System.out.print("Enter Account No : ");  
				          ac_no = sc.next();  
				         found = false;  
				            for (int i = 0; i < C.length; i++) {  
				               found = C[i].search(ac_no);  
				                if (found) {  
				              C[i].withdrawal();  
				               break;  
				                }  
				                        }  
				              if (!found) {  
				           System.out.println("Account doesn't exist");  
				              }  
				              break;  
				           case 5:  
				           System.out.println("See you soon...");  
				           break;  
				  }  
				   }  
			           while (ch != 5);  
	}
}
}

