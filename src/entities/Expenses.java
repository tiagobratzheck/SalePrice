package entities;

public class Expenses {
	
	private String expenseName;
	private Double value;
	
	
	public Expenses() {
		
	}

	public Expenses(String expenseName, Double value) {		
		this.expenseName = expenseName;
		this.value = value;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public String toString() {
		return "The name: "
				+ this.expenseName
				+ " the value: "
				+ this.value;
	}

	
}
