package entities;


public abstract class TaxPayer  {
	
	protected String name;
	protected Double anualIncome;
	
	public TaxPayer() {
		
	}
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCurrentIncome() {
		return anualIncome;
	}

	public void setCurrentIncome(Double currentIncome) {
		this.anualIncome = currentIncome;
	}
	
	
	public abstract double taxesPaid();
	
	
}

