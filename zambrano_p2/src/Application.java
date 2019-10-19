public class Application {
    public static void main(String [] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        double savings1 = 3000.00;
        double savings2 = 4000.00;

        for(int i = 1; i < 13; i++) {
            System.out.printf("Month %d: %.2f\t", i, saver1.calculateMonthlyInterest(savings1, .04));
            savings1 = savings1 + saver1.calculateMonthlyInterest(savings1, .04);
            System.out.printf("%.2f\n", saver2.calculateMonthlyInterest(savings2, .04));
            savings2 = savings2 + saver2.calculateMonthlyInterest(savings2, .04);
        }

        System.out.printf("Month 13: %.2f\t", saver1.calculateMonthlyInterest(savings1,  .05));
        System.out.printf("%.2f", saver1.calculateMonthlyInterest(savings2, .05));
    }
}
