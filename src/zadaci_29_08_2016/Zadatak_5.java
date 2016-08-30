package zadaci_29_08_2016;

public class Zadatak_5 {
	/*
	 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to throw
	 * IllegalArgumentException if the loan amount, interest rate, or number of
	 * years is less than or equal to zero.
	 */

	public static void main(String[] args) {
		// kreiranje test objekta sa zadatim vrijednostima
		Loan test = new Loan(0, 1, 1000);
		System.out.println("Testing loan with IllegalArgumentExceptio");
		// ukoliko ijedan od parametara ne spada u opseg
		if (test.getAnnualInterestRate() <= 0 || test.getNumberOfYears() <= 0
				|| test.getLoanAmount() <= 0) {
			// bacamo exception sa porukom ispod
			throw new IllegalArgumentException(
					"ERROR! All values have to be greated than 0");
		}

	}

}

class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/**
	 * Construct a loan with specified annual interest rate, no-arg constructor
	 * 10.2 Class Abstraction and Encapsulation 369 13 number of years, and loan
	 * amount 14
	 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount
				* monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate,
						numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}