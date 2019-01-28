package entities;

public class Costs {
	
	private String costName;
	private Float costPercent;
	
	
	public Costs() {
		
	}

	public Costs(String costName, Float costPercent) {		
		this.costName = costName;
		this.costPercent = costPercent;
	}

	public String getCostName() {
		return costName;
	}

	public void setCostName(String costName) {
		this.costName = costName;
	}

	public Float getCostPercent() {
		return costPercent;
	}

	public void setCostPercent(Float costPercent) {
		this.costPercent = costPercent;
	}	
	
	public String toString() {
		return "The name: "
				+ this.costName
				+ " the percentage: "
				+ this.costPercent;
	}

}
