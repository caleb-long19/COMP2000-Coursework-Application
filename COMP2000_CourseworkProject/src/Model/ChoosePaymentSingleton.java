package Model;

public class ChoosePaymentSingleton {
    private static ChoosePaymentSingleton instance;

    //booleans
    private boolean cardOption = false;
    private boolean cashOption = false;

    private void ChoosePaymentSingleton(){}

    public static ChoosePaymentSingleton getInstance(){
        if(instance == null){
            instance = new ChoosePaymentSingleton();
        }
        return instance;
    }

    //region Boolean Get/Set Methods to determine what card payment has been chosen
    public boolean getCardOption(){
        return cardOption;
    }

    public void setCardOption(boolean cardOption){
        this.cardOption = cardOption;
    }

    public boolean getCashOption(){
        return cashOption;
    }

    public void setCashOption(boolean cashOption){
        this.cashOption = cashOption;
    }
    //endregion
}
