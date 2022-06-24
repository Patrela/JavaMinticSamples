package model;

/**
 *
 * @author cahuc
 */
public class CoffeeMachine {

    private int coffeeLevel;
    private int ounceValue;
    private int currentMoney;
    private int receivedMoney;
    private int ounceQuantitySold;

    public CoffeeMachine(int coffeeLevel, int ounceValue) {
        this.coffeeLevel = coffeeLevel;
        this.ounceValue = ounceValue;
        currentMoney = 0;
        receivedMoney = 0;
        ounceQuantitySold = 0;
    }

    public void receiveMoney(int money) {
        receivedMoney += money;
    }

    public void receiveOunceQuantity(int quantity) {
        ounceQuantitySold += quantity;
    }

    public void reset() {
        ounceQuantitySold = 0;
        receivedMoney = 0;
    }

    public int sell() {
        coffeeLevel -= ounceQuantitySold;
        currentMoney += price();

        int change = calculateChange();

        reset();
        
        return change;
    }

    public int price() {

        return ounceValue * ounceQuantitySold;
    }
    
    public boolean verifyCoffeLevel(){
     
        if ( coffeeLevel < ounceQuantitySold ){
            return false;
        }else{
            return true;
        }
       
        // return ounceQuantitySold >= coffeeLevel;
    }

    private int calculateChange() {

        return receivedMoney - price();
    }

}
