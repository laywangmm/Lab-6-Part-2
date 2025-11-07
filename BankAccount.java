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

    /**
     * No-argument constructor.
     * Sets the monthly interest rate to 0.044 / 12
     * and initializes all other values to 0.
     */
    public BankAccount() {
        monthlyIntRate = 0.044 / 12;
    }

    /**
     * Constructor for whole-dollar starting balances.
     * Divides annual interest rate by 100, then by 12 to set monthlyIntRate.
     *
     * @param inBalance the initial account balance in whole dollars
     * @param intRate the annual interest rate as a percent (for 4.4%)
     */
    public BankAccount(int inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100) / 12;
    }

    /**
     * Constructor for currency starting balances.
     * Divides annual interest rate by 100, then by 12 to set monthlyIntRate.
     *
     * @param inBalance the initial account balance in currency format
     * @param intRate the annual interest rate as a percent (e.g., 4.4 for 4.4%)
     */
    public BankAccount(double inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100) / 12;
    }

    /**
     * Adds an integer deposit to the account.
     *
     * @param add the amount to deposit
     */
    public void makeDeposit(int add) {
        if (add > 0) {
            balance += add;
            deposit += add;
        }
    }

    /**
     * Adds a currency deposit to the account.
     *
     * @param add the amount to deposit
     */
    public void makeDeposit(double add) {
        if (add > 0) {
            balance += add;
            deposit += add;
        }
    }

    /**
     * Subtracts an integer withdrawal from the account.
     *
     * @param sub the amount to withdraw
     */
    public void makeWithdraw(int sub) {
        if (sub > 0) {
            balance -= sub;
            withdraw += sub;
        }
    }

    /**
     * Subtracts a currency withdrawal from the account.
     *
     * @param sub the amount to withdraw
     */
    public void makeWithdraw(double sub) {
        if (sub > 0) {
            balance -= sub;
            withdraw += sub;
        }
    }

    /**
     * Calculates and adds monthly interest to the balance.
     * Interest is only applied if the balance is greater than 0.
     */
    public void calcInterest() {
        if (balance > 0) {
            double m = balance * monthlyIntRate;
            balance += m;
            interest += m;
        }
    }

    /**
     * Gets the current balance.
     *
     * @return the current account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets the total amount deposited.
     *
     * @return the total deposits
     */
    public double getDeposit() {
        return deposit;
    }

    /**
     * Gets the total amount withdrawn.
     *
     * @return the total withdrawals
     */
    public double getWithdraw() {
        return withdraw;
    }

    /**
     * Gets the total interest earned.
     *
     * @return the total interest
     */
    public double getInterest() {
        return interest;
    }
}
