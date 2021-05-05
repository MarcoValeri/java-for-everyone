public class Overdraft {
    
    public static void main(String[] args) {
        
        int balance = 10000;
        int amount = -100;

        if (amount < 0) {
            throw new IllegalArgumentException("Amount should be not negative");
        } else {
            balance = balance + amount;
            System.out.println("Balance: " + balance);
        }

    }

}
