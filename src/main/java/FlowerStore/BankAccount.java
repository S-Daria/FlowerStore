package FlowerStore;

public class BankAccount {
    private double current_money;

    public BankAccount(double current_money){
        this.current_money = current_money;
    }

    public BankAccount(){ this.current_money = 100; }

    public void setMoney(double money) {
        this.current_money = money;
    }

    public void pay(double bill){
        setMoney(this.current_money - bill);
    }

    public boolean canAfford(double bill){
        if (bill <= this.current_money) { return true; }
        return false;

    }

    public double getMoney() {
        return current_money;
    }
}
