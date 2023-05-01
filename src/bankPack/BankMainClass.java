package bankPack;


import java.util.Scanner;

public class BankMainClass {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER ONLINE BANKING PASSWORD");
		BankOperationClass Online = new BankOperationClass( sc.next());
		Online.pinCheck();
		Online.withdraw();
		Online.depositMoney();
		Online.viewBalance();
		System.out.println("ENTER THE ATM PIN");
		BankOperationClass bankOperaton = new BankOperationClass(sc.nextInt());	
		bankOperaton.pinCheck();	
		bankOperaton.withdraw();
		bankOperaton.depositMoney();
		bankOperaton.viewBalance();
		
		
	}

}
