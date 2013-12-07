package model;

public class Debt {

	private double interestRate;
	private double total;
	private double minPayment;
	private String note;
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getMinPayment() {
		return minPayment;
	}
	public void setMinPayment(double minPayment) {
		this.minPayment = minPayment;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
