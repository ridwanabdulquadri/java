package paperBoy;

public class SimpleWalletClass {
    private float value;

    public void setValue(float newValue){
        value = newValue;
    }
    public void addMoney(float deposit){
        value += deposit;
    }
    public void subtractMoney(float withdraw){
        value -= withdraw;
    }

}
