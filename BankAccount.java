/**
 * Models a savings bank account that tracks current balance,
 * total deposits, total withdrawals, and total interest earned.
 * Interest compounds monthly using a monthly rate derived from
 * an APR provided by the user (percent).
 *
 * @author Layipaun Wang
 * @version v1.0
 * @since 11/6/2025
 */
 public class BankAccount {
    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;
    private double monthlyIntRate;

    public BankAccount() {
        monthlyIntRate = 0.044 / 12;
    }

    public BankAccount(int inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100) / 12;
    }

    public BankAccount(double inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100) / 12;
    }

    public void makeDeposit(int add) {
        if (add > 0) {
            balance += add;
            deposit += add;
        }
    }

    public void makeDeposit(double add) {
        if (add > 0) {
            balance += add;
            deposit += add;
        }
    }

    public void makeWithdraw(int sub) {
        if (sub > 0) {
            balance -= sub;
            withdraw += sub;
        }
    }

    public void makeWithdraw(double sub) {
        if (sub > 0) {
            balance -= sub;
            withdraw += sub;
        }
    }

    public void calcInterest() {
        if (balance > 0) {
            double m = balance * monthlyIntRate;
            balance += m;
            interest += m;
        }
    }

    public double getBalance() { return balance; }
    public double getDeposit() { return deposit; }
    public double getWithdraw() { return withdraw; }
    public double getInterest() { return interest; }
}