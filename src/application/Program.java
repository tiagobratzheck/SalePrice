package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Costs;
import entities.Expenses;
import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		startSystem();

	}

	public static void startSystem() {
		System.out.println("System has started!");
		System.out.println("");
		menu();
	}

	public static void menu() {
		
		System.out.println("In this part of the system, you will enter the amount of variable"
				+ " costs and expenses of the product. You need to enter the name, percentage and value.");
		System.out.println("");
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter the unit cost of the product: ");
			Double unit = input.nextDouble();
			System.out.println("Enter the margin you prefer (without %): ");
			Double margin = input.nextDouble();
			Product product = new Product(unit, margin);
			
			System.out.print("Enter the number of variable costs: ");
			int numberCosts = input.nextInt();
						
			for(int i = 1; i <= numberCosts; i++) {
				System.out.print("Cost name: ");
				String name = input.next();
				System.out.print("Percentage (without %): ");
				float percent = input.nextFloat();
				Costs cost = new Costs(name, percent);
				product.addCosts(cost);
											
			}
			
			System.out.print("Enter the number of fixed expenses: ");
			int numberExpenses = input.nextInt();
			for(int i = 1; i <= numberExpenses; i++) {
				System.out.print("Expense name: ");
				String name = input.next();
				System.out.print("Value: ");
				Double value = input.nextDouble();
				Expenses expense = new Expenses(name, value);
				product.addExpenses(expense);
						
			}		
			System.out.println("The unit price of product is: "+String.format("%.2f",product.mud()));
			System.out.println("The break point of product em number of sales is: "+String.format("%.2f",product.breakPoint()));
			//product.checkingUnitCost();
		}
		catch(InputMismatchException e) {
			 System.out.println("Exception gotten: " + e);
			 menu();
		}
						
		input.close();
	}
		
}
