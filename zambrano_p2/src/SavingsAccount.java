public class SavingsAccount {
    private double savingsBalance;
    static double annualInterestRate = .04;

    public double calculateMonthlyInterest(double savings, double annualInterestRate) {
        double total = (savings * annualInterestRate) / 12;
        savingsBalance = savingsBalance + total;

        return savingsBalance;
    }

    public static double modifyInterestRate(double interest) {

        annualInterestRate = interest;
        return interest;
    }

}
