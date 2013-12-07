package model;

import java.util.HashMap;
import java.util.List;

public class Survey {
	
	private double income;
	private Period payPeriod;
	
	private int zipCode;
	private List<Expenditure> expenditures;
	private List<Debt> debts;
	
	
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public Period getPayPeriod() {
		return payPeriod;
	}
	public void setPayPeriod(Period payPeriod) {
		this.payPeriod = payPeriod;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public List<Expenditure> getExpenditures() {
		return expenditures;
	}
	public void setExpenditures(List<Expenditure> expenditures) {
		this.expenditures = expenditures;
	}
	public List<Debt> getDebts() {
		return debts;
	}
	public void setDebts(List<Debt> debts) {
		this.debts = debts;
	}
	
}
