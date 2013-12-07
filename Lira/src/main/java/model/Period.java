package model;

public enum Period {
	WEEKLY("Weekly"),
	BIWEEKLY("Biweekly"),
	MONTHLY("Monthly"),
	ANNUALLY("Annually");
	
	private String label;
	
	private Period(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
}
