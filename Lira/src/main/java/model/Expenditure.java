package model;

public class Expenditure {

	private String label;
	private String note;
	private boolean isRecurring;
	private Period paymentPeriod;
	
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public boolean isRecurring() {
		return isRecurring;
	}
	public void setRecurring(boolean isRecurring) {
		this.isRecurring = isRecurring;
	}
	public Period getPaymentPeriod() {
		return paymentPeriod;
	}
	public void setPaymentPeriod(Period paymentPeriod) {
		this.paymentPeriod = paymentPeriod;
	}
	
}
