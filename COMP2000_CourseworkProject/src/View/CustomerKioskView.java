package View;

import javax.swing.*;
import java.awt.*;

public class CustomerKioskView {

    //region CustomerKioskView GUI JAttributes
    public JPanel MainKioskPanel;
    public JPanel KioskPanel;
    public JPanel CashPaymentPanel;
    public JPanel CardPaymentPanel;
    public JPanel ReceiptPanel;

    private JButton btnKioskAdd;
    public JButton btnCardPurchases;
    public JButton btnCashPurchase;
    public JButton btnKioskReturn;
    public JButton btnSubmitCash;
    public JButton btnCardSubmit;

    public JTextField txtKioskStockName;
    public JTextField txtKioskPrice;
    private JTextField txtCashAmount;
    public JTextField txtCardName;
    public JTextField txtCardNumber;
    public JTextField txtBarcodeScan;

    public JList lstAllPurchasedStock;
    public JList lstShoppingCart;

    private JLabel lblCompanyName;
    private JLabel lblCurrentDate;
    private JLabel lblPaymentChoice;
    private JLabel lblCashChange;
    private JLabel lblTotalCost;
    private JComboBox cbBank;
    //endregion

    public JFrame kioskFrame;
    CardLayout cardLayout = new CardLayout();

    public CustomerKioskView(String AdminMenu){
        //Set our card layout and add our Panels to it!
        MainKioskPanel.setLayout(cardLayout);
        MainKioskPanel.add(KioskPanel, "CustomerKioskPanel");
        MainKioskPanel.add(CardPaymentPanel, "CardPaymentPanel");
        MainKioskPanel.add(CashPaymentPanel, "CashPaymentPanel");
        MainKioskPanel.add(ReceiptPanel, "ReceiptPanel");
        cardLayout.show(MainKioskPanel, "1");

        //Create our form layout
        kioskFrame = new JFrame(AdminMenu);
        kioskFrame.add(MainKioskPanel);
        kioskFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kioskFrame.setSize(500, 500);
        kioskFrame.setLocationRelativeTo(null);
        kioskFrame.pack();
        kioskFrame.setVisible(true);
    }

    //region Get/Set Methods

    public CardLayout getCardLayout(){
        return cardLayout;
    }

    //region TextField Get/Sets
    public JTextField getTxtBarcodeScan(){
        return txtBarcodeScan;
    }

    public void setTxtBarcodeScan(JTextField txtBarcodeScans){
        this.txtBarcodeScan = txtBarcodeScans;
    }

    public JTextField getTxtCashAmount(){
        return txtCashAmount;
    }

    public void setTxtCashAmount(JTextField txtCashAmount){
        this.txtCashAmount = txtCashAmount;
    }

    public JComboBox getCbBank(){
        return cbBank;
    }

    public void setCbBank(JComboBox cbBank){
        this.cbBank = cbBank;
    }

    public JTextField getTxtCardName(){
        return txtCardName;
    }

    public void setTxtCardName(JTextField txtCardNames){
        this.txtCardName = txtCardNames;
    }

    public JTextField getTxtCardNumber(){
        return txtCardNumber;
    }

    public void setTxtCardNumber(JTextField txtCardNumber){
        this.txtCardNumber = txtCardNumber;
    }

    //endregion

    //region JButtons Get/Sets
    public JButton getBtnKioskAdd(){
        return btnKioskAdd;
    }

    public JButton getBtnCardPurchases(){
        return btnCardPurchases;
    }

    public JButton getBtnCashPurchase(){
        return btnCashPurchase;
    }
    //endregion

    //region JList Get/Sets
    public JList getLstShoppingCart(){
        return lstShoppingCart;
    }

    public void setLstAllPurchasedStock(JList purchasedStock){
        this.lstShoppingCart = purchasedStock;
    }
    //endregion

    //endregion
}
