package View.AdminSection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdminView  {

    //region GUI JAttributes
    public JFrame adminFrame;
    public JPanel AdminPanel;
    public JPanel LoginPanel;
    public JPanel AdminDatabasePanel;
    public JTabbedPane adminTabbedPane;

    private JTextField txtUsername;
    private JTextField txtPassword;
    private JTextField txtAdminBarcode;
    private JTextField txtAdminStockName;
    private JTextField txtAdminQuantity;
    private JTextField txtAdminPrice;
    public JTextField txtEditBarcode;
    public JTextField txtEditName;
    public JTextField txtEditQuantity;
    public JTextField txtEditPrice;
    public JTextField txtViewBarcode;
    public JTextField txtViewName;
    public JTextField txtViewQuantity;
    public JTextField txtViewPrice;
    private JLabel lblDetailsIncorrect;

    private JButton btnLogin;
    private JButton btnExit;
    private JButton btnAdminSubmit;
    private JButton btnRemoveItem;
    private JButton btnEditItem;
    private JButton btnAddItem;
    public JButton btnRefresh;
    public JButton btnDelivery;

    public JList lstStockEditDisplay;
    public JList lstDisplayStock;
    public JTable tblAdminEdit;
    public JTable tblAdminView;
    //endregion

    CardLayout cardLayout = new CardLayout();

    public AdminView(String AdminMenu){
        //Create the principle form
        AdminPanel.setLayout(cardLayout);
        AdminPanel.add(LoginPanel, "AdminLoginPage");
        AdminPanel.add(AdminDatabasePanel, "AdminDatabasePage");
        cardLayout.show(AdminPanel, "1");

        //Create the principle form
        adminFrame = new JFrame(AdminMenu);
        adminFrame.add(AdminPanel);
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminFrame.setSize(650, 400);
        adminFrame.setVisible(true);

        GUIMethods();
    }

    //region AdminView GUI Methods
    public void GUIMethods(){
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });
    }
    //endregion

    //region Get/Set Methods
    //region CardLayout Get/Set Methods
    public CardLayout getCardLayout(){
        return cardLayout;
    }
    //endregion

    //region Get/Set Admin Username & Password Methods
    public JTextField getTxtUsername(){
        return txtUsername;
    }

    public void setTxtUsername(JTextField username){
        txtUsername = username;
    }

    public JTextField getTxtPassword(){
        return txtPassword;
    }

    public void setTxtPassword(JTextField password){ txtPassword = password;
    }
    //endregion

    //region Button Get/Set Methods
    public JButton getBtnAddItem(){
        return btnAddItem;
    }

    public JButton getBtnRemoveItem(){
        return btnRemoveItem;
    }

    public JButton getBtnEditItem(){
        return btnEditItem;
    }

    public JButton getBtnLogin(){
        return btnLogin;
    }
    //endregion

    //region Text Box and label Boxes Get/Set Methods
    public JTextField getTxtAdminBarcode(){
        return txtAdminBarcode;
    }

    public void setTxtAdminBarcode(JTextField barcode){
        txtAdminBarcode = barcode;
    }

    public JTextField getTxtAdminStockName(){
        return txtAdminStockName;
    }

    public void setTxtAdminStockName(JTextField stockName){
        txtUsername = stockName;
    }

    public JTextField getTxtAdminQuantity(){
        return txtAdminQuantity;
    }

    public void setTxtAdminQuantity(JTextField adminQuantity){
        txtUsername = adminQuantity;
    }

    public JTextField getTxtAdminPrice(){
        return txtAdminPrice;
    }

    public void setTxtAdminPrice(JTextField adminPrice){
        txtUsername = adminPrice;
    }

    public JLabel getLblDetailsIncorrect(){
        return lblDetailsIncorrect;
    }

    //endregion
    //endregion
}
