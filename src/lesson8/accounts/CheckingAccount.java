package lesson8.accounts;

public class CheckingAccount extends Account {
    int limitOfExpenses;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOfExpenses) {
        super(bankName, ownerName, moneyAmount);
        this.limitOfExpenses = limitOfExpenses;
    }

    void withdraw(int amount) {
        if(amount > limitOfExpenses) {
            return;
        } else {
            moneyAmount -= amount;
        }
    }

}
