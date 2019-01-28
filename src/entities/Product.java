package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private Double priceProduct;
	private Double unitCost;
	private static Double salePrice = 1.0;
	private Double margin;
	
	List<Costs> costs = new ArrayList<>();
	List<Expenses> expenses = new ArrayList<>();
	
	
	public Product() {
		
	}
	
	public Product(Double unitCost, Double margin) {		
		this.unitCost = unitCost;
		this.margin = margin;
	}

	public Double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(Double priceProduct) {
		this.priceProduct = priceProduct;
	}
	
	public Double getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Double unitCost) {
		this.unitCost = unitCost;
	}

	public static Double getSalePrice() {
		return salePrice;
	}

	public Double getMargin() {
		return margin;
	}

	public void setMargin(Double margin) {
		this.margin = margin;
	}

	public List<Costs> getCosts() {
		return costs;
	}
	
	public List<Expenses> getExpenses() {
		return expenses;
	}
	
	public void addCosts(Costs cost) {
		costs.add(cost);
	}
	
	public void addExpenses(Expenses expense) {
		expenses.add(expense);
	}
	
	public Double mud() {
		Double totalCost = 0.0;
		for(Costs cost : costs) {
			totalCost += cost.getCostPercent();
		}
		Double mud = Product.salePrice - (totalCost / (double) 100);		
		return calculatePrice(mud);
	}
	
	public Double calculatePrice(Double mud) {
		Double price = (this.unitCost / mud);
		this.priceProduct = price;
		return this.priceProduct;
	}
		
	public Double breakPoint() {
		Double unitMargin = this.priceProduct * (this.margin / 100);
		Double totalExpenses = 0.0;
		for(Expenses expense : expenses) {
			totalExpenses += expense.getValue();			
		}
		Double breakEvenPoint = (totalExpenses / unitMargin);
		return breakEvenPoint;
	}
	
	public Double checkingUnitValue() {
		Double unitEarning = this.priceProduct * (this.margin / 100);
		return unitEarning;
	}
	
	/*public void checkingUnitCost() {
		for(Costs cost : costs) {
			System.out.printf(cost.getCostName() + cost.getCostPercent());
		}
	}*/
	
			
}
