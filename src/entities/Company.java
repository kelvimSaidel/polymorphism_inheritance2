package entities;


public class Company extends TaxPayer {
	
	private int numberEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double taxesPaid() {
		double taxesPaid = ((numberEmployees > 10) ? anualIncome*0.14 : anualIncome*0.16);
		return taxesPaid;
	}

	
	
	
	
	
}