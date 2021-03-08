package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.TaxPayer;
import entities.Individual;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number tax payers: ");
		int n = read.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = read.next().charAt(0);
			System.out.print("Name: ");
			read.nextLine();
			String name = read.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = read.nextDouble();
			if (type == 'c') {
				System.out.println("Number of employees:");
				int numberEmployees = read.nextInt();
				list.add(new Company(name, anualIncome, numberEmployees));
			}
			else if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = read.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
		
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTaxes = 0.0;
		for (TaxPayer per : list) {
			System.out.println(per.getName()+": $ "+String.format("%.2f", per.taxesPaid()));
			totalTaxes =+ per.taxesPaid();
		}
		    System.out.println();
		    System.out.println("TOTAL TAXES: $ "+String.format("%.2f", totalTaxes));
		
		
		read.close();
	}
}