package quiz2.java;

import static Math.pow;

public class carPayment {
	private static int carCost;
	private static double interestRate;
	private static int downPayment;
	private static double lengthOfLoan;
	private static double monthlyPayment;
	private static double totalInterest;
	
	private static double x = Math.pow(1 + interestRate/12, -lengthOfLoan);

	public static double monthlyPayment(int carCost, double interestRate, int downPayment, int lengthOfLoan) {
		monthlyPayment = ((interestRate/12) * (carCost - downPayment)) / (1 - x);
		return monthlyPayment;
	}
	public static double totalInterest(int monthlyPayment, int lengthOfLoan) {
		totalInterest = (monthlyPayment * lengthOfLoan) - (carCost - downPayment);
		return totalInterest;
	}
}
