package Main;
import java.util.Locale;
import java.util.Scanner;
import entities.entities;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		entities account = new entities();
		System.out.println("Enter the number of your account: ");
		int number = sc.nextInt();
		account.setNumber(number);
		System.out.println("Enter your name: ");
		String name = sc.next();
		account.setHolder(name);
		System.out.println("is there na initial deposit(y/n) ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.println("enter a initial deposit value: ");
			double balance = sc.nextDouble();
			account.setBalance(balance);
		
		}else {
			double balance = 0.0;
			account.setBalance(balance);
			System.out.println("updated balance if you choise N: " +account.getBalance());
		}
		System.out.println("Account data. ");
		System.out.println();
		System.out.println("number: " +account.getNumber()+ " ,Holder: " +account.getHolder()+ " ,Balance: " +account.getBalance() );
		
		
		
		System.out.println("want you a deposit some money: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Account updated. ");
		System.out.println();
		System.out.println("number: " +account.getNumber()+ " ,Holder: " +account.getHolder()+ " ,Balance: " +account.getBalance() );
		
		
		
		System.out.println("enter a withdraw value: ");
		double withDraw = sc.nextDouble();
		account.withdraw(withDraw);
		System.out.println("Account updated. ");
		System.out.println();
		System.out.println("number: " +account.getNumber()+ " ,Holder: " +account.getHolder()+ " ,Balance: " +account.getBalance() );
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
