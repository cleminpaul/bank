package bankPack;

import java.util.Scanner;

public class BankOperationClass {
	public int actualCode = 4567;
	public int EnteredCode;
	public int enterOnlinePass;
	public int withdrawn;
	public String savePin;
	public String onlinePass = "clemin";
	public int balanceAmt =5000;
	public int deposit; 
	boolean depo;
	boolean withd;
	public boolean transation = true;
	public boolean depoTransaction = true;
	Scanner sc = new Scanner(System.in);
	
	
	
	public BankOperationClass(int enteredpin) {		
		this.EnteredCode = enteredpin;
	}
	public BankOperationClass(String enterpin) {
	this.savePin=enterpin;
	
	}
		
	
	
	//password check atm
	public void pinCheck( ) {
		for(int counter = 1;counter<=3;counter++)
		{
			if(actualCode==EnteredCode) {
				if(onlinePass==savePin) {
				System.out.println("Entered password is correct");
				
				break;
				}
			}
			else if(counter ==3 ) { 
			System.out.println("card blocked ");
			}
			else
			{
				System.out.println("entered pin incorrect");
			}
			break;
		}
	
	}


//withdraw money
	public void withdraw( ) {
		if(actualCode==EnteredCode||onlinePass==savePin) {
		System.out.println("withdraw sevice you need true/false");
		withd=sc.nextBoolean();
		System.out.println("ENTER THE PINCODE AGAIN TO CONTINUE THE PROCESS:-");
		EnteredCode=sc.nextInt();
		}
		
		 if(withd==transation&&actualCode==EnteredCode|| onlinePass==savePin) {			
			System.out.println("Enter the withdrawn amount");
			withdrawn = sc .nextInt();
		 	}
		 	 if(withd==transation && withdrawn<=balanceAmt) {
				 System.out.println("Cash withdrawn amount="+withdrawn);
				 balanceAmt-=withdrawn;
			 }
			 else 
			 {
			System.out.println("Insufficient Balance OR no service needed");
			 }
			}
		
	
	//deposit money
	public void depositMoney( ) {
		if(actualCode==EnteredCode) {
			System.out.println("Deposit sevice you need true/false");
			depo=sc.nextBoolean();
			System.out.println("ENTER THE PINCODE AGAIN TO CONTINUE THE PROCESS:-");
			EnteredCode=sc.nextInt();
			}
			if(depo==depoTransaction&&actualCode==EnteredCode) {
			
			System.out.println("enter the depost amount ");
			deposit = sc.nextInt();
			balanceAmt+=deposit;
			System.out.println("cash deposited"+deposit);
			
			}
			else
			{
				System.out.println("no service needed");
			}
		
	}
	//view the current balance
	public void viewBalance() {
		System.out.println("current balance of your account is" +balanceAmt);
		
	}
}
