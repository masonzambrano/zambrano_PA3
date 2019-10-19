public class Application {
    public static void main(String [] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        for(int i = 0; i < 12; i++) {
            System.out.print(saver1.calculateMonthlyInterest(3000.00, .04) + "\t");
            System.out.print(saver2.calculateMonthlyInterest(4000.00, .04) + "\n");
        }

        System.out.print(saver1.calculateMonthlyInterest(3000.00,  .05)+ "\t");
        System.out.print(saver1.calculateMonthlyInterest(4000.00, .05));
    }
}
